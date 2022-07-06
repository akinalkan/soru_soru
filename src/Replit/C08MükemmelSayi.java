package Replit;

import java.util.Scanner;

public class C08MükemmelSayi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = scan.nextInt();
        int toplam=0;
        for (int i = 1; i < sayi ; i++) {
            if (sayi % i == 0) {
                toplam+=i;

            }

        }if(toplam==sayi){
            System.out.println(sayi+" Mukemmel Sayidir.");
        }else{
            System.out.println(sayi+" Mukemmel Sayidir degildir.");
        }


    }
}
