package patternproject;

public class pp4 {
    public static void main(String[] args) {
        int line = 3;
        int star = 3;
        int ch=4;

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < star; j++) {

                System.out.print(ch);
            }

            System.out.println();
            ch--;
        }
    }
}
