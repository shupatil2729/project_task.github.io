package Demo;

public class stati_nonsatatic {
    static int a=10;
    int b=10;
    void  run(){
        int c=10;
        System.out.println(a+"  "+b+"  "+c);
        a++;
        b++;
        c++;

    }

    public static void main(String[] args) {
        stati_nonsatatic s=new stati_nonsatatic();
        s.run();
        s.run();
        s.run();

    }
}
