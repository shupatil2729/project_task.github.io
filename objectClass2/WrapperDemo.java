package objectClass2;

public class WrapperDemo {
    public static void main(String[] args) {
        int a=10;         //primitive info
        Integer b=new Integer(10);
        System.out.println(a);       //10
        System.out.println(b);      //10

        //Auto boxing
        Integer p=20;

        //Auto unboxing
        int q=p;
        System.out.println(p);    //20
        System.out.println(q);   //20
    }
}
