package ex;

public class demosuper {
    int a = 10;

}
class b extends demosuper{
    int a=20;
    void show()
    {
        System.out.println(a);
        System.out.println(super.a);

    }
}
class srp{
    public static void main(String[] args) {
        b r = new b();
        r.show();
    }
}
