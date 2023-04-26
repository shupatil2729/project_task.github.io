package ex;

public class abstrac {
    int a=0;
    void info(){
        System.out.println(a);
    }
}
class a extends abstrac{
    void add(){
        int a=1,b=2;
       int c=a+b;
        System.out.println(c);
    }
}
class c extends abstrac{
    void sub(){
        System.out.println("sub");
    }
}
class main{
    public static void main(String[] args) {
        a aa=new a();
        aa.add();
        c bb=new c();
        bb.sub();


    }

}