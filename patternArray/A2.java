package patternArray;

public class A2 {
    public static void main(String[] args) {
        int [] arr={20,50,40,70,5,30,10};
        for(int i=0;i<arr.length;i++) {

            int minIdx = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
            for(int a:arr)
                System.out.print(a+"          ");

    }
}
