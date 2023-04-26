package patternproject;

public class pattern5 {

    public static void main(String[] args) {
        int row = 5;
        int linr = 5;

        for (int i = 0; i < row; i++)
        {
            int number = 1;
            for (int j = 0; j < row; j++) {
                if (j%2==0)



                {
                    System.out.print(number);
                    number=number+2;

                }
                else
                {
                    System.out.print(" * ");
                }
            }
            {
                System.out.println();
            }
        }
    }
}