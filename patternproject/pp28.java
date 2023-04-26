package patternproject;

public class pp28 {
    public static void main(String[] args) {
        int line=6;
        int star=6;

        for(int i=0; i<line;i++){
            int ch = i;
            for(int j=0; j<star;j++){
                if(i==0 || j==0 || i==line-1 || j==star-1){
                    System.out.print("*\t");
                }else{
                    System.out.print(ch+"\t");
                    ch=ch+i;
                }
            }
            System.out.println();
        }






    }

    }
