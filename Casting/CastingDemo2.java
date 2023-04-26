package Casting;

public class CastingDemo2 {
    public static void main(String[] args) {
        char ch1='J';
        char ch2='S';

        //widening
        int x1=ch1;
        int x2=ch2;
        System.out.println("x1 "+x1);
        System.out.println("x2 "+x2);
        //narrowing
        int x3=90;
        char ch3=(char) x3;
        System.out.println("ch3 "+ch3);
    }
}
