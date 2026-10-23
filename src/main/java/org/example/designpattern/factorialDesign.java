package org.example.designpattern;

public class factorialDesign {

    public static void main(String[]args){
        notificatory factory = new notificatory();
        notification email = factory.create("email");
        email.send("hello world email");
        notification sms = factory.create("sms");
        sms.send("hello world sms");
    }
}

interface notification {
    void send(String message);
}

class emailnotification implements notification {
    @Override
    public void send(String message){
        System.out.println("email notificaton: " + message);
    }

}

class smsNotification implements notification {
    @Override
    public void send(String message){
        System.out.println("sms notification:"+message);
    }
}

class notificatory {
    public static notification create(String type){
       return switch(type.toLowerCase()){
    case "email" -> new emailnotification();
    case "sms" -> new smsNotification();
    default -> throw new IllegalArgumentException("Unknown type:" + type);
};
    }
}
