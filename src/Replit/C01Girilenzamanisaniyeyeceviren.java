package Replit;

import java.util.Scanner;

public class C01Girilenzamanisaniyeyeceviren {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("saat giriniz");
        int saat=scan.nextInt();
        System.out.println("dakika giriniz");
        int dakika=scan.nextInt();
        System.out.println("saniye giriniz");
        int saniye=scan.nextInt();
        System.out.println((saat*3600)+(dakika*60)+saniye+" saniye");






    }

}
