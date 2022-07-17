package sorular;

import java.util.Scanner;

public class soru15 {
    /*
    Girilen String değer içinde istenen sıradaki karakteri bulan Java kodunu yazınız.

    Test Data:
    Java is fun


    Beklenen Çıktı
    0. pozisyondaki karakter : J

    5. pozisyondaki karakter : i
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir cumle giriniz : ");
        String str= scan.nextLine();
        System.out.print("Lutfen kacinci siradaki karakteri istediginizi giriniz : ");
        int sira= scan.nextInt();
        System.out.println(str.substring(sira,sira+1));


    }
}
