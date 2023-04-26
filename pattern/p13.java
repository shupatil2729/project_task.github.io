package pattern;

public class p13 {
    public static void main(String[] args) {
        int line = 3;
        int star = 3;
        int b=1;
        for (int i = 0; i < line; i++) {

            for (int j = 0; j < star; j++) {
                System.out.print(b+"\t");
                b++;
            }
            System.out.println();


        }
    }
}
