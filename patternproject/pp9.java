package patternproject;

public class pp9 {
    public static void main(String[] args) {
        int line = 7;
        int star = 7;


        for (int i = 0; i < line; i++) {

            for (int j = 0; j < star; j++)
            {
                if (i == j || i + j == 6 || i + j == 1 || j - i == 5 || i - j == 5 || i + j == 11) {

                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }

            }

                System.out.println();



        }
    }
}