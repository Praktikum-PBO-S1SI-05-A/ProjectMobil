/**
 * @author YASYKUR MF
 *
 * Class Mobil
 */

package praktikum.pbo.projectmobil;


public class Mobil {
    
    protected String noPlat, merk;
    protected float pajak;
    
    public Mobil() {
    }

    public Mobil(String noPlat, String merk, float pajak) {
        
        this.noPlat = noPlat;
        this.merk = merk;
        this.pajak = pajak;
    }
    
    public void tampilInfo() {
        
        System.out.println("No. Plat            : " + noPlat);
        System.out.println("Merk                : " + merk);
        System.out.println("Pajak               : " + pajak + "%");
    }

}
