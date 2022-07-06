package Ders;

import java.util.Scanner;

public class C10_ArtikYil {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yil giriniz");
        int yil= scan.nextInt();
        if(yil%4!=0){
            System.out.println("Artık yıl değil");

        }else if(yil%100!=0){
            System.out.println("Artık yıl ");
        }else if(yil%400!=0){
            System.out.println("Artık yıl değil");
        }else{
            System.out.println("Artık yıl");
        }
        System.out.println(yil%4==0 ?yil%100==0 ? yil%400==0 ?"Artık yıl":"Artık yıl değil": "Artık yıl ":"Artık yıl değil");

    }
}
