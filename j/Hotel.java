package j;

import java.util.ArrayList;
import java.util.Scanner;

class Hotel {

 Customer c;
 ArrayList<Customer> a1 = new ArrayList<Customer>();
 Scanner sc = new Scanner(System.in);

 public void existing() {
  System.out.println("Enter ur mobile number : ");
  long phno = sc.nextLong();
  System.out.println("Enter ur Password : ");
  String password = sc.next();
  AddItem a2 = new AddItem();
  if (this.c != null) {
   for (Customer c1 : a1) {
    if (c1.getPhNO() == phno && c1.getPassword().equals(password)) {
     System.out.println("Login Sucessfull /n Press 1 to place order");
     int c = sc.nextInt();
     if (c == 1) {
      a2.placeOrder(phno);

     }
    } else {
     System.out.println("Invalid password...");
    }
   }

  } else {
   System.out.println("Create account first...");
  }

 }

 public void newUser() {
  System.out.println("Enter ur phone number ");
  long phno = sc.nextLong();

  System.out.println("Enter ur name : ");
  String name = sc.next();

  System.out.println("Enter ur address");
  String add = sc.next();

  System.out.println("Enter pincode : ");
  int pincode = sc.nextInt();

  System.out.println("Enter passoword");
  String rawPassword = sc.next();
  String password = null;
  if (rawPassword.matches("^(?=.[a-z])(?=.[A-Z])(?=.[!@#$%^&()-+=])(?=\\S+$).{8,}$")) {
   //(?=.*[a-z]): the password must contain at least one lowercase letter
//				 (?=.*[A-Z]): the password must contain at least one uppercase letter
//				 (?=.[!@#$%^&()-+=]): the password must contain at least one special character
//				 (?=\\S+$): the password must not contain any whitespace characters
//				 .{8,}: the password must be at least 8 characters long
   password = rawPassword;
   System.out.println("confirm ur pass");
   String cPassword = sc.next();


   if (password.equals(cPassword)) {
    c = new Customer(phno, name, add, pincode, password, cPassword);
    a1.add(c);
    System.out.println("Account Created sucessfully \n Press 1 to Login");
    int ch = sc.nextInt();
    if (ch == 1) {
     existing();
    }
   }
  } else {
   System.out.println("Invalid password");
  }

 }
}
