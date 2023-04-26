package ex;

public class A {
    A() {
        System.out.println("A");
    }
}
    class B extends  A{
       B() {

            System.out.println("B");
        }
    }

    class x {
        public static void main(String[] args) {
            B d = new B();
        }
    }
