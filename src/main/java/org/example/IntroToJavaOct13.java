package org.example;

import org.example.animals.Animal;
import org.springframework.http.converter.json.GsonBuilderUtils;

import java.util.*;

public class IntroToJavaOct13 {
    // int, long, float, double, String, boolean

    //todo lambda functions

    // Primitive Types
    private int numberOfSeasons = 4; // int
    private long reallyLongNumber = 123019283912L; // long

    private float cost = 3.99f;
    private double pi = 3.14159265359;

    private static boolean isHot = false;

    //Object
    private String tvShow = "Avatar the Last Airbender";


    public static void main(String[] args) {
        // for loops, while loops, switch case
        // conditional statements

//        if(isHot){
//            System.out.println("Wow, it's hot outside");
//        }
//        else{
//            System.out.println("Wow, it's not hot outside");
//        }


        //int speed;

        //checkSpeed();

        //makeSound();

        //getDrinks();

        //practiceLoops();

        //useDoWhileLoop();

        //djustice - for (init incrementor; while true; increment)

        //for (initialize; comparison; update value)

//        for(int i=0; i < 3; i++){
//
//        }

        // foreach(Thing t: List<Thing>)

        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Banana", "Orange"));

        // enhanced for loop
        for(String character : fruits) {
            System.out.println(character);
        }

        fruits.forEach(character -> {
            System.out.println(character + "is my favorite character");
        });

    }

    private static void useDoWhileLoop() {
        int num = 0;

        do{
            num++;
            System.out.println(num);
        }while(num <= 5);
    }

    private static void practiceLoops() {
        int num = 5;

        int x = 5 + --num;

        int y = 5 + num--;

        while(num > 0){
            System.out.println("Do this");
            num--;
        }


        while(num < 5){
            System.out.println(num);
            num++;
        }
    }

    private static void getDrinks() {
        HashMap<String,String> star_drinks = new HashMap<>();
        star_drinks.put("Leo","Latte");
        star_drinks.put("Cancer","Rootbeer");
        star_drinks.put("Pisces","Drip Coffee");

        for(String key:star_drinks.keySet()){
            System.out.println(star_drinks.get(key));
        }
    }

    private static void makeSound() {
        Animal animal = Animal.CAT;

        switch(animal){
            case CAT:
                System.out.println("Purr");
                break;
            case DOG:
                System.out.println("Woof");
                break;
            case RABBIT:
                System.out.println("Squeak");
                break;
            default:
                System.out.println("Nothing");
        }
    }

    private static void checkSpeed() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the current speed");


        try{
            var speed = sc.nextInt();

            if(speed >= 45){
                System.out.println("You're going too fast");
            }
            else if(speed >= 30){
                System.out.println("You're going teh right speed");
            }
            else{
                System.out.println("You're going to slow");
            }

        }catch (Exception e){
            System.out.print("This is not a valid speed" + e);
        }
    }


    /**
     * This is a multi-line comment
     */

}
