/**
 * @author YASYKUR MF
 *
 * Class Bus
 */

package praktikum.pbo.projectmobil;


public class Bus extends Mobil implements InterfaceBus {

    protected int kapasitasPenumpang, kapasitasBagasi;

    public Bus() {
    }

    public Bus(int kapasitasPenumpang, int kapasitasBagasi, String noPlat, String merk, float pajak) {
        super(noPlat, merk, pajak);
        this.kapasitasPenumpang = kapasitasPenumpang;
        this.kapasitasBagasi = kapasitasBagasi;
    }
    
    @Override
    public void infoBus() {

        System.out.println("Kapasitas Penumpang : " + kapasitasPenumpang);
        System.out.println("Kapasitas Bagasi    : " + kapasitasBagasi);
    }
    
    @Override
    public void tampilInfo() {
        
        super.tampilInfo();
        infoBus();
    }
    
    @Override
    public float hitungPajak() {
        
        return (pajak + (pajak * kapasitasPenumpang * kapasitasBagasi * 0.00005F));
    }
}
