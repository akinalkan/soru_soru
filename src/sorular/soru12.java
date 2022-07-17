package sorular;

import java.util.Scanner;

public class soru12 {
    /*
    Kullanıcının girdiği String değerlerini büyük harfe çeviren Java kodunu yazınız.

    Test Data:
    Java is fun

    Beklenen Sonuç:
    JAVA IS FUN
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir cumle giriniz : ");
        String str= scan.nextLine();
        System.out.println(str.toUpperCase());

    }
}
