package patternproject;

public class pp68 {
    public static void main(String[] args) {
        int line =7;
        int star = 1;
        int space = 3;


        for (int i = 0; i < line; i++) {
            for (int k=0;k<space;k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <star; j++) {

                System.out.print("*");
            }
            System.out.println();
            if(i<3){
                space--;
                star++;
            }else {space++;
            star--;}
        }
    }
}
