import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mesafe,yas,secim;
        Scanner input=new Scanner(System.in);
       System.out.print("Gidilecek Mesafeyi Giriniz :");
       mesafe=input.nextInt();
       System.out.print("Yasinizi Giriniz :");
       yas=input.nextInt();
       System.out.print("1.Sadece Gidis\n2.Gidis-Gelis\nSeyahat Seklini Seciniz : ");
       secim=input.nextInt();
       double normalBiletFiyati,kmBirim=0.10,indirimliFiyat=0,toplam=0;
       normalBiletFiyati=mesafe*kmBirim;
       if (!(yas<0&&mesafe<0)){
           if (yas<=12){
               indirimliFiyat=normalBiletFiyati*0.5;
           }else if (yas>12&&yas<=24){
               indirimliFiyat=normalBiletFiyati*0.1;
           }else if (yas>=65){
               indirimliFiyat=normalBiletFiyati*0.3;
           }
           toplam=normalBiletFiyati-indirimliFiyat;
           if (secim==2){
               indirimliFiyat=normalBiletFiyati*0.2;
               toplam=normalBiletFiyati-indirimliFiyat;
           }

       }else {
           System.out.println("Hatali Giris Yaptınız..!");
       }

       System.out.println("Bilet Fiyatiniz :"+toplam+"TL");





    }
}