public class App {

    //declare stats 
    int ticketPrice = 15;
    int seatBooked  = 0;
    int totalAmount;

    //declare fun 
    int bookTicket(int totalTicket){
        totalAmount = ticketPrice * totalTicket;
        return totalAmount;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Please Book Your Ticket!");
        App a1 = new App();
        System.out.println( a1.bookTicket(3));
        pune p1 = new pune();
        System.out.println( p1.PurchaseTicket(5));
    }
}

class pune extends App{
    //declare fun 
    int PurchaseTicket(int totalTicket){
        System.out.println("Hello, Your Ticket Has Purchased!");
        totalAmount = ticketPrice * totalTicket;
        return totalAmount;
    }
}