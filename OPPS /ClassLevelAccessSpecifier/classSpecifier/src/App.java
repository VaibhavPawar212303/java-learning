public class App {

    int a = 20;
    int b = 30;
    int c = 40;

    int sum() {
        return a + b + c;
    }

    class AppTwo {
        int multiple() {
            return a * b * c;
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!, Working On Class Level Access Specifier");
        // access method in class A1
        App A1 = new App();
        System.out.println(A1.sum());
        // access method in class A2
        App.AppTwo A2 = A1.new AppTwo();
        System.out.println(A2.multiple());
        //calculateZero() cannot access 
        
    }
}

class calculateZero{
    public calculateZero(int value){
      
    }
}