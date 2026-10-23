package org.example.basicJavaConcept;


// encapsulation means binding data members and methods into a single entity


class demo {

    //instance varaible
    private int age = 22 ;
    private String name = "xxx";

    //getter and setter to read and upadate it

    public int getAge(){
        return age ;
    }
    // return value
    public void setAge(int age){
        this.age = age ;
    }

    public String getName(){
        return name;

    }

    public void setName(String name){
        this.name = name;
    }

}
public class encapsulation {
    public static void main(String[] args){
        demo obj = new demo();
        obj.setAge(50);
        obj.setName("sg");

        System.out.println("Age:" + obj.getAge() + "Name:" + obj.getName());
    }

}
