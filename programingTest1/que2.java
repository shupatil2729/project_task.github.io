package programingTest1;

public class que2 {
    public static void main(String[] args) {
        int line = 4;
        int star = 4;

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < star; j++) {
                if ( i==j||i+j==5||i+j==1) {
                    System.out.print("@");
                }
                else{
                    System.out.print("0");
                }

            }
            System.out.println();
        }
    }
}
