public class nonPrimitiveCasting {

    void walk() {
        System.out.println("Hello I can walk");
    }

    void speak(){

    }

    public static void main(String[] args) {
        nonPrimitiveCasting N1 = new nonPrimitiveCasting();
        N1.walk();

        nonPrimitiveCasting N2 = new changeMethod();
        N2.speak();

        
    }

}

class changeMethod extends nonPrimitiveCasting{
     @Override
     void speak() {
         System.out.println("Hey I can Speak");
     }
}
