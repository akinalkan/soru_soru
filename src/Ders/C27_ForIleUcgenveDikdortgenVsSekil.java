package Ders;

public class C27_ForIleUcgenveDikdortgenVsSekil {
    public static void main(String[] args) {
        /*

         *
         * *
         * * *
         * * * *
         * * * * *

         */
        for (int i = 1; i<=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");

            }
            System.out.println("");

        }
        System.out.println("*******************************************************");


        /*
        verilen yukseklik ve boy degerine gore *'lardan olusan bir dikdortgen
        olusturalim
        yukseklik:3 ve boy :4 ise;
        * * * *
        * * * *
        * * * *

         */
        int yukseklik=4;
        int boy=8;
        for (int i = 1; i <=yukseklik ; i++) {
            for (int j = 1; j <=boy ; j++) {
                System.out.print("* ");

            }
            System.out.println("");

        }
        System.out.println("");
        System.out.println("*******************************************************");

        /*
        veril;en inputa gore *'lardan olusan asagidaki sekli olusturun

        *
        **
        ***
        ****
        *****
        ****
        ***
        **
        *

         */
        //artan kismi nested forloop ile yapalim
        int input=5;
        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }
        for (int i = input-1; i >=1 ; i--) {
            for (int j = i; j >=1 ; j--) {
                System.out.print("* ");

            }
            System.out.println();

        }
        System.out.println("");
        System.out.println("*******************************************************");



        /*
            A
            A N
            A N K
            A N K A
            A N K A R
            A N K A R A

         */
        String input2= "ANKARA";
        for (int i = 1; i <= input2.length(); i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(input2.substring(j - 1, j) + " ");
            }
            System.out.println("");
        }




    }
}
