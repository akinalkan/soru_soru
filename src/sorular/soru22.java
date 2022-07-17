package sorular;

public class soru22 {
    /*
    Bir String değişkeni cümlesi verildiğinde, her sözcüğü almak için kod yazın ve tersine ters çevrilmiş String'e atayın.

    Test Data:
    sentence -> "Java is fun"
    reversed -> "fun is Java"
     */
    public static void main(String[] args) {
        String str="Java is fun";
        String strNew[]=str.split(" ");
        for (int i = strNew.length-1; i>=0 ; i--) {
            System.out.print(strNew[i]+" ");//1.yontem:fun is Java
        }


        String str1=str.split(" ")[0];
        String str2=str.split(" ")[1];
        String str3=str.split(" ")[2];
        System.out.println(str3+" "+str2+" "+str1);//2.yontem:fun is Java

        String strHarf[]=str.split("");
        for (int i = strHarf.length-1; i>=0 ; i--) {
            System.out.print(strHarf[i] + " ");//n u f   s i   a v a J
        }



    }
}
