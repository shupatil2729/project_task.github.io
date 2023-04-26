package patternproject;

public class pp57 {
    public static void main(String[] args) {
        int line = 5;
        int star = 1;
        int space = 4;
        char ch1='A';
        for (int i = 0; i < line; i++) {
            char ch2=ch1;
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < star; k++) {
                System.out.print(ch2--);
            }
            System.out.println();
ch1++;
            space--;
            star++;
        }
    }
}
