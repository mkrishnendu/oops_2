package oops;

class Animal{
    protected boolean color;

    void eat(){System.out.println("eating...");}
}

class kutta extends Animal{
    void bark(){System.out.println("barking...");}
}
class singleInharitance{
    public static void main(String args[]){
        kutta d=new kutta();
        d.bark();
        d.eat();
    }}