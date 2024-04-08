public class DappledAppV1 {
    void AddTodo(){
        System.out.println("Hello, Welcome To Dappled App V1 You Can Add Your Todo!");
    }
    public static void main(String[] args) throws Exception {
      DappledAppV3 D3 = new DappledAppV3();
      D3.AddTodo();
      D3.AddImage();
      D3.AddVdeo();
    }
}

class DappledAppV2 extends DappledAppV1{
    void AddImage(){
        System.out.println("Hello, Welcome To Dappled App V2 You Can Add Your Image!");
    }
}

class DappledAppV3 extends DappledAppV2{
    void AddVdeo(){
        System.out.println("Hello, Welcome To Dappled App V2 You Can Add Your Video!");
    }
}