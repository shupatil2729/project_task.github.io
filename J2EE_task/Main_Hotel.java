package J2EE_task;

import java.util.Scanner;

public class Main_Hotel {
    static double bill;

    public static void main(String[] args) {
        Hotel h=new Hotel();
        AddItems a=new AddItems();

        Scanner sc1=new Scanner(System.in);
        System.out.println("1:Display Manu");
        System.out.println("2:View Bill");
        System.out.println("3:Cancel Order");
        System.out.println("4:Exit");

        int choice=sc1.nextInt();
                switch(choice){
                case 1 :
                    System.out.println("1: if You have Account ");
                    System.out.println("2: if Your new user Account");
                    int ch1=sc1.nextInt();
                    if(ch1==1) {
                        System.out.println("Enter ur mobile number : ");
                        int phno=sc1.nextInt();
                        System.out.println("Enter ur Password : ");
                        String password=sc1.next();
                        a.addmenu(phno,password);
                    }
                    if(ch1==2) {
                        System.out.println("Enter ur phone number ");
                        int phno = sc1.nextInt();

                        System.out.println("Enter ur name : ");
                        String name = sc1.next();

                        System.out.println("Enter ur address");
                        String add = sc1.next();

                        System.out.println("Enter pincode : ");
                        int pincode = sc1.nextInt();

                        System.out.println("Enter passoword");
                        String password = sc1.next();

                        System.out.println("confirm ur pass");
                        String cPassword = sc1.next();
                        h.newUser(phno, name, add, pincode, password, cPassword);


                        System.out.println("1: for Today's Special");
                        System.out.println("2: for Veg");
                        System.out.println("3: for NonVeg ");
                        System.out.println("4: for exit ");
                        int ch = sc1.nextInt();


                        if (ch == 1)
                        {

                            System.out.println("In today's Special we have following items :");

                            System.out.println("1: for pasta1");
                            System.out.println("2: for pasta2");
                            System.out.println("3:  pasta3");
                            System.out.println("4: for exit");
                            int ch11 = sc1.nextInt();

                            if (ch11 == 1) {
                                System.out.println("Enter a Quantity : ");
                                int qty = sc1.nextInt();
                                

                            }
                            else if (ch1 == 2) {
                                System.out.println("Enter a Quantity : ");
                                int qty = sc1.nextInt();


                            }
                           else if (ch1 == 3) {
                                System.out.println("Enter a Quantity : ");
                                int qty = sc1.nextInt();


                            } else {
                                System.out.println("Invalid input...");
                            }
                        }
                        if(ch==2)
                        {

                                        System.out.println("In veg we have following items :");
                                        System.out.println("1: veg1");
                                        System.out.println("2: veg2");
                                        System.out.println("3: veg3");
                                        System.out.println("4:exit");
                                        int ch12=sc1.nextInt();
                                        if(ch12==1) {
                                            System.out.println("Enter a Quantity : ");
                                            int qty1=sc1.nextInt();


                                        }
                                         else if(ch12==2) {
                                            System.out.println("Enter a Quantity : ");
                                            int qty1=sc1.nextInt();

                                        }
                                        else if(ch12==3) {
                                            System.out.println("Enter a Quantity : ");
                                            int qty1=sc1.nextInt();

                                        }

                                        else
                                        {
                                            System.out.println("Invalid input...");
                                        }
                        }


                        if(ch==3){
                                        System.out.println("In Non Veg we have following items : ");

                                        System.out.println("1:  non veg 1 ");
                                        System.out.println("2:  non veg 2");
                                        System.out.println("3:  non veg 3");
                                        System.out.println("4:Exit");
                                        int ch22=sc1.nextInt();
                                        if(ch22==1) {
                                            System.out.println("Enter a Quantity : ");
                                            int qty1=sc1.nextInt();

                                        }
                                        else if(ch22==2) {
                                            System.out.println("Enter a Quantity : ");
                                            int qty1=sc1.nextInt();

                                        }
                                        else if(ch22==3) {
                                            System.out.println("Enter a Quantity : ");
                                            int qty1=sc1.nextInt();

                                        }

                                        else
                                        {
                                            System.out.println("Invalid input...");
                                        }
                        }






                    }
                   // break;
                  case 2:
                  {
                      //view bill





                  }
                 // break;
                    case 3: {

                        //cancel order
                    }
                        break;
                    case 4:
                        //exit



            }
    }
}
