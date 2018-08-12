package com.egedev.javalearning;

public class Loops {

    public static void main(String[] args) {

        //for loop

        int[] myNumbers = {12, 20, 35, 14, 60, 38};

        int x = myNumbers[0] / 3 * 5;

        System.out.println(x);

        System.out.println("");

        for (int i = 0; i < myNumbers.length; i++) {
            int y = myNumbers[i] / 3 * 5;
            System.out.println(y);
        }

        System.out.println("");

        for (int b : myNumbers){
            int c = b / 3 * 5;
            System.out.println(c);
        }


        System.out.println("");

        for (int a = 0; a < 5; a++){
            int t = a * 4 / 2;
            System.out.println(t);
        }

        System.out.println("");

        int g = 0;
        while (g<10){
            int j = g * 10;
            System.out.println(j);
            g++;

        }

    }
}
