package Ders;

import java.util.Scanner;

public class C33_IkiCharArasindakiBuyukHarfleriYazdir {
    public static void main(String[] args) {        /*
        Soru 4 ) Kullanicidan baslangic ve bitis haflerini alin
        ve baslangic harfinden baslayip bitis harfinde biten
        tum harfleri buyuk harf olarak ekrana yazdirin.
        Kullanicinin hata yapmadigini farz edin.
         */

        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen baslangic harfini giriniz : ");
        char ilkHarf=scan.next().charAt(0);

        System.out.print("Lutfen bitis harfini giriniz : ");
        char sonHarf=scan.next().charAt(0);
        String buyult="";

        char temp=ilkHarf;

        while(temp<=sonHarf){
            buyult = (temp + "").toUpperCase();// char string'e cevrilip buyuk harf yapildi
            System.out.print(buyult+" ");
            temp+=1;
        }





    }
}
