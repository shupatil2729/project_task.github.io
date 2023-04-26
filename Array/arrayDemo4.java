package Array;

public class arrayDemo4 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[3] + "\t" + "4th minimum value of array");
        }
    }


}
