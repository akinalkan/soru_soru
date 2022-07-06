package Ders;

public class C23StringTersCevirmeMetodIleForlu {
    public static void main(String[] args) {
        /*
        input olarak verilen string'i terse cevirip yazdiran bir method olusturun
         */
        String input="aloha";

        terstenYazdir(input);
    }

    public static void terstenYazdir(String input) {
        String tersInput=input.substring(input.length()-1);
        for (int i = input.length()-2; i >=0 ; i--) {
            tersInput+=input.substring(i,i+1);


        }
        System.out.println(tersInput);

    }

}
