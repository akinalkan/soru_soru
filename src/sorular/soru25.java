package sorular;

import java.util.Scanner;

public class soru25 {
    /*
    İki integer sayının eşitliğini kontrol eden java methodunu yazınız.

    num1 = num2 => true
     */
    public static void main(String[] args) {

        esitMi();


    }

    private static void esitMi() {
        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen 1.sayiyi giriniz : ");
        int sayi1=scan.nextInt();
        System.out.print("Lutfen 2.sayiyi giriniz : ");
        int sayi2=scan.nextInt();

        boolean esitMi=false;
        if(sayi1!=sayi2){
            System.out.println(esitMi);
        }else {
            System.out.println(!esitMi);
        }


    }
}
