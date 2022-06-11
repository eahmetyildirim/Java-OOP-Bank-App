package javanypodev;


public class YatirimHesabı extends BankaHesabi{
    public YatirimHesabı(double bakiye) {
        super(bakiye);
        setHesapTuru("Yatırım");
    }
    public String ParaEkle(VadesizHesap cekilecekHesap,YatirimHesabı yatirilacakHesap,double Miktar){
    
         if(cekilecekHesap.getBakiye()>Miktar){
                cekilecekHesap.setBakiye( (cekilecekHesap.getBakiye()-Miktar));
                yatirilacakHesap.setBakiye( (yatirilacakHesap.getBakiye()+Miktar));
                return "Para eklendi";
            }else{
            return "Bakiye yetersiz";
            }
    }
    public String ParaCek(VadesizHesap yatirilacakHesap,YatirimHesabı cekilecekHesap,double Miktar){

             if(cekilecekHesap.getBakiye()>Miktar){
                cekilecekHesap.setBakiye( (cekilecekHesap.getBakiye()-Miktar));
                yatirilacakHesap.setBakiye( (yatirilacakHesap.getBakiye()+Miktar));
                return "Para çekildi";
            }else{
            return "Bakiye yetersiz";
            }
    }       
    
}
