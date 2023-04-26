package j;

import java.util.ArrayList;
import java.util.Scanner;

class AddItem{

    Items i;

    public void placeOrder(long phno) {
        ArrayList<Items> items=new ArrayList<Items>();
        Scanner sc=new Scanner(System.in);
        boolean flag=true;
        while(flag) {
            System.out.println("Press 1 for Today's Special \nPress 2 for Veg \nPress 3 for NonVeg \nPress 4 for view bill \n press 5 for exit : ");
            int ch=sc.nextInt();
            switch(ch) {
                case 1 : boolean flag1=true;
                    while(flag1) {
                        System.out.println("In today's Special we have following items : "
                                + "\n Press 1 for Lazania \nPress 2 for pasta \nPress 3 for Special Shwarma \n press 4 for exit" );
                        int ch1=sc.nextInt();

                        if(ch1==1) {
                            System.out.println("Enter a Quantity : ");
                            int qty=sc.nextInt();
                            String itemName="Lazania";
                            double itemPrice=125.25;
                            int itemQty=qty;
                            i = new Items(itemName,itemPrice,itemQty,phno);
                            items.add(i);

                        }
                        else if(ch1==2) {
                            System.out.println("Enter a Quantity : ");
                            int qty=sc.nextInt();
                            String itemName="pasta";
                            double itemPrice=145.25;
                            int itemQty=qty;
                            i = new Items(itemName,itemPrice,itemQty,phno);
                            items.add(i);


                        }
                        else if(ch1==3) {
                            System.out.println("Enter a Quantity : ");
                            int qty=sc.nextInt();
                            String itemName="Special Shwarma";
                            double itemPrice=445.25;
                            int itemQty=qty;
                            i = new Items(itemName,itemPrice,itemQty,phno);
                            items.add(i);

                        }
                        else if(ch1==4){
                            flag1=false;
                        }
                        else {
                            System.out.println("Invalid input...");
                        }
                    }
                    break;


                case 2 :  boolean flag2=true;
                    while(flag2) {
                        System.out.println("In veg we have following items : "
                                + "\n Press 1 for Paneer chilii \nPress 2 for Butter paneer \nPress 3 for Special veg mushroom  \n Press 4 to exit" );
                        int ch2=sc.nextInt();
                        if(ch2==1) {
                            System.out.println("Enter a Quantity : ");
                            int qty1=sc.nextInt();
                            String itemName="Paneer chillii";
                            double itemPrice=228.69;
                            int itemQty=qty1;
                            i = new Items(itemName,itemPrice,itemQty,phno);
                            items.add(i);

                        }
                        else if(ch2==2) {
                            System.out.println("Enter a Quantity : ");
                            int qty1=sc.nextInt();
                            String itemName="Butter panneer";
                            double itemPrice=i.getItemPrice();
                            int itemQty=qty1;
                            i = new Items(itemName,itemPrice,itemQty,phno);
                        }
                        else if(ch2==3) {
                            System.out.println("Enter a Quantity : ");
                            int qty1=sc.nextInt();
                            String itemName="Special veg mushroom";
                            double itemPrice=325.25;
                            int itemQty=qty1;
                            i = new Items(itemName,itemPrice,itemQty,phno);
                            items.add(i);
                        }
                        else if(ch2==4){
                            flag2=false;
                        }
                        else {
                            System.out.println("Invalid input...");
                        }
                    }
                    break;


                case 3 :   boolean flag3=true;
                    while(flag3) {
                        System.out.println("In Non Veg we have following items : "
                                + "\n Press 1 for chicken chilii \nPress 2 for Butter chicken \nPress 3 for Special Prawns \n press 4 to exit " );
                        int ch2=sc.nextInt();
                        if(ch2==1) {
                            System.out.println("Enter a Quantity : ");
                            int qty1=sc.nextInt();
                            String itemName="Special veg mushroom";
                            double itemPrice=325.25;
                            int itemQty=qty1;
                            i = new Items(itemName,itemPrice,itemQty,phno);
                            items.add(i);


                        }
                        else if(ch2==2) {
                            System.out.println("Enter a Quantity : ");
                            int qty1=sc.nextInt();
                            String itemName="Special veg mushroom";
                            double itemPrice=325.25;
                            int itemQty=qty1;
                            i = new Items(itemName,itemPrice,itemQty,phno);
                            items.add(i);
                        }
                        else if(ch2==3) {
                            System.out.println("Enter a Quantity : ");
                            int qty1=sc.nextInt();
                            String itemName="Special veg mushroom";
                            double itemPrice=325.25;
                            int itemQty=qty1;
                            i = new Items(itemName,itemPrice,itemQty,phno);
                            items.add(i);
                        }
                        else if(ch2==4){
                            flag3=false;
                        }
                        else {
                            System.out.println("Invalid input...");
                        }
                    }
                    break;

                case 4 :
                    for(Items e:items) {
                        System.out.println(e);
                    }
                    break;

                case 5 : flag=false;


            }
        }
    }
}
