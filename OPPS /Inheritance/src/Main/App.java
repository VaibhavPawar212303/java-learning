package Main;

import Alpha.Tests;
import Beta.Demo;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World! From Main");
        Demo d1 = new Demo();
        d1.helloFromDemo();
        Tests t1 = new Tests();
        t1.helloFromTest();
    }
}
