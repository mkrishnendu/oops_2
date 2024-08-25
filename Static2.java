package oops;
class Women{
    int age;
    String name;
    static String planet="xyz";
    public void ram(){
        System.out.println("kabita");
    }
    static {
        System.out.println("this is static block");
        planet="mars";
    }
    void message(){
        System.out.println("outside non static block");
    }
}
public class Static2 {
    public static void main(String[] args) {
        System.out.println("anyu");
        Women obj=new Women();
        obj.ram();
//        Women.planet="Earth";
        System.out.println(Women.planet);
//        message();

    }

}
