package patternproject;

public class pp26 {
    public static void main(String[] args) {
        int line = 7;
        int star = 7;

        for (int i = 0; i < line; i++) {
             int ch1=1;
            for (int j = 0; j < star; j++) {
                if (i == 0 || i == 6 || j == 0 || j == 2||j==4||j==6) {
                    System.out.print("*");

                } else {
                    System.out.print(ch1++);

                }
            }
            System.out.println();

        }
    }
}
