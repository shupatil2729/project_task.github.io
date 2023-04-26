package patternproject;

public class pp76 {
    public static void main(String[] args) {
        int star = 1;
        int line = 5;
        int space = 4;
        int ch=05,diff=4;
        for (int i = 0; i < line; i++) {
            int ch1=ch;
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < star; k++) {
                System.out.print(ch1+" ");
                ch1++;
            }
            System.out.println();
            ch+=diff;
            diff--;
            star++;
            space--;
        }
    }
    }
