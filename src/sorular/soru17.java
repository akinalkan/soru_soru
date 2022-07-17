package sorular;

public class soru17 {
    /*
    Üç sayı arasındaki en küçük sayıyı bulmak için bir Java METHOD yazın.

    Test data:
    12,24,34

    Beklenen Çıktı:
    12
     */
    public static void main(String[] args) {
        int sayi1=12;
        int sayi2=24;
        int sayi3=34;

        maxsayi(sayi1,sayi2,sayi3);

    }

    public static void maxsayi(int sayi1,int sayi2,int sayi3) {
        if (sayi1 >= sayi2 && sayi1 >= sayi3) {
            System.out.println(sayi1);
        }
        if (sayi2 >= sayi1 && sayi2 >= sayi3) {
            System.out.println(sayi2);

        }
        if (sayi3 >= sayi2 && sayi3 >= sayi1) {
            System.out.println(sayi3);
        }
    }
    }