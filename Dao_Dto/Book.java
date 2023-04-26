package Dao_Dto;

public class Book {
    int bookid;
    String bookname;
    double bookprice;

    public Book(int bookid, String bookname, double bookprice) {
        this.bookid = bookid;
        this.bookname = bookname;
        this.bookprice = bookprice;
    }

    public String toString()
    {
        return bookid+"\t"+bookname+"\t"+bookprice;
    }
}
