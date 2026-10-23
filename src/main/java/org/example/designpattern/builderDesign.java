package org.example.designpattern;

public class builderDesign {
    String name;
    String email;
    int age;

    public builderDesign ( String name , String email , int age){
   this.name = name;
   this.email = email;
   this.age = age;

    }

    @Override
    public String toString(){
        return "User:{name='" + name + "', age =" + age +", email='" + email +"' }";
    }

}

class Builder {
   private String name;
    private String email;
    private int age;

    public Builder setName(String name){
        this.name = name;
        return this;
    }

    public Builder setEmail(String email){
        this.email = email;
        return this;
    }

    public Builder setAge(int age){
        this.age = age;
        return this;
    }

    public builderDesign build(){
        return new builderDesign(name,email,age);
    }

}
class main {
    public static void main(String[]args){
        builderDesign user1 = new Builder()
                .setName("xxxx").setEmail("aa2@gmail.com").setAge(23).build();
        builderDesign user2 = new Builder()
                .setName("sharmila").setEmail("sharmila0992@gmail.com").setAge(24).build();

        System.out.println(user1);
        System.out.println(user2);
    }
}

