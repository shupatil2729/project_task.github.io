package patternproject;

public class pp48 {
    public static void main(String[] args) {
        int line = 7;
        int star = 1;
        char ch = 'A';
        for (int i = 0; i < line; i++) {
            char ch1 = ch;
            for (int j = 0; j < star; j++) {

                if (i % 2 == 0) {
                    System.out.print(ch1);

                } else {
                    System.out.print("*");
                }

            }
            System.out.println();
            if (i % 2 == 0) {
                ch++;
            }
            if (i < 3) {
                star++;
            } else {
                star--;
            }
        }
    }
}
