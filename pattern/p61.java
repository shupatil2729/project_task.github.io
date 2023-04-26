package pattern;

public class p61 {
    public static void main(String[] args) {
            int star = 1;
            int line = 9;
            int space = 4;

            for (int i = 0; i < line; i++) {
                for (int j = 0; j < space; j++) {
                    System.out.print("   ");
                }
                for (int k = 0; k < star; k++) {


                    System.out.print(" * ");
                }
                System.out.println();
                if(i<4){
                star++;
                space--;
            }
                else {
                    star--;
                    space++;

                }
        }


    }
}
