package com.company;


public class Shark extends Fish {
    boolean smellOfBlood;

    public Shark(boolean smellOfBlood) {
   this.smellOfBlood=smellOfBlood;

    }


    public String getSmellOfBlood() {
        return "Ест мясо *"+ vegetarian + "* " + "Любит кровь ? - *" + smellOfBlood+ "* " + "Имя туриста которого съела *" + eats+ "* " + "Сколько конечностей ? - *" +noOfLegs+ "*";
    }

       public Shark(int noOfLegs, boolean smellOfBlood) {
        this.noOfLegs = noOfLegs;
        this.smellOfBlood = smellOfBlood;
    }
}
