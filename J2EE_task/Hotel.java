package J2EE_task;

import java.util.ArrayList;


public class Hotel {

    ArrayList<customer> a1 = new ArrayList<>();

    {
        customer c1 = new customer(915601399, "shubham", "pune", 416121, "Shu@1234", "Shu@1234");
        a1.add(c1);
    }
AddItems a=new AddItems();

    public void existing(int phno, String password) {

        AddItems a2 = new AddItems();


        for (customer c1 : a1) {
            if (c1.getPhNO() == phno && c1.getPassword().equals(password)) {
                System.out.println("Login Successful");
                a.addmenu(phno, password);

            } else {
                System.out.println("Invalid password");
            }
        }


    }


        public void newUser(int phno, String name, String add, int pincode, String password, String cPassword)
        {
            boolean status = true;
            while (status)
                if (password.equals(cPassword)) {
                    customer c = new customer(phno, name, add, pincode, password, cPassword);
                    a1.add(c);
                    System.out.println("Account Created successfully");
                    existing(phno, password);
                    status = false;
                }
            if (status = true) {
                System.out.println("Invalid password");
            }
        }



}



