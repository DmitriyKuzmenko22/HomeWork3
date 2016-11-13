# HomeWork3
  !!!ЧАСТЬ1!!!
 
 
package com.company;

public class Main {
Account c2=new Account(3222);
Account c3=new Account(0,2);


System.out.println(c2.getId());
System.out.println(c2);
System.out.println(c3);

System.out.println(c3.getId()+c3.getAmount());

package com.company;

//class2
public class Account {
    int id;
    int amount;

    public Account(){

    }

    public Account(int id) {
        this.id =id;
    }

    public Account (int id, int amount) {
        this.id = id;
        this.amount = amount;
    }
    int getAmount(){
        return amount*6;
    }
    int getId(){
        return id+2;
    }
    }
