package Demo;
import java.util.*;

public class maxValue {

        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();
            int numbers[] = new int[size];
//input
            for (int i = 0; i < size; i++) {
                numbers[i] = sc.nextInt();
            }
            int max = sc.nextInt();

            int min = sc.nextInt();
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] < min) {
                    min = numbers[i];
                    System.out.println(numbers[min]);
                } else if
                (numbers[i] > max) {
                    max = numbers[i];
                    System.out.println(numbers[max]);
                }

            }
        }
}
