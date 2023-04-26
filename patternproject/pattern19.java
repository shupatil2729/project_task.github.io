package patternproject;

public class pattern19 {
    public static void main(String[] args) {
        int line = 5;
        int star=5;




        for (int i = 0; i < line; i++) {

            for (int j = 0; j < star; j++) {
               // System.out.print((0+j)%2+"\t");

                if (j%2==0){
                    System.out.print(1);
                }
                else {
                    System.out.print(2);
                }

            }


            System.out.println();
        }



    }

}
