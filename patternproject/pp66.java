package patternproject;

public class pp66 {
    public static void main(String[] args) {
        int line =7;
        int star = 2;
        int space = 0;


        for (int i = 0; i < line; i++) {
            for (int k=0;k<space;k++) {
                System.out.print(" "+"\t");
            }
            for (int j = 0; j <star; j++) {

                if (j == 0 || j == 1  ) {
                    System.out.print("*"+"\t");
                } else {
                    System.out.print(" "+"\t");
                }
            }
            System.out.println();
            if(i<3){
            space++;
        }else {space--;}
    }
}
}
