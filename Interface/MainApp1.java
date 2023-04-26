package Interface;

public class MainApp1 {
    public static void main(String[] args) {
        //loose coupling
        MusicPlayer m1;
      /*  m1=new DVDPlayer();   //upcasting
        m1.play();
        m1.pause();
        m1.forward();
        m1.backward(); */

        System.out.println("=======");

        m1=new Walkman();
        m1.play();
        m1.pause();
        m1.forward();
        m1.backward();


    }
}


