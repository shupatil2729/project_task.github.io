package pattern;

public class p12 {
    public static void main(String[] args) {
        int line = 5;
        int star = 5;
        int a=1;
        for (int i = 0; i < line; i++) {
        int b=a;
            for (int j = 0; j < star; j++) {
                System.out.print(b+"\t");
                b++;
            }
            System.out.println();



        }
    }
}
