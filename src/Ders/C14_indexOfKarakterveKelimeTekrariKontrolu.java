package Ders;

import java.util.Scanner;

public class C14_indexOfKarakterveKelimeTekrariKontrolu {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        /*
        System.out.println("Lütfen bir cümle yazınız");
        String cumle=scan.nextLine().toLowerCase();

        System.out.println("Lütfen bir harf giriniz");
        char harf=scan.next().toLowerCase().charAt(0);

        if(cumle.indexOf(harf)>=0){

            System.out.println("Girilen karakter  cümlede var");

        }else {

            System.out.println("Girilen karakter  cümlede yok");
        }

         */



        System.out.print("Lütfen bir cümle giriniz: ");
        String cumle2 = scan.nextLine();
        System.out.print("Lutfen bir kelime giriniz :");
        String kelime = scan.next();

        int ilkkelime = cumle2.indexOf(kelime);
        int tekrar = cumle2.indexOf(kelime, ilkkelime + 1);

        if (ilkkelime == -1) {
            System.out.println("Girilen kelime cumlede kullanilmamis");

        } else if (tekrar == -1) {
            System.out.println("Girilen kelime cumlede 1 kere kullanilmis");
        } else {
            System.out.println("Girilen kelime cumlede 1'den fazla kullanilmis");
        }


        String cumle3="Java cok kolay, Java cok guzel";
                String kelime2="Java";
                /*verilen kelime için asağıdaki şartlardan uygun olanı
                yazan bir programı yazınız

                -verilen kelime cumlede kullanılmamış
                -verilen kelime cumle de  sadece 1 kere kullanılmış
                -verilen kelime   cumle de 1'den fazla  kullanılmış

                */
                int kelimeIlkIndex=cumle3.indexOf(kelime2);
                int kelimeSonIndex=cumle3.lastIndexOf(kelime2);
                if(kelimeIlkIndex==-1){
                    System.out.println("verilen kelime cumlede kullanılmamış");
                } else if (kelimeIlkIndex==kelimeSonIndex) {
                    System.out.println("verilen kelime cumle de  sadece 1 kere kullanılmış");

                }else {
                    System.out.println("verilen kelime   cumle de 1'den fazla  kullanılmış");
                }


    }
}
