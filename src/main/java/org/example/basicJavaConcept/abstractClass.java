package org.example.basicJavaConcept;


//abstract definition - hide the unnecessary logic implemeteion  only method defination
// using keyword as Abstract
//split into abstract class and abstract method
//one abstract class is there called abstract method
//cpncerate class without abstract class
// in abstract class we cannot create object


abstract class employee {
    abstract void show();
    //concerate method
    void display(){
        System.out.println("concerate method ");
    }
}
class student extends employee{
    void show(){
        System.out.println("abstracted method");
    }
}
public class abstractClass {
// abstract cannot create a object
public static void main(String[] args){
    student s = new student();
    s.show();
    s.display();
}

}
