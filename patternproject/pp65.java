package patternproject;

public class pp65 {
    public static void main(String[] args) {
        int line =4;
        int star = 4;
        int space = 0;


        for (int i = 0; i < line; i++) {
            for (int k=0;k<space;k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <star; j++) {

              //  if (i == 0 || j == 0 || i == 3 || j == 3) {
                    System.out.print("*");
             //   } else {
                //    System.out.print(" "+"\t");
               // }
            }
            System.out.println();
            space++;

        }
    }
}
