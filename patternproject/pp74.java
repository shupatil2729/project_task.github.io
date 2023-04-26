package patternproject;

public class pp74 {
    public static void main(String[] args) {

        int star = 1;
        int line = 5;
        int space = 4;
        int ch=1;
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < star; k++) {
                System.out.print(ch+"-");
            }
            System.out.println();
            ch++;
            star++;
            space--;
        }
    }
}
