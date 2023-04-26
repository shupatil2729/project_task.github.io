package patternproject;

public class pp11 {
    public static void main(String[] args) {

        int line = 9;
        int star1 = 5;
        int star2=5;
        int space=0;

        for (int i = 0; i < line; i++) {

            for (int j = 0; j < star1; j++) {
                System.out.print(" * ");
            }

           for (int k = 0; k < space; k++) {
                System.out.print("   ");
           }
            for (int l = 0; l < star2; l++) {
                System.out.print(" * ");
            }

            System.out.println();

            if (i < 4) {
                star1--;
                space += 2;
                star2--;
            } else {
                star1++;
                space -= 2;
                star2++;
            }

        }






        }
    }

