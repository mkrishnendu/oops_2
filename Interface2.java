package oops;

interface Room_1 {
    int area();
    int perimeter();
}

interface Room_2 {
    int area();
    int perimeter();
}

class Boy_1 implements Room_1 {
    int side = 2;

    Boy_1() {
        System.out.println("Square class constructor");
    }

    @Override
    public int area() {
        return side * side;
    }

    @Override
    public int perimeter() {
        return 4 * side;
    }
}

class Girl_1 implements Room_2 {
    int radius = 3;

    Girl_1() {
        System.out.println("Circle class constructor");
    }

    @Override
    public int area() {
        return (int) (Math.PI * radius * radius);
    }

    @Override
    public int perimeter() {
        return (int) (2 * Math.PI * radius);
    }
}

public class Interface2 {
    public static void main(String[] args) {
        Boy_1 boy = new Boy_1();
        System.out.println("Square area: " + boy.area());
        System.out.println("Square perimeter: " + boy.perimeter());

        Girl_1 girl = new Girl_1();
        System.out.println("Circle area: " + girl.area());
        System.out.println("Circle perimeter: " + girl.perimeter());
    }
}
