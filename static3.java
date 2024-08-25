package oops;

class Test {
    static class Birds { // The inner class must be static to contain static members
        int age;
        String name;
        static String planet;

        static {
            planet = "Mars";
        }

        Birds(int age, String name) {
            this.age = age;
            this.name = name;
        }

        static void message() { // Static method
            System.out.println("My name is XYZ, and I live on planet " + planet);
        }

        void showDetails() { // Non-static method
            System.out.println("My name is " + this.name + ", and I am " + this.age + " years old.");
        }
    }
}

public class static3 {
    public static void main(String[] args) {
        Test.Birds A = new Test.Birds(12, "Kamal");
        Test.Birds B = new Test.Birds(23, "Firoj");

        A.showDetails(); // Non-static method called on object A
        B.showDetails(); // Non-static method called on object B

        Test.Birds.message(); // Static method called directly via class reference
//        Birds.message(); // Static method called directly via class reference
    }
}
