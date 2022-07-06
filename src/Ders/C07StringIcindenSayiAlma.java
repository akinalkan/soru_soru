package Ders;

import java.util.Scanner;

public class C07StringIcindenSayiAlma {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen 5 basamaklı bir şifre giriniz");

        String sifre=scan.nextLine();

        Integer sifreSayi=Integer.parseInt(sifre);// parse kullarak

        System.out.println("Girilen şifrenin 3 fazlası : "+(sifre+3));
        System.out.println("Integer şifrenin 3 fazlası: "+(sifreSayi+3));

        String str1="$13.99";
        String str2="$10.55";
        double str3=Double.parseDouble(str1.replace("$",""));
        double str4=Double.parseDouble(str2.replace("$",""));
        System.out.println("$"+(str3+str4));


    }
}
