package org.example.basicJavaConcept;


//mutiple inheritance is not supported in java ?

//because java will get confused which super class to called that only we called amutoted as complier will dnt which to called
// then how to support using interface mutiple inheritance will achieve
interface a {
    void show();
}
interface b {
    void show();
}
class myclass {
    void display(){
        System.out.println("class extend");
    }
}
class c extends myclass implements a,b{
    public void show(){
        System.out.println("multiple interchitance ");
    }
}
public class mutipleInheritance {
    public static void main(String[]args){
        c obj = new c();
        obj.show();
        obj.display();
    }
}
