package patternproject;

public class pattern14 {
    public static void main(String[] args) {
        int row =1;


        for (int i = 0; i <5; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print("*"+"\t");

            }
            System.out.println();
            row++;
        }

    }
}
