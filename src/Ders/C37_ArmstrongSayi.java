package Ders;

import java.util.Scanner;

public class C37_ArmstrongSayi {public static void main(String[] args) {


    Scanner scan = new Scanner(System.in);
    int basamak_sayisi = 0, rakam;
    int toplam = 0;

    System.out.print("Bir sayi giriniz: ");
    int sayi = scan.nextInt();
    int gecici = sayi;
    int gecici2 = sayi;

    while(gecici > 0) {
        gecici /= 10;
        basamak_sayisi++;
    }
    while(sayi > 0) {
        rakam = sayi % 10;
        toplam += Math.pow(rakam, basamak_sayisi);
        sayi /= 10;
    }
    if(toplam == gecici2) {
        System.out.println(gecici2 + " sayisi armstrong bir sayidir.");
    }
    else {
        System.out.println(gecici2 + " sayisi armstrong bir sayi degildir.");
    }
    System.out.println("******************************************************");
    System.out.println("");
    int b1, b2, b3, b4, b5, sonuc;
    for (int i = 0; i <=99999; i++) {
        if (i <= 9) {  // Tek basamaklı Sayı aralığı
            sonuc = i ;
            if (sonuc == i) System.out.println(i + " Sayısı Armstrong Sayıdır");
        } else if (i <= 99) {   // iki Basamaklı Sayı Aralığı
            b1 = (i / 10) % 10;
            b2 = i % 10;
            sonuc = (b1 * b1) + (b2 * b2);
            if (sonuc == i) System.out.println(i + " Sayısı Armstrong Sayıdır");
        } else if (i <= 999) {  // 3 Basamaklı Sayı aralığı
            b1 = (i / 100) % 10;
            b2 = (i / 10) % 10;
            b3 = i % 10;
            sonuc = (b1 * b1 * b1) + (b2 * b2 * b2) + (b3 * b3 * b3);
            if (sonuc == i) System.out.println(i + " Sayısı Armstrong Sayıdır");
        } else if (i <= 9999) {    // 4 Basamaklı Sayı Aralığı
            b1 = (i / 1000) % 10;
            b2 = (i / 100) % 10;
            b3 = (i / 10) % 10;
            b4 = i % 10;
            sonuc = (b1 * b1 * b1 * b1) + (b2 * b2 * b2 * b2) + (b3 * b3 * b3 * b3) + (b4 * b4 * b4 * b4);
            if (sonuc == i) System.out.println(i + " Sayısı Armstrong Sayıdır");
        } else if (i <= 99999) {   // 5 Basamaklı Sayı aralığı
            b1 = (i / 10000) % 10;
            b2 = (i / 1000) % 10;
            b3 = (i / 100) % 10;
            b4 = (i / 10) % 10;
            b5 = i % 10;
            sonuc = (b1 * b1 * b1 * b1 * b1) + (b2 * b2 * b2 * b2 * b2) + (b3 * b3 * b3 * b3 * b3) + (b4 * b4 * b4 * b4 * b4) + (b5 * b5 * b5 * b5 * b5);
            if (sonuc == i) System.out.println(i + " Sayısı Armstrong Sayıdır");
        }
    }


}
}
