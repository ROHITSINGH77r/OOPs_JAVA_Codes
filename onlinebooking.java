class TicketBooking extends Thread {
    String customerName;
    boolean isBooked = false;

    synchronized void bookTicket(String customerName) {
        if (!isBooked) {
            System.out.println("Seat Reserved for " + customerName);
            isBooked = true;
        } else {
            System.out.println("Seat not available for " + customerName);
        }
    }

    public void run() {
        bookTicket(customerName);
    }
}

public class onlinebooking {
    public static void main(String[] args) {
        TicketBooking obj = new TicketBooking();

        Thread t1 = new Thread(() -> obj.bookTicket("abc"));
        Thread t2 = new Thread(() -> obj.bookTicket("def"));
        Thread t3 = new Thread(() -> obj.bookTicket("ghi"));
        t1.start();
        t2.start();
        t3.start();
    }
}