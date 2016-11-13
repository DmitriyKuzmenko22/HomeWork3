package com.company;

public class Сow extends Mammal{
    boolean hoof;


    public Сow(boolean vegetarian, String eats, int noOfLegs,boolean hoof ) {
        super(vegetarian, eats, noOfLegs);
        this.vegetarian = vegetarian;
        this.eats = eats;
        this.noOfLegs = noOfLegs;
        this.hoof=hoof;
    }


    public String getCow(){
        return "Ест мясо? *"+vegetarian+"*. Что за класс живтоных? -*"+eats+"*. Сколько конечностей?- *"+noOfLegs+"*. Есть копыта? -*"+hoof+"*";
    }

    public Сow(int noOfLegs,boolean hoof){
        this.noOfLegs = noOfLegs;
        this.hoof=hoof;
    }
}
