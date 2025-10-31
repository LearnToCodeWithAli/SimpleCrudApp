package org.example;

import java.util.*;

public class IntroToJavaOct20 {

    String greeting = "Good morning";
    int wholeNumber =  9;
    long bigWholeNumber = 1_212_314_324_234L;

    float cost = 3.99f; //
    double pi = 3.1415926; // floating point number

    boolean isTired = true;

    //classes - abstraction/polymorphism/inheritance
    // classes, books, instantiating object
    /* ArrayList, HashSet, HashMap, conditional,
        loops, functions
    */
    //react, clojure, flutter, splunk, php
    //clojure, clojure script, datomic
    // composition

    //todo app that helps get over fear of streaming

    public static void main(String[] args) {

        //
        String[] fruits = {"apple", "banana", "cherry"};

        //ArrayList - mutable, ordered, indexable, allows duplicates
        List<String> flowers = new ArrayList<>();
        flowers.add("lily");
        flowers.add("rose");
        flowers.add("hibiscus");
        flowers.add("plezroza");
        flowers.add("sunflower");
//        System.out.println(flowers.get(2));

//        System.out.println(flowers);
        flowers.remove("lily");
//        System.out.println(flowers);
//        System.out.println(flowers.size());

        /* HashSet - unordered, not indexable,
            mutable, no duplicates
         */
        Set<String> colors = new HashSet<>();
        colors.add("purple");
        colors.add("gray");
        colors.add("blue");
        colors.add("peach");
        colors.add("gold");
//        System.out.println(colors);
//        colors.add("gray");
//        System.out.println(colors);
//
        var colors2 = Arrays.stream(colors.toArray()).sorted();
//        System.out.println(colors2.toList());


        HashMap<String,String> meals = new HashMap<>();
        meals.put("breakfast", "eggs");
        meals.put("brunch", "french toast");
        meals.put("lunch", "quesadillas");
        meals.put("second lunch", "t-bone steak on charcoal grill");
        meals.put("dinner", "buldak");
        meals.put("dessert", "pumpkin pie");
        meals.put("snack","onigiri");

        for(String meal:meals.keySet()){
            System.out.println("For " + meal + " I had " + meals.get(meal));
        }




    }



}


























