package patternproject;

public class pp62 {
    public static void main(String[] args) {
        int line = 5;
        int star = 1;
        int space = 4;
      char a='A';
        for (int i = 0; i < line; i++) {
            char b=a;
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < star; k++) {

                System.out.print(b);
                --b;

            }

            System.out.println();
            ++a;
            space--;
            star++;
        }
    }
}
