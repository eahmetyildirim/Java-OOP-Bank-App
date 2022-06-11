package javanypodev;

import java.util.Random;

public class KrediKarti {
    int kartNumarasi;
    double limit;
    double guncelBorc;
    double kullanilabilirLimit;

    public KrediKarti(double limit, double guncelBorc) {
        this.limit = limit;
        this.guncelBorc = guncelBorc;
         Random rand=new Random();
        this.kartNumarasi=rand.nextInt(Integer.MAX_VALUE);
       
    }

    public int getKartNumarasi() {
        return kartNumarasi;
    }

    public void setKartNumarasi(int kartNumarasi) {
        this.kartNumarasi = kartNumarasi;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public double getGuncelBorc() {
        return guncelBorc;
    }

    public void setGuncelBorc(double guncelBorc) {
        this.guncelBorc = guncelBorc;
    }

    public double getKullanilabilirLimit() {
       this.kullanilabilirLimit= limit-guncelBorc;
        return this.kullanilabilirLimit;
    }

    
    
    
    
    @Override
    public String toString() {
        return "KrediKarti{" + "kartNumarasi=" + kartNumarasi + ", limit=" + limit + ", guncelBorc=" + guncelBorc + ", kullanilabilirLimit=" + kullanilabilirLimit + '}';
    }
    
}
