package oops;

public class Inharitance { // Corrected spelling of 'Inheritance'

    static class Species {//parent class
        int age;

        Species(int age) {
            this.age = age;
        }
    }

    public static class Human extends Species {//base class
        String name;

        Human(String name, int age) {
            super(age);
            this.name = name;
        }
    }

    public static class Animal extends Species {//base class
        String type;

        Animal(String type, int age) {
            super(age);
            this.type = type;
        }
    }

    public static void main(String[] args) {
        Human human = new Human("John", 30);
        Animal animal = new Animal("Carnivorous", 12);

        System.out.println(human.name);
        System.out.println(human.age);
        System.out.println(animal.type);
        System.out.println(animal.age);
    }
}
