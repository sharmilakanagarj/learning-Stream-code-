package org.example.basicJavaConcept;


// interface has default abstract method
// here we can defined
// interface cannot create object it can use obj reference
// interface can decalare varabiable and varaible will be static and final
//interface provide design based upon that you can cretae method
// types interface
//1. normal interface
//2. function interface
//3. mark interface
//4. how multipl inhertance in interface
//5. static and default method in interface

//this example for normal interface which contins more than one method
interface  AA {
    void show();  // here default is abstract
    void display();
}

class Aimp implements  AA {
    @Override
    public void show(){
        System.out.println("interface display");
    }
    @Override
    public void display(){
        System.out.println("normal interface");
    }
}
public class interfacetopic {

    public static void main(String[] args){
        Aimp obj = new Aimp();
        obj.show();
        obj.display();
    }
}
