package pattern;

public class p20 {
    public static void main(String[] args) {
        int line = 6;
        int star = 6;

        for (int i = 0; i < line; i++) {
            char b='A';
            for (int j = 0; j < star; j++) {

                if (i == 0 || j == 0 || i == line - 1 || j == star - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(b++);

                }
            }
                System.out.println();

            }
    }
}
