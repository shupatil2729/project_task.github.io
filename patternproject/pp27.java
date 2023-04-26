package patternproject;

public class pp27 {
    public static void main(String[] args) {
        int line = 6;
        int star = 6;
         int ch=1;
        for (int i = 0; i < line; i++) {
            int ch1=ch;
            for (int j = 0; j < star; j++) {
                if (i - j != 0 || i == 0 || j == 0 || i == 5 || j == 5) {
                    System.out.print("\t" + "*" + "\t");

                } else if (i== 1) {
                    System.out.print("\t" + ch1++ + "\t");
                }
                else {
                    System.out.print(ch);
                }
            }
                System.out.println();
        }
    }
}
