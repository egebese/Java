package com.egedev.javalearning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Arrays {

    public static void main(String[] args) {

        //Arrays

        String[] myArray = new String[4];
        myArray[0] = "Ege";
        myArray[1] = "Ali";
        myArray[2] = "Cenk";
        myArray[3] = "Murat";

        System.out.println(myArray[2]);

        int[] myNumberArray = {10,40,60,100};
        System.out.println(myNumberArray[2]);


        //Lists

        ArrayList<String> myMusician = new ArrayList<String>();
        myMusician.add("Ali");
        myMusician.add("Coldplay");
        //Yazdırırken en üste yazsın diye 0 dedik.
        myMusician.add(0, "Ac/Dc");
        myMusician.add("Drake");

        System.out.println(myMusician.get(0));
        System.out.println(myMusician.get(1));
        System.out.println(myMusician.get(2));
        System.out.println(myMusician.get(3));

        //Sets

        HashSet<String> mySet = new HashSet<String>();

        mySet.add("Ege");
        mySet.add("Ege");

        System.out.println(mySet.size());


        //Maps

        HashMap<String, String> myHashMap = new HashMap<String, String>();
        myHashMap.put("name", "James");
        myHashMap.put("telefon", "iPhone");

        System.out.println(myHashMap.get("telefon"));


    }

}
