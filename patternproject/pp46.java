package patternproject;

public class pp46 {
    public static void main(String[] args) {
        int line = 9;
        int star = 1;

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }
            System.out.println();
            if (i < 4) {
                star++;
            } else {
                star--;
            }
        }
    }
}
