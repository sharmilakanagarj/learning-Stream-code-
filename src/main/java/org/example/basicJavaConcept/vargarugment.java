package org.example.basicJavaConcept;


class varAddition {
    int sum = 0;
// logic of this we use variable argument length here we fellow
// some rules like variable argument must be at last not in between or at first 
    public int add( int k,int ...i){
        for(int val:i)
            sum = sum + val;
        System.out.println(k);
            return sum ;

    }
}
public class vargarugment {
    public static void main (String[]args){
varAddition obj = new varAddition();
int res = obj.add(8,9,0);
System.out.println(res);
    }

}
