package org.example.designpattern;

public class singlteonDesign {

    private static volatile singlteonDesign instance;

    private singlteonDesign() {
        System.out.println("logger intialization");
    }

    public static singlteonDesign getInstance() {
        if (instance == null) {
            synchronized (singlteonDesign.class) {
                if (instance == null) {
                    instance = new singlteonDesign();
                }
            }
        }
        return instance;
    }
    public void log(String message){
        System.out.println("Log:" + message);
    }
    public static void main(String[]args){
        singlteonDesign log1 = singlteonDesign.getInstance();
        singlteonDesign log2 = singlteonDesign.getInstance();

        log1.log("first messgae");
        log2.log("second messgae");
    }
}
