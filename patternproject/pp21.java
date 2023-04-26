package patternproject;

public class pp21 {
    public static void main(String[] args) {
        int line=4;
        int star=5;
        int ch1=4;
        for(int i=0;i<line;i++) {
            int ch2=1;
            for (int j = 0; j < star; j++) {
          if(j<ch1)
          {
              System.out.print("\t"+"0"+"\t");
          }else
          {
              System.out.print("\t"+ch2+++"\t");
          }
            }
            System.out.println();
            ch1--;
        }
        }
    }
