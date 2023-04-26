package pattern;

public class p14 {
    public static void main(String[] args) {
        int line = 3;
        int star = 3;
        int b=2;
        for (int i = 0; i < line; i++) {

            for (int j = 0; j < star; j++) {
                System.out.print(b+"\t");
                b=b+2;
            }
            System.out.println();


        }
    }
}
