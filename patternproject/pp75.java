package patternproject;

public class pp75 {
    public static void main(String[] args) {

    int star = 1;
    int line = 5;
    int space = 4;

        for (int i = 0; i < line; i++) {
            char ch='E';
        for (int j = 0; j < space; j++) {
            System.out.print(" ");
        }
        for (int k = 0; k < star; k++) {
            System.out.print(ch+"-");
            ch--;
        }
        System.out.println();

        star++;
        space--;
    }
}
}
