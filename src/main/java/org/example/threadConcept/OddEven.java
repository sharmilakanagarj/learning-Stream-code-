package org.example.threadConcept;

public class OddEven  implements  Runnable{

    static int count = 1;
    static String Lock = "Lock";
    int remenider ;

    public void printer(){
        System.out.println(Thread.currentThread().getName() + "" + "counter");
    }

    OddEven(int remenider){
        this.remenider = remenider;
    }

    @Override
    public void run (){
for(int i =0 ;i<=2; i++){
    if(count % 2 ==0){
      try{
          Lock.wait();
        }
      catch(InterruptedException e){
          e.printStackTrace();
      }
      printer();
      Lock.notifyAll();
    }
}
    }

    public class threadOddEven {
        public static void main(String[] args) {
            OddEven evenob = new OddEven(0);
            OddEven Oddob = new OddEven(1);

            Thread even = new Thread(evenob, "even number");
            Thread odd = new Thread(Oddob, "odd number");
            even.start();
            odd.start();
        }
    }

}

