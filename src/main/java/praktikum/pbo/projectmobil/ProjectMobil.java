/**
 * @author YASYKUR MF
 *
 * Class ProjectMobil (main)
 */

package praktikum.pbo.projectmobil;

public class ProjectMobil {

    public static void main(String[] args) {
        
        Bus bus1 = new Bus(150, 50, "BUS001", "Hyno", 0.3F);
        
        System.out.println("== DATA BUS ==");
        bus1.tampilInfo();
        System.out.println("Total Pajak         : " + bus1.hitungPajak() + "%");
        System.out.println();
        
        Sedan sedan1 = new Sedan("Anti ringsek", "Kursi Pijat", 500, "SEDAN0001", "Toyota", 0.1F);
        
        System.out.println("== DATA SEDAN ==");
        sedan1.tampilInfo();
        System.out.println("Total Pajak         : " + sedan1.hitungPajak() + "%");
        System.out.println();
        
        MiniBus miniBus1 = new MiniBus("Pribadi", 6, 100, "MB0001", "Daihatsu", 0.2F, "Anti peluru", "Sofa Empuk", 1000);
        
        System.out.println("== DATA MINIBUS ==");
        miniBus1.tampilInfo();
        System.out.println("Total Pajak         : " + miniBus1.hitungPajak() + "%");
        System.out.println();
    }
}
