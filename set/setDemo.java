package set;

import java.util.Scanner;

public class setDemo {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        StoreBooks store=new StoreBooks();
        boolean status=true;
        while (status) {
            System.out.println("1:Display All book");
            System.out.println("2:Add book to cart");
            System.out.println("3:Vive cart Item");
            System.out.println("4:Remove cart Item");
            System.out.println("5:exit");
            int choice=sc1.nextInt();

            switch (choice){
                case 1:       //display all books
                    store.displayAllBook();
                    break;
                case 2:       //add books to cart
                    System.out.println("enter book name");
                    String name=sc1.next();
                    store.addToCart(name);



                case 3:       //Vive cart Item
                    store.viveCartItem();
                    break;
                case  4:     //Remove cart Item
                    System.out.println("enter book name");
                    String book=sc1.next();
                    store.removeCartItem(book);
                    break;
            }
        }

    }
}
