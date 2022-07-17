package sorular;

import java.util.Scanner;

public class soru23_Binary {
    /*
    Kullanıcının gireceği iki binary sayıyı toplayan  Java kodunu yazınız.

    Test Data:
    birinci binary number: 100010
    ikinci  binary number: 110010

    Beklenen Çıktı:
    1010100
     */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen  birinci binary number'i giriniz : ");
        String num1=scan.next();
        System.out.print("Lutfen  ikinci binary number'i giriniz : ");
        String num2=scan.next();

        int n1=Integer.parseInt(num1,2);//2 tabaninda sayi olarak alindi
        int n2=Integer.parseInt(num2,2);//2 tabaninda sayi olarak alindi
        int toplam=n1+n2;

        System.out.println(Integer.toBinaryString(toplam));


        /*
        long binary1, binary2;
        int i = 0, remainder = 0;
        int[] sum = new int[20];
        Scanner in = new Scanner(System.in);
        binary1 = in.nextLong();
        binary2 = in.nextLong();



        long n1=Long.parseLong(String.valueOf(binary1),2);
        long n2=Long.parseLong(String.valueOf(binary2),2);
        System.out.println(Integer.toBinaryString((int) (n1+n2)));

         */





    }
}
