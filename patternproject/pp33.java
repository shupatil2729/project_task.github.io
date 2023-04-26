package patternproject;

public class pp33 {
    public static void main(String[] args) {
        int line=4;
        int star=1;
        int ch=1;
        for (int i=0;i<line;i++){

            for (int j=0;j<star;j++){
                System.out.print(ch++);

            }
            System.out.println();

            star++;
        }
    }
}
