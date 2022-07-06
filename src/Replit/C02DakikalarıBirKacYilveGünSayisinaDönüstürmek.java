package Replit;

import java.util.Scanner;

public class C02DakikalarıBirKacYilveGünSayisinaDönüstürmek {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("dakika giriniz");
            int dakika=scan.nextInt();
            int yil=dakika/(365*24*60);
            int kalanDakika=(dakika)-(yil*365*24*60);
            int gün=kalanDakika/(60*24);

            System.out.println(dakika+" dakika yaklasik "+yil +" yil "+gün+" gundur");

        }

    }

