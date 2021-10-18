package com.RestaurantFinder;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args){

        //these are for testing purpose only...

        LocalTime openingTime = LocalTime.parse("10:00:00");
        LocalTime closingTime = LocalTime.parse("23:00:00");
        Restaurant restaurant = new Restaurant("Amelie's cafe","Chennai",openingTime,closingTime);
        restaurant.addToMenu("Sweet corn soup",239);
        restaurant.addToMenu("Vegetable lasagne", 299);
    }
}
