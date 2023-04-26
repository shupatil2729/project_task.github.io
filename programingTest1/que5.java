package programingTest1;

public class que5 {
    public static void main(String[] args) {

        int line = 5;
        int star = 4;
        int ch1=5;
        for (int i = 0; i < line; i++) {
            int ch=ch1;
            for (int j = 0; j < star; j++) {
                System.out.print(ch+" ");
                ch=ch+4;

            }
            System.out.println();
            ch1--;


    }

    }
}
