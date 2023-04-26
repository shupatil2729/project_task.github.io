package ex;

public class main1 {

     main1(){
        System.out.println("rajendra");
        }

        static {
        System.out.println("patil");
    }
    void disp(){
        System.out.println("disp");
    }
    {
        System.out.println("shubham");
    }
    static void disp2(){
        System.out.println("mo no");
    }



    public static void main(String[] args) {
        main1.disp2();

        main1 s=new main1();
        main1.disp2();
        s.disp();



    }
}
