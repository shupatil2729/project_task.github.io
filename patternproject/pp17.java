package patternproject;

public class pp17 {
    public static void main(String[] args) {
        int line = 4;
        int star = 4;
        char ch = 'A';
        for (int i = 0; i < line; i++) {
          char ch2=ch;
            for (int j = 0; j < star; j++) {
                if (ch2 <='D') {
                    System.out.print(ch2++);
                } else {
                    System.out.print('A');
                    ch2++;
                }

            }
            System.out.println();
            ch++;
        }
    }
}
