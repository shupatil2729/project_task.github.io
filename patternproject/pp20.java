package patternproject;

public class pp20 {
    public static void main(String[] args) {
        int line = 5;
        int star = 5;
        int ch =5;
        for (int i = 0; i < line; i++) {
            int ch2=ch;
            for (int j = 0; j < star; j++) {
                if (ch2 >=1)
                {
                    System.out.print("\t"+ch2--+"\t");
                } else
                {
                    System.out.print("\t"+"0"+"\t");
                    ch2--;
                }
            }
            System.out.println();
            ch--;
        }
    }
}
