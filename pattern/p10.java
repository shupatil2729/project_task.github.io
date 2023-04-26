package pattern;

public class p10 {
    public static void main(String[] args) {
        int line = 5;
        int star = 5;

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < star; j++) {
                if (i == 0 || i== 4 || j+i==4||i==j) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");

                }

            }
            System.out.println();

        }
    }
}
