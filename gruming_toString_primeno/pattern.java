package gruming_toString_primeno;

public class pattern {
    public static void main(String[] args) {
        int line=7;
        int star=7;
        for(int i=0;i<line;i++){
            for(int j=0;j<star;j++) {
                if (i == 0 || i == 1 || i == 4 || i == 5) {
                    System.out.print("*");
                } else {
                    System.out.print("$");
                }
            }
            System.out.println();
            star--;
        }
    }
}
