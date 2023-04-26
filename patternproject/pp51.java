package patternproject;

public class pp51 {
    public static void main(String[] args) {
        int line = 7;
        int star = 1;
        char ch = 'A';
        for (int i = 0; i < line; i++) {
            char ch1 = ch;
            for (int j = 0; j < star; j++) {

                System.out.print(ch1++);
            }
            System.out.println();

                ch++;


            if (i < 3) {
                star++;
            } else {
                star--;
            }
        }
    }
}
