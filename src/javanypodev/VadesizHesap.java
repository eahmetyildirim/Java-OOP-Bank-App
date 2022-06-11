package javanypodev;


public class VadesizHesap extends BankaHesabi{
       public VadesizHesap(double bakiye) {
        super(bakiye);
           setHesapTuru("Vadesiz");
      
    }
     public String ParaTransferi(VadesizHesap aliciHesap,VadesizHesap gonderenHesap,double Miktar){
     
            if(gonderenHesap.getBakiye()>Miktar){
                gonderenHesap.setBakiye( (gonderenHesap.getBakiye()-Miktar));
                aliciHesap.setBakiye( (aliciHesap.getBakiye()+Miktar));
                return "Transfer gerçekleşti";
            }else{
            return "Bakiye yetersiz";
            }
     
     
     }
     public String krediKartiBorcOdeme(KrediKarti kart,double OdenecekMiktar){
         if(OdenecekMiktar>kart.getGuncelBorc()){
         
         return "Ödenen tutar , kart borcundan fazla!";
         
         }else if(getBakiye()>=OdenecekMiktar){
         
             kart.setGuncelBorc(kart.getGuncelBorc()-OdenecekMiktar);
             setBakiye((getBakiye()-OdenecekMiktar));
             return "Borç ödendi";
         
         }else{
            return "Bakiyeniz yetersiz";
         }
     
     }

   

     
    
     
}
