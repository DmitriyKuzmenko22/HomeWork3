package com.company;

public class Main {

    public static void main(String[] args) {
 Shark shark1=new Shark(true);
 Shark shark2=new Shark(false);

Eagle orel1=new Eagle(5);
Eagle orel2=new Eagle(10);

        Сow cow1=new Сow(false,"Тигр",4,false);
        Сow ww2=new Сow(6,true);

        System.out.println(shark1.getSmellOfBlood());
        System.out.println("Сколько конечнсотей? *" + shark2.noOfLegs + "* Любит кровь?- " + shark2.smellOfBlood);

        System.out.println(orel1.getEagle());
       System.out.println("чем питается наш орёл?- "+orel2.eats+". Сколько конечность у него?- "+orel2.noOfLegs+". А длина крыльев ?"+orel2.lengthWings+"м.");

        System.out.println(cow1.getCow());
        System.out.println(ww2.noOfLegs+" "+ww2.hoof);

//        Account c1=new Account();
//Account c2=new Account(3222);
//Account c3=new Account(0,2);
//
//
//System.out.println("c2.getId()= "+c2.getId());
//System.out.println("c2= "+c2);
//System.out.println("c3= "+c3);
//
//System.out.println("c3.getId()+c3.getAmount()=  "+c3.getId()+c3.getAmount());
    }
}
