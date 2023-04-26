package patternproject;

public class pattern10 {
    public static void main(String[] args) {
        int row = 5;
        int line = 5;
          int number=1;
        for (int i = 0; i < row; i++) {
            int num=number;
            for (int j = 0; j < line; j++) {

                System.out.print(number+"\t");
                number+=2;
            }
            {
                System.out.println();
                number+=2;
            }


        }
    }
}

