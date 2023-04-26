package patternproject;

public class pp55 {
    public static void main(String[] args) {
        int line = 4;
        int star = 1;
        int space = 3;
        int a=1;
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < star; k++) {
                System.out.print(a);
                ++a;

            }

            System.out.println();
            space--;
            star++;
        }
    }
    }
