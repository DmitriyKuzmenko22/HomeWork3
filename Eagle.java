package com.company;

public class Eagle extends Bird {
    int lengthWings;

    public Eagle(int lengthWings) {
        this.lengthWings=lengthWings;
    }


    public String getEagle(){
        return "Орёл вегетарианец? - *" + vegetarian + "* Чем питается? *" +eats+ "* Сколько конечностей? *" +noOfLegs+ "* Какая длина крыльев? *" +lengthWings+ ".м*";
    }
}
