package sorular;

import java.util.Scanner;

public class soru10 {
    /*
    Kullanıcıdan alınan String kümesi içerisinde aranan  String i bulan Java Kodunu yazınız.

    Test Data:
    Java is easy

    Aranan String: is

    Bektenen Çıktı:
    True

    Aranan String: and

    Beklenen Çıktı:False
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir cumle giriniz : ");
        String cumle= scan.nextLine();
        System.out.print("Lutfen bir kelime giriniz : ");
        String kelime= scan.nextLine();


        boolean varMi=false;
        if(cumle.contains(kelime)){
            System.out.println(!varMi);
        }else{
            System.out.println(varMi);
        }



    }
}
