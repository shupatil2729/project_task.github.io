package patternproject;

public class pp40 {
    public static void main(String[] args) {
        int line=5;
        int star=4;
           int  ch=1;
        for (int i=0;i<line;i++){

            for (int j=0;j<star;j++){
                System.out.print(ch);

            }
            System.out.println();
            star--;
            ch++;
        }
    }
}
