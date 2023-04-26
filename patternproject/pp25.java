package patternproject;

public class pp25 {
    public static void main(String[] args) {

        int row = 6;
        int colum = 6;
        int ch1=0;
        for(int i=0;i<row;i++) {
              int ch2=ch1;
            for (int j = 0; j < colum; j++) {
                if (i == 0 || i == 5 || j == 0 || j == 5) {
                    System.out.print("\t"+"*"+"\t");
                } else if (i == 2) {
                    System.out.print("\t"+ch2+"\t");
                    ch2 += 2;
                } else if (i == 3) {
                    System.out.print("\t"+ch2+"\t");
                    ch2 += 3;
                } else if (i == 4) {
                    System.out.print("\t"+ch2+"\t");
                    ch2 +=4;
                } else {
                    System.out.print("\t"+ch2+"\t");
                    ch2++;
                }
            }
            System.out.println();
            ch1++;



         }
    }
}






/*  if (i == 0 || i == 5 || j == 0 || j == 5) {
                    System.out.print("\t"+"*"+"\t");
                } else if (i == 2) {
                    System.out.print("\t"+ch2+"\t");
                    ch2 += 2;
                } else if (i == 3) {
                    System.out.print("\t"+ch2+"\t");
                    ch2 += 3;
                } else if (i == 4) {
                    System.out.print("\t"+ch2+"\t");
                    ch2 +=4;
                } else {
                    System.out.print("\t"+ch2+"\t");
                    ch2++;
                }
                */
