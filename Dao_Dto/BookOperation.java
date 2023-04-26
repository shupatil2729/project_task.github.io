package Dao_Dto;

import java.util.ArrayList;
import java.util.Iterator;

public class BookOperation {
    ArrayList<Book> bl=new ArrayList<>();

    public void addBook(int id,String name,double price){
        Book b1=new Book(id,name,price);
        bl.add(b1);
        System.out.println("book add successfully");
        System.out.println("========================");
    }
    public  void displayBook(){
        System.out.println("Id\tname\tprice");
        System.out.println("=======================");
        for(Book b:bl){
            System.out.println(b);
        }
        System.out.println("====================");
    }
    public void deleteBook(int id){
        Iterator<Book>itr=bl.iterator();
        boolean found=false;
        while (itr.hasNext()){
            Book b=itr.next();
            if(b.bookid==id){
                itr.remove();
                System.out.println("book delete");
                found =true;
            }
        }
        if(!found){
            System.out.println("Book not found");
        }
        System.out.println("========================");

    }

}
