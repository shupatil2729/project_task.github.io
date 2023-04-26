package Array;

public class storeManager {

    static String[] product={"tv","laptop","mobile"};
    static double [] cost={10,20,30};
    static int stock[]={25,10,50};

    public void calculationBill(int choice,int qty){
             boolean found=false;
             for (int a=0;a<product.length;a++){
        if(choice==a && qty<=stock[a]) {
            double total = qty * cost[a];
        stock[a] = qty;
            System.out.println(qty);
        System.out.println("total bill" + total);
        found = true;
        }

        }
        if(!found){
        System.out.println("out of stock");

        }
        }
        }

