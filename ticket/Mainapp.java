package ticket;

import java.util.Scanner;

public class Mainapp {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        Ticket t1=new Ticket();
        System.out.println("1:BOOK TICKET");
        System.out.println("2:CANCEL TICKET");
        System.out.println("3:AVAILABLE TICKET");
        int choice=sc1.nextInt();
        if(choice==1){
            System.out.println("ENTER NO TICKET BOOK");

            int count=sc1.nextInt();
            t1.bookTicket(count);
            t1.showTicket();
        }
        else if(choice==2){
            System.out.println("CANCEL TICKET");
            int count= sc1.nextInt();
            t1.cancelTickets(count);
            t1.showTicket();
        }
        else if(choice==3){
            t1.showTicket();

        }
        else
        {
            System.out.println("Invalid choice");
        }
    }
}
