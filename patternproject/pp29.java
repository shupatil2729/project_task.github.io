package patternproject;

public class pp29 {
    public static void main(String[] args) {
        int line = 6;
        int star = 6;

        for(int i=0; i<line;i++){
            int ch = 1;
            for(int j=0; j<star; j++){
                if(j>0 && i>=j && i<line-1){
                    System.out.print(ch++);
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
