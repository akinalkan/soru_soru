package sorular;

import java.util.Scanner;

public class soru19 {
    /*
    Kullanıcı tarafından girilen bir yılın  artık yıl olup olmadığını kontrol etmek için bir Java Methodu yazınız.

    Test Data:
    2017

    Beklenen Çıktı:
    false
     */
    public static void main(String[] args) {
        artikYil();


    }

    public static void artikYil() {
        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen bir yil giriniz : ");
        int yil=scan.nextInt();
        if(yil%4!=0){
            System.out.println("false");

        }else if(yil%100!=0){
            System.out.println("true");
        } else if (yil%400!=0) {
            System.out.println("false");

        }else{
            System.out.println("true");
        }

    }
}
