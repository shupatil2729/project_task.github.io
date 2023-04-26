package patternproject;

public class pattern17 {
    public static void main(String[] args) {
        int line = 4;
        int star=4;

int a=1;
        for (int i = 0; i < line; i++) {
int b=a;
            for (int k = 0; k < star; k++) {
                System.out.print(b+"\t");
                b++;
            }


            System.out.println();
            a++;

        }


    }

}


