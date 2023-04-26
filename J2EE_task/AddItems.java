package J2EE_task;
import java.util.ArrayList;


public class AddItems {



/*

       public double displaySpecialMenu(String name,double price ,int qty)
        {
            double result= price*qty;
            return result;
        }
       public double  displayVegMenu(String name,double price,int qty)
        {
            double result= price*qty;
            return result;
        }
       public double displayNonMenu(String name,double price,int qty)
        {
            double result= price*qty;
            return result;
        }
        */

        public void addmenu(int pnno,String passwod)
        {

            ArrayList <Items>specialMenu=new ArrayList<>();
            {
                Items s1=new Items("past",150.00);
                Items s2=new Items("past1",250.00);
                Items s3=new Items("past2",350.00);
                specialMenu.add(s1);
                specialMenu.add(s2);
                specialMenu.add(s3);
            }
            ArrayList <Items>vegMenu=new ArrayList<>();
            {
                Items v1=new Items("veg",350.00);
                Items v2=new Items("veg",450.00);
                Items v3=new Items("veg",550.00);
                vegMenu.add(v1);
                vegMenu.add(v2);
                vegMenu.add(v3);
            }
            ArrayList <Items>nonMenu=new ArrayList<>();
            {
                Items n1=new Items("nonveg",200.00);
                Items n2=new Items("nonveg1",300.00);
                Items n3=new Items("nonveg2",4000.00);
                nonMenu.add(n1);
                nonMenu.add(n2);
                nonMenu.add(n3);
            }

        }
        public void viewbill(double bill){
            System.out.println(bill);

        }

    }






