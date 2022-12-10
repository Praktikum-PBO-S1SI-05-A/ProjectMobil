/**
 * @author YASYKUR MF
 *
 * Class MiniBus
 */

package praktikum.pbo.projectmobil;


public class MiniBus extends Sedan implements InterfaceBus {
    
    private String tipe;
    private InterfaceBus interfaceBus;

    public MiniBus() {
    }

    public MiniBus(String tipe, int kapasitasPenumpang, int kapasitasBagasi, String noPlat, String merk, float pajak, String fasilitasKeamanan, String fasilitasKenyamanan, int kapasitasCC) {
        super(fasilitasKeamanan, fasilitasKenyamanan, kapasitasCC, noPlat, merk, pajak);
        this.tipe = tipe;
        interfaceBus = new Bus(kapasitasPenumpang, kapasitasBagasi, noPlat, merk, pajak);
    }
    
    public void infoMinibus() {
        
        switch (tipe) {
            case "Pribadi" -> System.out.println("Tipe MiniBus        : Pribadi, digunakan sebagai kendaraan pribadi");
            case "Wagon" -> System.out.println("Tipe MiniBus        : Wagon, digunakan sebagai kendaraan angkut/travel");
            default -> System.out.println("Tipe MiniBus        : Tipe tidak sesuai!");
        }
    }
    
    @Override
    public void infoBus() {
        
        interfaceBus.infoBus(); //Parent: Bus
    }
    
    @Override
    public void tampilInfo() {
        
        super.tampilInfo(); //Parent: Sedan
        infoBus();
        infoMinibus();
    }
    
    @Override
    public float hitungPajak() {
        
        return switch (tipe) {
            case "Pribadi" -> (super.hitungPajak() * 0.05F) + (interfaceBus.hitungPajak() * 0.03F);
            case "Wagon" -> (super.hitungPajak() * 0.03F) + (interfaceBus.hitungPajak() * 0.05F);
            default -> 0;
        };
    }

}
