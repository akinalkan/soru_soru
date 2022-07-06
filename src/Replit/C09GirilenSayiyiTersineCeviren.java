package Replit;

import java.util.Scanner;

public class C09GirilenSayiyiTersineCeviren {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir cümle  yazınız");
        char [] harfler=scan.nextLine().toCharArray();
        System.out.print("Girilen Numananin Tersi: ");
        for(int i=harfler.length-1; i>=0; i--) {
            System.out.print(harfler[i]);
        }
        System.out.println("\n");

    }
}
