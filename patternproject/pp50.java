package patternproject;

public class pp50 {
    public static void main(String[] args) {
        int line = 7;
        int star = 1;
        int ch = 4;
        for (int i = 0; i < line; i++) {
            int ch1 = ch;
            for (int j = 0; j < star; j++) {

                System.out.print(ch1++);
            }
            System.out.println();
            if(i<3) {
                ch--;
            }else {
                ch++;
            }
            if (i < 3) {
                star++;
            } else {
                star--;
            }
        }
    }
}
