package Ders;

import java.util.Scanner;

public class C15_ForveSubstringleTerstenYazma {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Lütfen bir kelime yazınız: ");
        String metin=scan.nextLine();

        String ters="";
        for(int i=metin.length()-1;i>=0;i--){
            ters=ters+metin.charAt(i);
    }
        System.out.print("Girdiğiniz Metnin tersi: "+ters);
        System.out.println("");

        String input="kaya";// 4 harfli kelime icin substring ile tersten yazma
        String tersInput=input.substring(3)+
                input.substring(2,3)+
                input.substring(1,2)+
                input.substring(0,1);
        System.out.println(tersInput);


    }
}
