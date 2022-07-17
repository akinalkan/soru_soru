package sorular;

import java.util.Scanner;

public class soru24 {
    /*
    Saati saniyeye çeviren java methodunu yazınız.

    Test Data:
    howManySeconds(2);
    Beklenen çıktı:
     7200
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen kac saniye oldugunu hesaplayacaginiz saati yaziniz : ");
        int sayi1=scan.nextInt();


        howManySeconds(sayi1);
    }

    public static void howManySeconds(int sayi1) {
        int saniye=sayi1*60*60;
        System.out.println(saniye);

    }
}
