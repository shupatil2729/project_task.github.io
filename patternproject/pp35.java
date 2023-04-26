package patternproject;

public class pp35 {
    public static void main(String[] args) {
        int line=5;
        int star=1;
        int ch=1;
        for (int i=0;i<line;i++){
            int ch1=ch;
            for (int j=0;j<star;j++) {
                if (i == 1 || i == 3) {
                    System.out.print("*");
                } else {
                    System.out.print(ch1);
                }
            }
            System.out.println();
            ch++;
            star++;
        }
    }
}
