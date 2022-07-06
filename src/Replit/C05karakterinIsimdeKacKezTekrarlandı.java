package Replit;

import java.util.Scanner;

public class C05karakterinIsimdeKacKezTekrarlandı {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir isim giriniz");
        String name=scan.nextLine();
        System.out.println("Lutfen bir karakter giriniz");
        char ch1=scan.next().charAt(0);
        int kontrol=0;
        for(int i=0 ; i<=name.length()-1; i++){
            if(ch1==name.charAt(i)){
                kontrol++;

            }
        }System.out.println("Number of "+ch1+" = "+kontrol);




    }
}
