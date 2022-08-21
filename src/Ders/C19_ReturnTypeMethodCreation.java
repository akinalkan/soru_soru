package Ders;

import java.util.Scanner;

public class C19_ReturnTypeMethodCreation {
    public static void main(String[] args) {

        // verilen isim ve soy ismi ilk arfi buyuk
        //geriye kalanlari * olacak sekilde degistirip
        //bize bu halini donduren bir method olusturun
        //NOT: Programin ilerleyen kisimlarinda isim ve soyismi bu sekilde kullamak istiyoruz
        String isim="Enes";
        String soyisim="Bozkurt";

        String gizliIsim=isimGizle(isim,soyisim);

        System.out.println(gizliIsim);//E*** B******
        System.out.println(isim+" "+soyisim);//Enes Bozkurt
        System.out.println("***********************************");

         /*
        eger bir class'in icerisinde herhangi bir hesaplama yapip
        bunu da kalici olmasini istersek kodumuzu sade ve anlasilir tutmak icin
        islemi bir method'a yapip sonucu main method'a dondurebiliriz
        Return Type'i void olmayan bir method'un sonucunu main method da bir
        variable'a atama yaparsak programin geri kalaninda
          bu yeni degeri kullanma sansimiz olur


         */
        //kullanicidan sehir ismini ve dogum tarihini alip
        //bunlari programda kullanacagimiz formatta bize donduren bir format olusturun
        //sehir ismini programimizda buyuk harf olarak
        //tarihi ise 2022-06-30 seklinde kullanmak istiyoruz
        String sehir=sehirAl();
        String tarih=tarihAl();
        System.out.println("Girdiginiz sehir: "+sehir);
        System.out.println("Girdiginiz tarih: "+tarih);




    }

    public static String isimGizle(String isim, String soyisim) {
        isim=isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");
        soyisim=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).replaceAll("\\w","*");

        return isim+" "+soyisim;


    }

    public static String tarihAl() {
        String tarih="";
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen dogum yilinizi giriniz");
        int yil=scan.nextInt();
        if(yil>1900 && yil<2100){
            tarih=yil+"-";

        }else{
            System.out.println("Yil icin gecerli bir sayi yazmalisiniz(1900-2100)");
        }
        System.out.println("Kacinci ay oldugunu tam sayi olarak yaziniz(1-12)");
        int ay=scan.nextInt();
        if (ay<=0  || ay>12){
            System.out.println("Ay no 1-12 arasinda olmalidir");
        }else if(ay<10){
            tarih+="0"+ay+"-";

        }else{
            tarih+=ay+"-";

        }
        System.out.println("ayin kacinci gunu  oldugunu tam sayi olarak yaziniz(1-31)");
        int gun=scan.nextInt();
        if(gun<=0 || gun>31){
            System.out.println("gun  no olarak 1-31 arasinda sayi olarak yaziniz");
        }else if(gun<10){
            tarih+="0"+gun;

        }else {
            tarih+=gun;

        }
        return tarih;

    }

    public static String sehirAl() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen sehir adi giriniz");
        String sehirAdi=scan.next().toUpperCase();
        return sehirAdi;

    }
}
