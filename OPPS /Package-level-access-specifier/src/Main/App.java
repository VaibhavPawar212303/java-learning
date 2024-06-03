package Main;

import Alpha.Tests;
import Beta.Demo;

public class App {
    //creating a variable and calling in a class
    int a;
    private static String b = "vaibhav";
    static String c = "class APP";
    //non-static block 
    {
        System.out.println("Hello From The Non Static block : " + c);
    }
    //staic block 
    static {
        System.out.println("Hello From The Static block : " + c);
    }
    // create constructor
    protected App(String c) {
        System.out.println("Hello From The Constructor: " + c);
    }
    // creating a function and calling in a class
    String getName(String b) {
        return b;
    }
    // one class with object creation and calling
    public static void main(String[] args) throws Exception {
        App A1 = new App(c);
        Demo d1 = new Demo();
        Tests t1 = new Tests();
        System.out.println(A1.b);
        System.out.println(A1.getName("Pawar"));

    }
}
