package patternproject;

public class pattern3 {
    public static void main(String[] args) {
        int row = 5;
        int linr = 5;
        int number = 1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(number + "\t");

            }
            {
                System.out.println();
                number++;

            }
        }
    }
}
