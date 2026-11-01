package org.example.threadConcept;



class oddEven implements Runnable {
    static int count = 1;
    static String Lock = "Lock";
    private int remenider;

    public void print() {
        System.out.println(Thread.currentThread().getName() + "" + count++);
    }

    oddEven(int remenider) {
        this.remenider = remenider;
    }


    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            synchronized (Lock) {
                if (count % 2 != remenider )
                    try {
                        Lock.wait();

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    print();
                    Lock.notifyAll();



            }

        }
    }
}
public class ThreadOddEven {
    public static void main(String[]args){
        oddEven evenobj = new oddEven(0);
        oddEven oddobj = new oddEven(1);
        Thread even = new Thread(evenobj ,"even number");
        Thread odd = new Thread(oddobj, "odd number");
        even.start();
        odd.start();
    }
}
