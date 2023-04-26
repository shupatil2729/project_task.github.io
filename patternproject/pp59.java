package patternproject;

public class pp59 {
    public static void main(String[] args) {
        int line = 5;
        int star = 1;
        int space = 4;
        int a=1;
        for (int i = 0; i < line; i++) {
            int b=a;
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < star; k++) {
                if(i%2==0){
                    System.out.print(b);
                }
                else {

                    System.out.print("*");

                }
            }

            System.out.println();
            a++;
            space--;
            star++;
        }
    }
}
