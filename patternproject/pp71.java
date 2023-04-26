package patternproject;

public class pp71 {
    public static void main(String[] args) {
        int line =5;
        int star = 5;
        int space = 0;

        for (int i = 0; i < line; i++) {
            int ch1=1;
            for (int k=0;k<space;k++) {
                System.out.print(" "+"\t");
            }
            for (int j = 0; j <star; j++) {

                System.out.print(ch1+++"\t");
            }
            System.out.println();
            space++;
            star--;

        }
    }
}
