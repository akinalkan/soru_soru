package sorular;

import java.util.Scanner;

public class soru13 {
    /*
    Bir palindrom, madam veya racecar veya 10801 sayısı gibi
     ileriye doğru geriye doğru okuyan bir kelime, sayı, kelime öbeği veya diğer karakter dizisidir.

    Girilecek kelimenin palindrom olup olmadığını doğrulayacak bir Java Kodu yazın.

    Test Data:
    madam

    Beklenen Çıktı:
    True
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir cumle giriniz : ");
        String str= scan.nextLine();
        String tersStr="";
        for (int i = str.length()-1; i >=0 ; i--) {
            tersStr+=str.substring(i,i+1);

        }
        if(str.equals(tersStr)){
            System.out.println("true");
        }else{
            System.out.println("Palindrom degil");
        }


    }
}
