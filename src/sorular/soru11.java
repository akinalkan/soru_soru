package sorular;

import java.util.Scanner;

public class soru11 {
    /*
    Kullanıcıdan alınan Stringin son karakteirini silip ekrana yazan Java kodunu yazınız.

    Test Data:
    good

    Beklenen Çıktı:
    goo
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir kelime giriniz : ");
        String str = scan.nextLine();
        int uzunluk = str.length();

        String str2 = "";

        for (int i = 0; i < uzunluk-1; i++) {
            str2+=str.substring(i,i+1);


        }
        System.out.println(str2);
    }
}