package sorular;

import java.util.Scanner;

public class soru26 {
    /*
    Bir sayı asal olduğunda true, aksi halde false çıktısı return eden bir Java Methodu yazınız.

    Test Data:

    isPrime(31)
    true

    isPrime(18)
    false
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen 2'den buyuk bir tamsayi  giriniz : ");
        int n=scan.nextInt();

        System.out.println(isPrime( n));

    }

    public static boolean isPrime(int n) {


            for (int i = 2; i <= n - 1; i++) {
                if (n % i == 0)
                    return false;
            }

            return true;
        }


    }

