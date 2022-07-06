package Replit;

import java.util.Scanner;

public class C06GCDEnBüyükOrtakBölenveLCMyiEnKüçükOrtakKat {
    public static int GCD(int sayi1, int sayi2) {
        if(sayi1==0|| sayi2==0)
            return 0;
        if(sayi1==sayi2)
            return sayi1;
        if(sayi1>sayi2)
            return GCD(sayi1-sayi2,sayi2);
        else
            return GCD(sayi1,sayi2-sayi1);
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen 1.sayiyi giriniz: ");
        int sayi1 = scan.nextInt();
        System.out.print("Lutfen 2.sayiyi giriniz: ");
        int sayi2 = scan.nextInt();
        System.out.println(sayi1+" ve "+sayi2+" icin GCD = " + GCD(sayi1,sayi2));
        System.out.println(sayi1+" ve "+sayi2+" icin LCM = "+ (sayi1*sayi2/GCD(sayi1,sayi2)));

    }
}
