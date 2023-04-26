package programingTest1;

public class que4 {
    public static void main(String[] args) {

            int line = 9;
            int star = 1;

            for (int i = 0; i < line; i++) {
                char ch='A';
                for (int j = 0; j < star; j++) {
                    if (j == 0 || i == j||i==5&&j==3||i==6&&j==2||i==7&&j==1) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" "+ch++ +" ");
                    }
                }
                System.out.println();

                if(i<4){
                    star++;
                }else {
                    star--;
                }
            }

    }
}
