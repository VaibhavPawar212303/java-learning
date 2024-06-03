import java.lang.instrument.*;

public class App {
    // implicit casting
    int a = 400000;
    double c = a;
    long d = a;
    float f = a;
    char b = 'A';
    int r = b;
    // explicit casting
    float w = (float) c;

    public static void main(String[] args) throws Exception {
        App A1 = new App();
        System.out.println(A1.w);
    }

    public static void premain(String s, Instrumentation i) {
        int c = 4;
        char v = 'g';
        System.out.println("Acccessing Instrumentation Package");
        App A1 = new App();
        System.out.println(i.getObjectSize(v));
    }
}
