package oops;
class student_2{
    String name;
     int roll_no=10;
    private int age;
    int marks;
    String address;
    //getter
    int getAge(){
        return age;
    }
    //setter
    void setAge(int age){
        this.age=age;
    }
    student_2(){
        name="krishnendu";
        age=23;
        marks=100;
        address="pindrui";
    }
//   student_2(String name,int roll_no,int age,int marks,String address){
//        this.name=name;
//        this.roll_no=roll_no;
//        this.age=age;
//        this.marks=marks;
//        this.address=address;
//   }

}
public class Encapsulation {
    public static void main(String[] args) {
student_2 student=new student_2();
student.setAge(98);
        System.out.println(student.getAge());
        System.out.println(student.roll_no);
    }
}
