package set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class StoreBooks {
     HashSet<String> bookset=new HashSet<>();
     LinkedHashSet <String> CartItem=new LinkedHashSet<>();

    {
        bookset.add("java");
        bookset.add("sql");
        bookset.add("spring");
        bookset.add("manual");
    }

    void displayAllBook() {
        System.out.println("Book name");

        System.out.println("=======");
        //  for(String s:bookset);
        System.out.println(bookset);
        for(String s1:bookset)
            System.out.println(s1);
    }
    void addToCart(String bookname) {
        boolean found = bookset.contains(bookname);
        if (found) {
            CartItem.add(bookname);
            System.out.println("book add to cart");
        } else {
            System.out.println("book not found");
        }
    }
    void viveCartItem(){
        System.out.println("book name");
        System.out.println("====");
        for(String s:CartItem)
        System.out.println(s);
    }
    void removeCartItem(String bookname){
        boolean found = CartItem.contains(bookname);
        if(found) {
            CartItem.remove(bookname);
            System.out.println("book removed from cart");
        }
        else {
            System.out.println("first add to cart");
        }


    }
}
