package ex;

public class encap {
     int value;

   public void a(int x){
        value=x;
       System.out.println("a: "+ ++value);
    }
    int b(int y){
        value=y;
        System.out.println("b: "+ value++);
        return value;

    }
    void  c(int y){
        value=y;
        System.out.println("c: "+ value++);


    }

}
class xy{
    public static void main(String[] args) {
        encap en=new encap();
        System.out.println("out :"+en.b(10));
        en.a(100);
        en.b(200);
        en.c(300);
        System.out.println(en.value);


    }
}

