package Alpha;

import Main.App;


public class Tests extends App{

    static String c = "class Tests";

    public Tests() {
        super(c);
    }
    public void helloFromTest(){
        System.out.println("Hello, World! From Tests");
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World! From Tests");
    }
}
