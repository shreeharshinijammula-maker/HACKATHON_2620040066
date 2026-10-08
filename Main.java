import java.util.Scanner;

class MovieTicket {
     String movieName;   
     double ticketPrice;
     int numberOfTickets;

    public MovieTicket(String movieName, double ticketPrice, int numberOfTickets) {
        this.movieName = movieName;
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }

    public double calculateTotal() {
        return ticketPrice * numberOfTickets;
    }

    public double calculateDiscount() {
        if (numberOfTickets >= 5) {
            return calculateTotal() * 0.10;
        }
        return 0.0;
    }

    public double calculateFinalAmount() {
        return calculateTotal() - calculateDiscount();
    }

    public void displayBill() {
        System.out.printf("Movie Name: ", movieName);
        System.out.printf("Ticket Price: ", ticketPrice);
        System.out.printf("Number of Tickets: ", numberOfTickets);
        System.out.printf("Total Amount: ", calculateTotal());
        System.out.printf("Discount: ", calculateDiscount());
        System.out.printf("Final Amount: ", calculateFinalAmount());
    }
}

public class Main {
    public static void main(String[] args) {
         (Scanner scanner = new Scanner(System.in)) {
            String movieName = scanner.nextLine();
            double ticketPrice = scanner.nextDouble();
            int numberOfTickets = scanner.nextInt();
            
            MovieTicket ticket = new MovieTicket(movieName, ticketPrice, numberOfTickets);
            ticket.displayBill();
        }
         scanner.close();
    }
}
