package patternproject;

public class pp80 {
    public static void main(String[] args) {

        int star = 1;
        int line = 5;
        int space = 4;
        int ch = 5;
        for (int i = 0; i < line; i++) {
            int ch1 = ch;
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < star; k++) {
                System.out.print(Math.abs(ch1));
                if (k < 4) {
                    ch--;
                } else {
                    ch--;
                }
            }
            System.out.println();
            ch++;
            star += 2;
            space--;
        }
    }
}
