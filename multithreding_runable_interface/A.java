package multithreding_runable_interface;

class A implements Runnable {
    public void run() {
        for (int i = 1; i < 5; i++) {
            System.out.println("shubham");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class B {
    public static void main(String[] args) {
        A r = new A();
        Thread t = new Thread(r);
        t.start();
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