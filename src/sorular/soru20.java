package sorular;

import java.util.Arrays;

public class soru20 {
    /*
    Karışık verilen sayıları  ve kelimeleri  sıralayan   Java kodunun yazınız.
    not: Test datadaki değerleri kullanınız.


    Test Data:
    [1232, 1134,2345,1022]
    [Java, Python, PHP, C#, C Programming, C++]

    Beklenen Çıktı:
    [1022,1134,1232,2345]
    [C Programming, C#, C++, Java, PHP, Python]

     */
    public static void main(String[] args) {
        int sayilar[]={1232, 1134,2345,1022};
        Arrays.sort(sayilar);//siralandi
        System.out.println("sirali hali : " + Arrays.toString(sayilar));
        String str[]={"Java", "Python","PHP","C#", "C Programming","C++"};
        Arrays.sort(str);//siralandi
        System.out.println(Arrays.toString(str));
    }
}
