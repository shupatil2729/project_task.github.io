package patternproject;

public class pattern6 {
    public static void main(String[] args) {
        int row = 5;
        int linr = 5;
        int number = 1;
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < row; j++) {
                if (i%2==0)
                {
                    System.out.print(number+"\t");
                }
                 else {
                    System.out.print("*\t");
                }
            }
                System.out.println();
                number++;
        }
    }
}

