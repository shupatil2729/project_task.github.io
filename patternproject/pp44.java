package patternproject;

public class pp44 {
    public static void main(String[] args) {
        int line=5;
        int star=5;
        char ch='A';
        for (int i=0;i<line;i++){
            char ch1=ch;
            for (int j=0;j<star;j++) {
                if(i%2!=0){
                    System.out.print("*");
                }else
                System.out.print(ch1++);

            }
            System.out.println();

            star--;


        }
    }
}
