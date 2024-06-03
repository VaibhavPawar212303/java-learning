public class App {
    int a = 10;
    static int b = 20;
    int c = 30;
    final int d = 40;

    int testApp() {
        return this.a;
    }

    int testAppTwo() {
        return this.b;
    }

    int testThree() {
        return this.c;
    }

    final int testFour() {
        return this.d;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!, Difference Between This And Super");
        App A1 = new App();
        AppTwo A2 = new AppTwo();
        // System.out.println(this.a); cannot access in static method
        System.out.println(A1.testApp());
        System.out.println(A1.testAppTwo());
        System.out.println(A2.add());
        System.out.println(A2.testAppTwo());
        // A1.d = 60; not able to change final variable value
        System.out.println(A1.testFour()); //can access final method
    }
}

class AppTwo extends App {
    int add() {
        return super.a + super.b + super.c;
    }

    // @Override 
    // int testFour(){
    // }   
    // cannot access final method 

    @Override
    int testAppTwo(){
        return d;
    }

}