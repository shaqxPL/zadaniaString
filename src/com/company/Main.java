package com.company;

public class Main {

    public static void main(String[] args) {

        String text12 = "To Jest Tekst";
        String lowerText = text12.toLowerCase();

        System.out.println(text12);
        System.out.println(lowerText);

        //inicjalizacja tablicy
       int[] array = new int[5];
        System.out.println("the size of the array is: " + array.length);

       String text = "Mateusz";
        System.out.println("the size of the String is: " + text.length());


        //zamienianie znaków
        String text1 = "Komputer z klawiaturą";
        String text2 = text1.replace('K','C');
        System.out.println("Original String: " + text1);
        System.out.println("New String: " + text2);
    }



}
