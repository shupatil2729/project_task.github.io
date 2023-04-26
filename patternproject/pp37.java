package patternproject;

public class pp37 {
    public static void main(String[] args) {
        int line=4;
        int star=1;
        char ch='D';
        for (int i=0;i<line;i++){
            char ch1=ch;
            for (int j=0;j<star;j++) {
                System.out.print(ch1++);

            }

            System.out.println();
            ch--;
            star++;
        }
    }
}
