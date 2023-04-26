package patternproject;

public class pattern8 {
    public static void main(String[] args) {
        int row=5;
        int line=5;
        int a=2;
        for (int i = 0; i <row ; i++) {

            for (int j = 0; j <line ; j++) {
                System.out.print(  a+"\t");


            }
            System.out.println(  );
            if (i<2)
            {
                a--;
            }
 else {
     a++;
            }


        }
    }

}
