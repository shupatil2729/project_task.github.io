package ExceptionHandling;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        System.out.println("main stared");
        int[] arr = new int[4];
        try {
            arr[5] = 20;
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println(a);
        }

        System.out.println("main end");

    }
}
