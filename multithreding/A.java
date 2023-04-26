package multithreding;


 class All_Method {
    void D() {
        for (int i = 1; i < 5; i++) {
            System.out.println("shubham");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    void E() {
        for (int i = 1; i < 5; i++) {
            System.out.println("shubham_patil");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

 public  class A extends Thread {
     All_Method d=new All_Method();
     public void run(){
         d.D();
         }
 }
class D extends Thread{
    All_Method d=new All_Method();

    public void run(){
        d.E();
    }
}

class B {
    public static void main(String[] args) throws Exception {
        A t1 = new A();

        D t2=new D();
        t1.start();
        t2.start();
        for (int i = 1; i < 5; i++) {
            System.out.println("rohan");
            Thread.sleep(2000);
        }
    }
}




