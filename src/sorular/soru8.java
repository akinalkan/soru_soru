package sorular;

import java.util.Scanner;

public class soru8 {
    /*
    Girilen String değerde tersten yazan Java kodunu yazınız.

    Test Data:
    java
    avaj

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir harf giriniz : ");
        String str=scan.nextLine();
        int uzunluk=str.length();
        String tersStr=str.substring(uzunluk-1);

        for (int i = uzunluk-2; i >=0 ; i--) {
            tersStr+=str.charAt(i);


        }
        System.out.println(tersStr);

    }
}
