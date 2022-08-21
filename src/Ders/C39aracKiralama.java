package Ders;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C39aracKiralama {
    /*
        1-
    kullanıcı  islem fields -->
    String alinacakSehir;
    String alinacakGun; (MM,dd--> ay gun formatında olmalı)
    double alisSaati;
    String teslimGunu;  (MM,dd--> ay gun formatında olmalı)
    double teslimSaati;

    arac fields -->
    String marka; (liste araclari --> opel toyota volvo)
    String model;  (astra corolla s60)
    String yakitTipi;  (diesel benzin)
    String vites; (manuel otomatik)
    double gunlukUcret; ( 100 120 150... liste dısı arac=300)

    2-musteriden  yukarida ozellikleri verilen liste araclardan
    tercihini alınız. eger musteri farklı bir arac talep ederse
    talep ettigi aracın fields'larını alınız.
    musterinin ad, soyad, yas, telefon, id  ve kredi kartı bilgileri ile
      arac tercihine ve islemine gore odemesini gerçekleştriniz..
     */
    public static void main(String[] args) throws InterruptedException {
        List<String> markaArac=new ArrayList<>();
        markaArac.add("1-Opel ");
        markaArac.add("2-Toyota");
        markaArac.add("3-Volvo");

        List<String> modelArac=new ArrayList<>();
        modelArac.add("1-Astra");
        modelArac.add("2-Corolla");
        modelArac.add("3-S60");
        List<String> vitesArac=new ArrayList<>();
        vitesArac.add("1-Manuel");
        vitesArac.add("2-Otomatik");

        List<Double> gunlukUcretArac=new ArrayList<>();
        gunlukUcretArac.add(100.0);
        gunlukUcretArac.add(120.0);
        gunlukUcretArac.add(150.0);
        gunlukUcretArac.add(300.0);


        Scanner scan=new Scanner(System.in);
        System.out.println("*********************************");
        System.out.println("\t\tHosgeldiniz");

        System.out.print("Araci alacaginiz sehri giriniz : ");
        String alinacakSehir= scan.nextLine();
        System.out.print("Araci alacaginiz ay : ");
        int alinacakAy=scan.nextInt();
        System.out.print("Araci alacaginiz gun : ");
        int alinacakGun=scan.nextInt();
        System.out.print("Araci alacaginiz saati giriniz : ");
        int alisSaati= scan.nextInt();
        LocalDate alinacakTarih=LocalDate.of(2022,alinacakAy,alinacakGun);
        System.out.print("Araci teslim edeceginiz ay : ");
        int teslimAy=scan.nextInt();
        System.out.print("Araci teslim edeceginiz gun : ");
        int teslimGun=scan.nextInt();
        System.out.print("Araci teslim edeceginiz saati giriniz : ");
        int teslimSaati= scan.nextInt();
        LocalDate teslimTarih=LocalDate.of(2022,teslimAy,teslimGun);






        System.out.print("Lutfen marka seciniz : ");
        System.out.print(markaArac);
        System.out.println("");
        String marka= scan.next();
        switch (marka){
            case "1"-> marka="Opel";
            case "2"-> marka="Toyota";
            case "3"-> marka="Volvo";
            default -> System.out.println("Marka secimi hatali");
        }


        System.out.print("Lutfen model seciniz : ");
        System.out.print(modelArac);
        System.out.println("");
        String model= scan.next();
        switch (model){
            case "1"-> model="Astra";
            case "2"-> model="Corolla";
            case "3"-> model="S60";
            default -> System.out.println("Model secimi hatali");
        }
        if(marka=="Opel"&&model!="Astra"){
            System.out.println("Marka ve model uyusmuyor");
        }
        if(marka=="Toyota"&&model!="Corolla"){
            System.out.println("Marka ve model uyusmuyor");
        }
        if(marka=="Volvo"&&model!="S60"){
            System.out.println("Marka ve model uyusmuyor");
        }


        System.out.print("Lutfen vites seciniz : ");
        System.out.print(vitesArac);
        System.out.println("");
        String vites= scan.next();
        switch (vites){
            case "1"-> vites="Manuel";
            case "2"-> vites="Otomatik";
            default -> System.out.println("vites secimi hatali");
        }
        int gunlukUcret = 0;
        if(marka=="Opel" && model=="Astra"&& vites=="Manuel") {
            gunlukUcret = 100;
        }
            if(marka=="Opel" && model=="Astra"&& vites=="Otomatik") {
                gunlukUcret=150;
        }
            if(marka=="Toyota" && model=="Corolla"&& vites=="Manuel") {
                gunlukUcret=120;
            }
            if(marka=="Toyota" && model=="Corolla"&& vites=="Otomatik") {
                gunlukUcret=170;
            }
        if(marka=="Volvo" && model=="S60"&& vites=="Manuel") {
            gunlukUcret=2000;
        }
        if(marka=="Volvo" && model=="S60"&& vites=="Otomatik") {
            gunlukUcret=250;
        }
        
        System.out.println("Seciminiz");
        System.out.println("marka = " + marka);
        System.out.println("model = " + model);
        System.out.println("vites = " + vites);
        System.out.println("Gunluk ucret : "+gunlukUcret);

        Period gecenSure=Period.between(alinacakTarih,teslimTarih);
        int toplamGunSayisi= gecenSure.getDays()+(gecenSure.getMonths()*30);
        System.out.println("toplamGunSayisi = " + toplamGunSayisi);
        int toplamUcret=toplamGunSayisi*gunlukUcret;
        System.out.println("toplamUcret = " + toplamUcret);
        System.out.println("");
        System.out.println("****************************");

        System.out.print("Lutfen isim giriniz : ");
        System.out.print("");
        String isim=scan.next();
        System.out.print("Lutfen Soyisim giriniz : ");
        System.out.print("");
        String soyIsim=scan.next();
        System.out.print("Lutfen yas giriniz : ");
        System.out.print("");
        String yas=scan.next();
        System.out.print("Lutfen telefon no giriniz : ");
        System.out.print("");
        String telefon=scan.next();
        System.out.print("Lutfen tc kimlik no giriniz : ");
        System.out.print("");
        String tcKinlikNo=scan.next();
        System.out.print("Lutfen tc kredi kart no giriniz : ");
        System.out.print("");
        String krediKartNo=scan.next();
        System.out.println("Sayin "+isim+" "+soyIsim+" Lutfen bekleyiniz...");

        Thread.sleep(3000);
        System.out.println("...");
        Thread.sleep(3000);
        System.out.println();
        System.out.println("isleminiz basariyla gerceklesti");


        System.out.println("Iyi gunler");
        System.out.println("****************************");



        }

}
