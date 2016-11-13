package com.company;

public class Mammal extends Animal {

    public Mammal(){

    }

    public Mammal(boolean vegetarian, String eats, int noOfLegs) {
        super(vegetarian, eats, noOfLegs);
        this.vegetarian = vegetarian;
        this.eats = eats;
        this.noOfLegs = noOfLegs;
    }
}
