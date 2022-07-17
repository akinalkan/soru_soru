package sorular;

import java.util.Scanner;

public class soru1 {
    /*
    1---Sayının Sayı değerlerinin toplamasını yapan Java kodu yazınız.

     */
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen sayiyi giriniz : ");
        int sayi = scan.nextInt();
        int input=sayi;
        int basamakSayisi = String.valueOf(input).length();
        System.out.println("sayinin basamak sayisi : " + basamakSayisi);
        int rakam = 0;
        int rakamlarToplami = 0;
        for (int i = 0; i <= basamakSayisi; i++) {
            rakam = sayi % 10;
            rakamlarToplami+=rakam;
            sayi/=10;
            i++;
        }
        System.out.println(input+"\'nin rakamlari toplami : "+rakamlarToplami);

    }
}

