package org.example.basicJavaConcept;


// function interface will have only one abstract class
// fucntion simplicfy used in lambada expression

@FunctionalInterface
interface function {
    void show();

}

//class functionInter implements function {
//    public void show(){
//        System.out.println("fucntion interface");
//    }
//}
public class funcitionInterface {
    public static void main(String [] args){
        //lambada expression method
        function obj = ()-> System.out.println("fucntion interface");
        obj.show();
    }
}
