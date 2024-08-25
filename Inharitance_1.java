package oops;


    class A{
        int i,j;
        void showij(){
            System.out.println("i and j: "+i+ " "+ j);
        }
    }

    class B extends A{
        int k;
        void showK(){
            System.out.println("K:"+k);
        }
        void sum(){
            System.out.println("i+j+k :"+(i+j+k));
        }
    }
public class Inharitance_1 {
    public static void main(String[] args) {
A superob=new A();
B subob=new B();
superob.i=10;
superob.j=10;
        System.out.println("contends of superob : ");
        superob.showij();
        System.out.println();
        subob.i=7;
        subob.j=8;
        subob.k=9;
        System.out.println("conatnt of subob: ");
        subob.showij();
        subob.showK();
        System.out.println();
        System.out.println("sum of i,j and k in subOb:");
        subob.sum();
    }
}
