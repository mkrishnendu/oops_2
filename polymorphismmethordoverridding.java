package oops;
class Shape{
    int sides;
//    final void area(){
//        System.out.println("Area inside shape class");
//    }
    void area1(){
        System.out.println("Area inside shape class");
    }
}

class Squre extends Shape{
    int sides;
//    @Override
    void area(){
        System.out.println("area inside squre class");
    }
}

class Triangle extends Shape{
    int type;
//    @Override
    void area(){
        System.out.println("area inside Triangle");
    }
}
public class polymorphismmethordoverridding {
    public static void main(String[] args) {
//Shape shape=new Shape();
Squre squre =new Squre();
Triangle triangle=new Triangle();
//shape.area();
//squre.area();
//triangle.area();
Shape shape =new Shape();
shape.area1 ();


    }
}
