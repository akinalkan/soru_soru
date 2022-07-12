package Ders;

public class C04AlfabeYazdirma {
    public static void main(String[] args) {
        char harf = '0';
        char yeniHarf = (char) (harf + 0);


        for (int i = 0; i <= 255; i++) {
            System.out.println(i+" = "+(char) (yeniHarf + i)+" "); // alfabe

        }
    }
}