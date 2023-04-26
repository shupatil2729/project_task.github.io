package patternproject;

public class pp16 {
    public static void main(String[] args) {
        int line = 5;
        int star = 5;


        for (int i = 0; i < line; i++) {
            int b = 1;
            for (int j = 0; j < star; j++) {

                if (j <2) {
                    System.out.print(b + "\t");
                    b++;
                }
                else {
                    System.out.print(b + "\t");
                    b--;

                }

            }

            System.out.println();


            }

    }
}




