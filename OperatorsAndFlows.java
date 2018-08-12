package com.egedev.javalearning;

public class OperatorsAndFlows {

    public static void main(String[] args) {

        int x = 5;
        System.out.println(x);

        x = x + 1;
        System.out.println(x);

        x++;
        System.out.println(x);

        x--;
        System.out.println(x);

        x = x * 5;
        System.out.println(x);


        int x = 30;
        int y = 4;
        System.out.println(x>y);

        y++;
        System.out.println(x>y);

        y = 31;
        System.out.println(x>y);

        y--;
        System.out.println(x==y);

        System.out.println(x!=y);

        x = 31;
        y = 31;

        // and &&
        // or ||


        //if flows

        if (x>y){
            System.out.println("x is bigger than y!");
        } else if (y>x){
            System.out.println("y is bigger than x!");
        } else {
            System.out.println("x = y");
        }

        //switch

        int day = 2;
        String dayString = "";

            if (day == 1) {
                dayString = "Monday";
            } else if (day == 2){
                dayString = "Tuesday";
            } else if (day == 3){
                dayString = "Wednesday";
            } else {
                System.out.println("none");
            }

        System.out.println(dayString);


            switch (day){
                case 1:
                    dayString = "Monday";
                    break;
                case 2:
                    dayString = "Tuesday";
                    break;
                case 3:
                    dayString = "Wednesday";
                default:
                    dayString = "none";
                    break;
            }

        System.out.println(dayString);


    }
}
