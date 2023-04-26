package patternproject;

public class pp19 {
    public static void main(String[] args) {
        int line = 5;
        int star = 5;
        char a='A';
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < star; j++) {
                // if(i%2==0){
                if (i == 1 || i == 3) {
                    System.out.print("*"+"\t");
                } else {
                    System.out.print(a+"\t");
                }
            }
            System.out.println();
            a++;
        }
    }
}
