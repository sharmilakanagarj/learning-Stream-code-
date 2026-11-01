package org.example.threadConcept;

public class Resturants {
     static class kitchen implements Runnable {
         static String Lock = "Lock";
public static  void preapreFood() {

    System.out.println("kitchen is in  " + Thread.currentThread().getName());

synchronized (Lock) {
    System.out.println("food is preapring " + Thread.currentThread().getName());
    try{
        Thread.sleep(3000);
        System.out.println("food is ready"+Thread.currentThread().getName());
    }catch(InterruptedException e){
        e.printStackTrace();
    }
}


//    try{
//        Thread.sleep(3000);
//System.out.println("food is ready"+Thread.currentThread().getName());
//    }catch(InterruptedException e){
//e.printStackTrace();
//    }

         }




         @Override
         public void run() {
    System.out.println("food is order"+Thread.currentThread().getName());
    preapreFood();

         }
     }
     public static void main(String[]args){
         kitchen kitchen = new kitchen();
         Thread t1 = new Thread(kitchen);
         t1.start();
         Thread t2 = new Thread(kitchen);
         t2.start();
         Thread t3 = new Thread(kitchen);
         t3.start();
     }
}
