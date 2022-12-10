/**
 * @author YASYKUR MF
 *
 * Class Sedan
 */

package praktikum.pbo.projectmobil;


public class Sedan extends Mobil {
    
    protected String fasilitasKeamanan, fasilitasKenyamanan;
    protected int kapasitasCC;

    public Sedan() {
    }

    public Sedan(String fasilitasKeamanan, String fasilitasKenyamanan, int kapasitasCC, String noPlat, String merk, float pajak) {
        super(noPlat, merk, pajak);
        this.fasilitasKeamanan = fasilitasKeamanan;
        this.fasilitasKenyamanan = fasilitasKenyamanan;
        this.kapasitasCC = kapasitasCC;
    }
    
    public void infoSedan() {
        
        System.out.println("Fasilitas Keamanan  : " + fasilitasKeamanan);
        System.out.println("Fasilitas Kenyamanan: " + fasilitasKenyamanan);
        System.out.println("Kapasitas CC        : " + kapasitasCC);
    }
    
    @Override
    public void tampilInfo() {
        
        super.tampilInfo();
        infoSedan();
    }
    
    public float hitungPajak() {

        return (pajak + (pajak * kapasitasCC * 0.00005F));
    }

}
