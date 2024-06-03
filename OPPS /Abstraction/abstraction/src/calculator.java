 interface data {
   int a = 0;
   int b = 0;
   int c = 0;
   int sum = 0;

   int add();
   int multiply();
   int division();
}



public class calculator implements data{

    @Override
    public int add() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public int multiply() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'multiply'");
    }

    @Override
    public int division() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'division'");
    }
    
}
