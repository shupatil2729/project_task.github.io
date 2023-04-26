package patternproject;

public class pp15 {
    public static void main(String[] args) {
        int line = 5;
        int star = 5;

        int b = 1;
        for (int i = 0; i < line; i++) {

            for (int j = 0; j < star; j++)
            {
                System.out.print(b + "\t");

            }
            System.out.println();
            if (i < 2)
            {
                b++;
            } else {
                b--;
            }

        }
    }
}
