package ex;

public class animal1 {

        animal1(){
            System.out.println("All animal........!");
        }
        void sound(){
        }

    }
    class Dog1 extends ex.animal {
        Dog1(){
            super();
        }
        public void sound(){
            System.out.println("Dog is barking");
        }
    }
    class  Lion1 extends ex.animal {
        Lion1(){
            super();
        }
        public void sound(){
            System.out.println("Lion is barking");
        }
    }
    class test1{
        public static void main(String[] args) {
            ex.Dog d=new ex.Dog();
            ex.Lion l=new ex.Lion();
            d.sound();
            l.sound();
        }
    }
