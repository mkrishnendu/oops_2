package oops;

// Define the Room interface
interface Room {
    int sides = 4; // Typically, a room is a square or rectangle; hence sides are 4
    int area(); // Method to calculate area
    int perimeter(); // Correct spelling of perimeter
}

// Implementing the Room interface in the Boy class
class Boy implements Room {
    int side; // Side of the square

    // Constructor for the Boy class
    Boy() {
        this.side = 5; // Example value; can be set to any side length
        System.out.println("Square class constructed");
    }

    // Implementation of the area method
    public int area() {
        return side * side;
    }

    // Implementation of the perimeter method
    public int perimeter() {
        return 4 * side;
    }
}

// Implementing the Room interface in the Girl class
class Girl implements Room {
    int radius; // Radius of the circle

    // Constructor for the Girl class
    Girl() {
        this.radius = 3; // Example value; can be set to any radius
        System.out.println("Circle class constructed");
    }

    // Implementation of the area method (placeholder for circles)
    public int area() {
        return (int) (Math.PI * radius * radius); // Using Math.PI for circle area
    }

    // Implementation of the perimeter method (corrected)
    public int perimeter() {
        return (int) (2 * Math.PI * radius); // Using Math.PI for circle perimeter (circumference)
    }
}

// Main class
public class Interface {
    public static void main(String[] args) {
        Boy boy = new Boy(); // Create a Boy object
        System.out.println("Square area: " + boy.area());
        System.out.println("Square perimeter: " + boy.perimeter());

        Girl girl = new Girl(); // Create a Girl object
        System.out.println("Circle area: " + girl.area());
        System.out.println("Circle perimeter: " + girl.perimeter());
    }
}
