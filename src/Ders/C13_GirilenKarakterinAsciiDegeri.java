package Ders;

import java.util.Scanner;

public class C13_GirilenKarakterinAsciiDegeri {
    public static void main(String[] args) {

 //      Scanner scan= new Scanner(System.in);
 //      System.out.println("Lütfen bir karakter giriniz");
 //      char harf = scan.next().charAt(0);
 //      System.out.print(""+harf+" = "+(harf+0));



        System.out.println("");
        System.out.println("********************************************");

        char harf2 = 'a';
        char yeniHarf = (char) (harf2 + 1);
        for(int i=97;i<=122;i++){
            System.out.print("Ascii value of "+(char)(yeniHarf+i-98)+" = "+i+" \n");

        }






    }
}
