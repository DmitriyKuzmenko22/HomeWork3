package com.company;


public class Animal {

    boolean vegetarian;
    String eats;
    int noOfLegs;

    public Animal(){

    }


    public Animal(boolean vegetarian, String eats, int noOfLegs) {
        this.vegetarian = vegetarian;
        this.eats = eats;
        this.noOfLegs = noOfLegs;
    }

    public boolean isVegetarian(){
        return vegetarian;
    }

    public String getEats(){
        return eats;
    }

    public int getNoOfLegs(){
        return noOfLegs;
    }
}
