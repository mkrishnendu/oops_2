package oops;
class Human{
    int age;
    String name;
    static String planet;
    static{
        planet="mars";
    }
    Human(int age,String name){
        this.age=age;
        this.name=name;
    }
    void message(String name){
        System.out.println("my name is"+this.name);
    }
    void message(int age){
        System.out.println("my age is"+this.age);
    }
}
public class Polymorphism {
    public static void main(String[] args) {
Human A=new Human(12,"akash");
Human B=new Human(13,"ram");
A.message(18);
B.message("ram");
    }
}
