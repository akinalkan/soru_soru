package sorular;

import java.util.Scanner;

public class soru6 {
    /*
           Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
           değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
            1 karakterden fazla ise hata mesajı göstersin.
            (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)

       Sesli harfler: a,e,i,o,u

       Test Data:
       a

       Beklenen Çıktı:
       a harfi sesli harfdir.

       Test Data:
       d

       Beklenen Çıktı:
       d harfi sesiz harftir.

       Test Data:
       we  yada %

       Beklenen Çıktı:
       Yanlis karakter girdiniz!
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir harf giriniz : ");
        String ch1 = scan.next();
        if (ch1.length() > 1) {
            System.out.println("Lutfen 1 karakter giriniz");
        } else {
            char ch = ch1.charAt(0);
            switch (ch) {
                case 'a', 'e', 'i', 'o', 'u' -> System.out.println(ch + " sesli harftir");
                case 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z' ->
                        System.out.println(ch + " sessiz harftir");
                default -> System.out.println("Yanlis karakter girdiniz!");

            }


        }
    }
}