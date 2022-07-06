package Ders;

public class C04AlfabeYazdirma {
    public static void main(String[] args) {
        char harf = 'a';
        char yeniHarf = (char) (harf + 0);


        for (int i = 0; i <= 25; i++) {
            System.out.print((char) (yeniHarf + i)+" "); // alfabe

        }
    }
}