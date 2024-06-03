package App;

public class App {

    //creating private constructor 
    private App(){
        System.out.println("This is private constructor");
    }

    //access the private constructor 
    static App createPrivateConstructorObj(){
      App A1 = new App();
      return A1;
    }

    private int a = 3;

    public int getter() {
        return a;
    }

    public void setter(int b) {
        a = b;
    }

    private int manipulateB(int c) {
        int b = c;
        return b;
    }

    // access private method
    void changePrivateMethod(int d) {
        System.out.println("Accessing Private Method");
        System.out.println("Accessing Private Method : " + manipulateB(d));
    }

    // public static void main(String[] args) throws Exception {
    //     System.out.println("Hello, World! Working On Encapsulation Of Java In Class App");
    //     App A1 = new App();
    //     A1.setter(5);
    //     System.out.println("The Value Of a is : " + A1.getter());
    //     A1.changePrivateMethod(4);
    // }
}

class WorkWithApp {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World! Working On Encapsulation Of Java In Class App");
        App A1 = App.createPrivateConstructorObj();
        A1.setter(5);
        System.out.println("The Value Of a is : " + A1.getter());
        A1.changePrivateMethod(4);
    }
}
