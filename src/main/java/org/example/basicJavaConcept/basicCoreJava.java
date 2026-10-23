package org.example.basicJavaConcept;

// how create a constructor , rules of constructor

// rules of constructor
// 1. constructor name must same as class name
// 2. its does have return type , so need sarted with void
//3. used allocate memory and initalize object.
class Abcd {

    int num1;
    String name;
    int age;

    //1. default constructor which does not have parameterized
    Abcd(){
System.out.println("default constructor");
    }

    // method will return type
    void display(){
        System.out.println("method type");
    }
}
public class basicCoreJava {

    public static void main(String[]args){

        // create object (this object creation only identicates which constructuor  to called it )

        // main method cannot overiding it can method hiding because of static keyword
        // static can be method hiding using reference type
        Abcd x  = new Abcd();
        // calling method
        x.display();
    }

}
