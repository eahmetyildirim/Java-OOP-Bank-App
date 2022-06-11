package javanypodev;

import java.util.ArrayList;
import java.util.Random;

public class Musteri extends Kisi{
   int musteriNumarasi;
    ArrayList<BankaHesabi> hesaplar =new ArrayList<BankaHesabi>();
    ArrayList<KrediKarti> krediKartlari=new ArrayList<KrediKarti>();
    public Musteri(String ad, String soyad, String email, int telefonNumarasi) {
        super(ad, soyad, email, telefonNumarasi);
         Random rand=new Random();
        this.musteriNumarasi=rand.nextInt(Integer.MAX_VALUE);
       
    }
    
    
    public void hesapEkle(BankaHesabi hesap){
        hesaplar.add(hesap);
    }
    public void krediKartiEkle(){
    
    }
    public String hesapSil(int i){
        if(hesaplar.get(i).getBakiye()==0){
            hesaplar.remove(i);
        return "Hesap Silindi";
        }else{
        return "Lütfen bakiyenizi başka hesaba aktarın";
        }
    // hesap bakiyesi sıfırsa silicek
    }
    public String krediKartiSil(int i){
    // kart borcu sıfırsa silicek
    if(krediKartlari.get(i).getGuncelBorc()==0){
        krediKartlari.remove(i);
        return "Kart Silindi";
        }else{
        return "Lütfen borcunuzu ödeyin";
        }
    }

    public int getMusteriNumarasi() {
        return musteriNumarasi;
    }

    public void setMusteriNumarasi(int musteriNumarasi) {
        this.musteriNumarasi = musteriNumarasi;
    }

    public ArrayList<BankaHesabi> getHesaplar() {
        return hesaplar;
    }

    public void setHesaplar(ArrayList<BankaHesabi> hesaplar) {
        this.hesaplar = hesaplar;
    }

    public ArrayList<KrediKarti> getKrediKartlari() {
        return krediKartlari;
    }

    public void setKrediKartlari(ArrayList<KrediKarti> krediKartlari) {
        this.krediKartlari = krediKartlari;
    }

    @Override
    public String toString() {
        return "Musteri{" + "musteriNumarasi=" + musteriNumarasi + ", hesaplar=" + hesaplar + ", krediKartlari=" + krediKartlari + '}';
    }
    
    
}
