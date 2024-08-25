package oops;

// Corrected Address class with proper constructor inside the class
class Address {
    int house_no;
    int sector;
    String city;
    String state;
    String country; // Renamed to lowercase to match the object reference

    // Constructor for Address
    Address(int house_no, int sector, String city, String state, String country) {
        this.house_no = house_no;
        this.sector = sector;
        this.city = city;
        this.state = state;
        this.country = country;
    }
}

// Name class
class Name {
    String first;
    String last;

    // Constructor for Name
    Name(String first, String last) {
        this.first = first;
        this.last = last;
    }
}

// Student class
class Student {
    Name name;
    int roll_no;
    int age;
    int marks;
    Address address;

    // Constructor for Student
    Student(String first, String last, int roll_no, int age, int marks, Address address) {
        this.name = new Name(first, last); // Corrected the instantiation of Name
        this.roll_no = roll_no;
        this.age = age;
        this.marks = marks;
        this.address = address;
    }
}

// Main class
public class Second {
    public static void main(String[] args) {
        Address address = new Address(12, 6, "Kolkata", "West Bengal", "India");
        Student student_1 = new Student("Akash", "Maji", 10, 19, 90, address);

        System.out.println(student_1.address.country); // Corrected 'country' to lowercase
        System.out.println(student_1.name.first); // Corrected 'first' to lowercase
    }
}
