package sorular;

import java.util.Scanner;

public class soru27 {
    /*
    Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çevirip return eden bir method(method ismi hackerDili) yazınız.

    Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
    s -> 5
    a -> 4
    e -> 3
    i -> 1
    o -> 0

    Test data
    hackerDili("javayı severim")
    j4v4yı 53v3r1m

    İpucu harfleri değiştirin ve ekrana yazdırın.
     */
    public static void main(String[] args) {
        ceviri();


    }

    public static void ceviri() {
        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen bir cumle yaziniz : ");
        String str=scan.nextLine();
        String strlower=str.toLowerCase();
        System.out.println(strlower.replaceAll("s","5")
                .replaceAll("a","4").replaceAll("e","3")
                .replaceAll("i","1").replaceAll("o","0"));
    }
}
