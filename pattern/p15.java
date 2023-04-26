package pattern;

public class p15 {
    public static void main(String[] args) {
        int line = 5;
        int star = 5;
        int a=1;
        for (int i = 0; i < line; i++) {

            for (int j = 0; j < star; j++) {

                if(i==1||i==3)
                {
                    System.out.print("*"+"\t");
                }
                else {
                    System.out.print(a+"\t");
                }

            }
            System.out.println();
            a++;


        }
    }
}
