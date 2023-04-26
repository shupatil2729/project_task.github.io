package patternproject;

public class pp24 {
    public static void main(String[] args) {
        int line = 6;
        int star = 5;

        for (int i = 0; i < line; i++) {

            for (int j = 0; j < star; j++) {
                if (i == 1 || i == 4 || j == 1 || j == 3) {
                    System.out.print(" * ");

                } else {
                    System.out.print(" 0 ");
                }
            }
            System.out.println();

        }
    }
}
