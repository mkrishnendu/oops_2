package oops;
    class student_1 {
        String name;
        int roll_no;
        int age;
        int marks;
        String Address;

//        student_1() {//non parameterized constructer
//            name = "krishnendu";
//            roll_no = 10;
//            age = 23;
//            marks = 100;
//            Address = "pindrui";
//        }

        student_1(String name,int roll_no,int age,int marks,String Address){//parametazid constructer
            this.name=name;
            this.roll_no=roll_no;
            this. age=age;
            this.marks=marks;
            this.Address=Address;

        }

    }


public class SampleClass {
    public static void main(String[] args) {
student_1 student=new student_1("ram",21,23,100,"Ajodha");

student.name="Ram";
        System.out.println(student.name);
        System.out.println(student.Address);
        System.out.println(student.roll_no);
        System.out.println(student.marks);
        System.out.println(student.age);
    }
}
