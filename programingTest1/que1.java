package programingTest1;

public class que1 {
    public static void main(String[] args) {
        int line = 5;
        int star = 5;

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < star; j++) {
                if (i == 2 || j == 2 || i + j == 0 ||i+j==8) {
                    System.out.print("*");
                }else System.out.print(" ");

            }
            System.out.println();
        }
    }
}
