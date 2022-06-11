
package javanypodev;

import java.util.ArrayList;
import java.util.Random;

public class BankaPersoneli extends Kisi{
int personelID;
ArrayList<Musteri> musteriler=new ArrayList<Musteri>();

    public BankaPersoneli(String ad, String soyad, String email, int telefonNumarasi) {
        super(ad, soyad, email, telefonNumarasi);
         Random rand=new Random();
        this.personelID=rand.nextInt(Integer.MAX_VALUE);
       
    }

    public int getPersonelID() {
        return personelID;
    }

    public void setPersonelID(int personelID) {
        this.personelID = personelID;
    }

    public ArrayList<Musteri> getMusteriler() {
        return musteriler;
    }

    public void setMusteriler(ArrayList<Musteri> musteriler) {
        this.musteriler = musteriler;
    }
    
    @Override
    public String toString() {
        return "BankaPersoneli{" + "personelID=" + personelID + ", musteriler=" + musteriler + '}';
    }

    
 
}
