package Replit;

import java.util.Scanner;

public class C03krediKartıNoVerilenFormataCeviren {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("adinizi giriniz");
        String ad = scan.nextLine();

        System.out.println("soyadinizi giriniz");
        String soyad = scan.nextLine();

        System.out.println("kart no giriniz");
        String kartNo = scan.nextLine();

        String adIlkHarf = ad.substring(0, 1).toUpperCase();
        String adGeriKalanlar = ad.substring(1).replaceAll("\\w", "*");

        String soyAdIlkHarf = soyad.substring(0, 1).toUpperCase();
        String soyAdGeriyeKalanlar = soyad.substring(1).replaceAll("\\w", "*");


        String sonKartNo = kartNo.substring(12);
        String kartIlkNo = "**** **** **** ";

        System.out.println(adIlkHarf + adGeriKalanlar + " " + soyAdIlkHarf + soyAdGeriyeKalanlar);
        System.out.println("CCN  : " + kartIlkNo + sonKartNo);
    }
}









