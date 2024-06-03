public class App {

    private App() {
        System.out.println("This is private constructor");
    }

    // static initalizing obj
    static App A1 = new App();

    // static initalizing block
    static App A2;
    static {
        System.out.println("Creating static method object");
        A2 = new App();
    }

    // static initalizing method
    static App getObj() {
        App A1 = new App();
        return A1;
    }

    void uploadImage(String name) {
        System.out.println("Image Uploaded successfully for " + name);
    }
    // public static void main(String[] args) throws Exception {
    // System.out.println("Hello, World! Working with singleton class creation with
    // 3 different methods");
    // App A1 = new App();
    // }
}

class testApp {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World! Working with singleton class creation with 3 different methods");
        App A1 = App.getObj();
        A1.uploadImage("Test App");
        // create first device
        App laptop = App.A1;
        laptop.uploadImage("laptop");
        // create second device
        App mobile = App.A1;
        mobile.uploadImage("mobile");
        // create third device
        App tablet = App.A2;
        tablet.uploadImage("tablet");

    }

}