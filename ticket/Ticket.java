package ticket;

public class Ticket {
    static int availableTicket =50;
    static double ticketCost = 100;

    // int bookingcount=0;
    void bookTicket(int bookingCount) {
        if (availableTicket  >= bookingCount) {
            availableTicket = availableTicket - bookingCount;
            double totalAmt = bookingCount * ticketCost;
            System.out.println("TOTAL AMT " + totalAmt);
            System.out.println("TICKET HAE BEEN BOOKED" + bookingCount);
            //showTickets();
        } else {
            System.out.println("TICKETS ARE NOT AVAILABLE");
        }
    }

    void cancelTickets(int cancleCount) {
        availableTicket = availableTicket + cancleCount;
        System.out.println("TICKET HAVE BEEN CANCELED" + cancleCount);
        showTicket();
    }

        void showTicket ()
        {
            System.out.println("Available ticket" + availableTicket);
        }
    }
