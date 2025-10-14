package org.example;

import java.util.HashMap;

public class IntroToJavaOct10 {

    public static void main(String[] args) {
        int wholeNumber = 5;
        long reallyLongNumber = 1239182039812381023L;

        String title = "BraveHeart";

        // float is half the size of a double
        float cost = 14.99f;

        // allows for more precision
        double temperature = 28.123129387189273; // twice the size of a

        HashMap<String,String> starSigns = new HashMap<String,String>();

        starSigns.put("Leo","Orange juice");
        starSigns.put("Capricorn","Cranberry juice");
        starSigns.put("Taurus","Grape Juice");

        System.out.println(starSigns);
        for(String sign : starSigns.keySet()){
            System.out.println(starSigns.get(sign));
        }


//        for(int i = 0; i < 10; i++){
//            System.out.println(i);
//        }


    }

    public String writeMeASonnet(){

        return "";
    }


}











