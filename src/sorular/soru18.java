package sorular;

import java.util.Scanner;

public class soru18 {
    /*
    Girilen Stringdeki  tüm sesli harfleri saymak için bir Java Methodu yazınız.

    Test Data:
    java is fun

    Beklenen Çıktı:

    Stringdeki sesli harf sayısı: 4
     */
    public static void main(String[] args) {

        sesliSay();

    }

    public static void sesliSay() {
        ;
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir cumle yaziniz : ");
        String cumle = scan.nextLine();

        char harfa = 'a';
        char harfe = 'e';
        char harfi = 'i';
        char harfo = 'o';
        char harfu = 'u';
        int aSayac = 0;
        int eSayac = 0;
        int iSayac = 0;
        int oSayac = 0;
        int uSayac = 0;

        for (int i = 0; i <= cumle.length() - 1; i++) {
            char harf = cumle.charAt(i);

            if (harf == harfa) {
                aSayac++;
            }


            if (harf == harfe) {
                eSayac++;
            }


            if (harf == harfi) {
                iSayac++;
            }


            if (harf == harfo) {
                oSayac++;
            }


            if (harf == harfu) {
                uSayac++;
            }


        }
        System.out.println(harfa + "\'dan : " + aSayac + " tane var");
        System.out.println(harfe + "\'den : " + eSayac + " tane var");
        System.out.println(harfi + "\'dan : " + iSayac + " tane var");
        System.out.println(harfo + "\'dan : " + oSayac + " tane var");
        System.out.println(harfu + "\'dan : " + uSayac + " tane var");
        System.out.println("Stringdeki sesli harf sayısı : " + (aSayac + eSayac + iSayac + oSayac + uSayac));


    }
}
