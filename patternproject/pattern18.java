package patternproject;

public class pattern18 {
    public static void main(String[] args) {
        int line = 5;
        int star=5;



        for (int i = 0; i < line; i++) {

            for (int j = 1; j < star; j++) {
                System.out.print((i+j)%2+"\t");

            }


            System.out.println();
        }



    }

}


