package Beta;

import Main.App;

public class Demo extends App{
    static String c = "class Demo";
    
    public Demo() {
        super(c);
    }
    
    public void helloFromDemo(){
        System.out.println("Hello, World! From Demo");
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World! From Demo");
        //System.out.println(b);
    }
}
