package Ders;

import java.util.*;

public class C38_ArrayArrayListForeach {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};//-------------------------------------> array tanimladik

        List<Integer> arrListe = new ArrayList<>();//--------------> list'e giris

        for (int i = 0; i < arr.length; i++) {//--->
            arrListe.add(arr[i]);             //---------------->arrayden list olusturduk
        }

        System.out.println("list : " + arrListe);//--------------->list yazdirma...list : [1, 2, 3]

        Integer[] arrNew = arrListe.toArray(new Integer[0]);//---> list'den tekrar array olusturduk

        System.out.println("array : " + Arrays.toString(arrNew));//--->array tekrar yazildi...array : [1, 2, 3]
        System.out.println("***************************************");
        System.out.println();
        int[] arr2 = new int[3];
        Scanner oku = new Scanner(System.in);

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(i + ".indexdeki sayiyi giriniz :");
            arr2[i] = oku.nextInt();
            System.out.println(arr2[i]);

        }
        System.out.println(Arrays.toString(arr2));
        System.out.println("***************************************");
        System.out.println();
        int[] arr3 = {1, 2, 3};

        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = (int) Math.pow(arr3[i], 2);// her elementin karesi alindi

        }
        System.out.println(Arrays.toString(arr3));//[1, 4, 9]
        System.out.println();

        int[] arr4 = {2, 3, 4};
        int toplam = 0;

        for (int each : arr4//----------------------->foreach kullanimina ornek
        ) {

            toplam += (int) Math.pow(each, 2);
        }
        System.out.println(toplam);//29
        System.out.println("***************************************");
        System.out.println();
        int[] arr5 = {3, 4, 5};
        List<Integer> liste = new ArrayList<>();//liste tanimlandi


        for (int each : arr5//------------------->foreach ile liste olusturuldu
        ) {
            liste.add(each);

        }
        System.out.println(liste);//[3, 4, 5]
        System.out.println("***************************************");
        System.out.println();
        int[] arr6 = {1, 2, 3};

        int[] arr7 = arrOlustur(arr6);//------------------------->method ile array tanimlandi
        System.out.println(Arrays.toString(arr2));//[1, 4, 9]
        System.out.println("***************************************");
        System.out.println();
        Random rnd=new Random();//---------------->random class'inin kullanilisi
        int sayi7=0;

        List<Integer> randomListe=new ArrayList<>();//--------->list tanimlandi

        while(randomListe.size()<4){//------------------------>4 elementli bir listeye cevirilsi
            sayi7=rnd.nextInt(10);//----------------->10'dan kucuk 4 adet element alindi
            randomListe.add(sayi7);//------------------->listeye bu 4 element eklendi
        }

        System.out.println(randomListe);//[9, 0, 5, 8],[8, 9, 3, 0]...


    }

    public static int[] arrOlustur(int[] arr6) {
        for (int i = 0; i < arr6.length; i++) {
            arr6[i] *= arr6[i];//---------------->her elementin karesi alindi

        }
        return arr6;//----------->method'un array olarak donusu
    }




    }

