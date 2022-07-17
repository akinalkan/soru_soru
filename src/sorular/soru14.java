package sorular;

public class soru14 {
    /*
    Girilen iki String veriyi karşılaştıran Java kodu yazınız.


    Test data:
    1. String : techproed.com
    2. String : Techproed.com

    Beklenen Çıktı:
    False

    Test data:
    1. String : techproed.com
    2. String : techproed.com

    Beklenen Çıktı:
    true
     */
    public static void main(String[] args) {
        String str1="techproed.com";
        String str3="techproed.com";
        String str2="Techproed.com";

        if(str1.equals(str2)){
            System.out.println("true");
        }else{
            System.out.println("False");
        }
        if(str1.equals(str3)){
            System.out.println("true");
        }else{
            System.out.println("False");
        }



    }
}
