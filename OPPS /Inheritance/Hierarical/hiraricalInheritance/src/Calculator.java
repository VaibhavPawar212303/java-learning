public class Calculator {
    int total;

    public static void main(String[] args) throws Exception {
        System.out.println("Hello,I am Calculator How Can I Help You!");
        Addition a1 = new Addition();
        Multiplication m1 = new Multiplication();
        System.out.println("Addition : " + a1.addition(3, 5));
        System.out.println("Multiplication : " + m1.multiplication(3, 5));
    }
}

class Addition extends Calculator {
    int addition(int a, int b) {
        System.out.println("Hello,I am Calculator Doing Addition!");
        total = a + b;
        return total;
    }
}

class Multiplication extends Calculator {
    int multiplication(int a, int b) {
        System.out.println("Hello,I am Calculator Doing Multiplication!");
        total = a * b;
        return total;
    }
}