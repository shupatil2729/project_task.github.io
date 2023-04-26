package pattern;

public class p16 {
    public static void main(String[] args) {
        int line = 5;
        int star = 5;

        for (int i = 0; i < line; i++) {
            int a=1;
            for (int j = 0; j < star; j++) {
                if(j==1||j==3)
                {
                    System.out.print("*"+"\t");
                }
                else {
                    System.out.print(a+"\t");
                }
               a++;
            }
            System.out.println();

        }
    }
}
