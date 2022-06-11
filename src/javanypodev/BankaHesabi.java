package javanypodev;

import java.util.Random;


public class BankaHesabi {
    private int iban;
    private double bakiye;
    private String hesapTuru;
    public BankaHesabi(double bakiye) {
        Random rand=new Random();
        this.iban=rand.nextInt(Integer.MAX_VALUE);
        this.bakiye = bakiye;
    }

    public String getHesapTuru() {
        return hesapTuru;
    }

    public void setHesapTuru(String hesapTuru) {
        this.hesapTuru = hesapTuru;
    }
    
    public int getIban() {
        return iban;
    }

    public void setIban(int iban) {
        this.iban = iban;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    @Override
    public String toString() {
        return "BankaHesabi{" + "iban=" + iban + ", bakiye=" + bakiye + '}';
    }
    
    
    
    
}
