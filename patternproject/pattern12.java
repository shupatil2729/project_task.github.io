package patternproject;

public class pattern12 {
    public static void main(String[] args) {
        int row = 6;
        int line = 6;

        for (int i = 0; i < row; i++) {
            int  number=1;
            for (int j = 0; j < line; j++) {

                System.out.print(number+"\t");
                 if (j==1 || j==3 || j==6){
                     System.out.print(number+"\t");
                     number++;

                }
            }
            {
                System.out.println();
                if (i<0){
                    System.out.print(number+"|t");
                    number++;
                }

            }



        }


    }
}



