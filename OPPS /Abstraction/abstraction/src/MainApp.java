
//define abtract class 
abstract class classOne {
    void talk() {
        System.out.println("I can Talk");
    }

    private void eye(String name) {
        System.out.println(name + " This is my eyes");
    }

    void getmyeyes(String name) {
        eye(name);
    }

    abstract void voice();
}

class classTwo extends classOne {
    @Override
    void voice() {
        System.out.println("This Is My Voice");
    }

}

abstract class classThree extends classTwo{
    abstract void run();
}

public class MainApp {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World! Learning About Abstraction");
        classTwo c1 = new classTwo();
        c1.voice();
        c1.talk();
        c1.getmyeyes("Anna");
    }
}
