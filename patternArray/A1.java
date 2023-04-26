package patternArray;

public class A1 {
    public static void main(String[] args) {
        int [] arr={30,20,40,10,50};
        int minIdx=0;
        for(int i=0;i<arr.length;i++) {
            if (arr[i] < arr[minIdx])
                minIdx = i;
        }

            int temp=arr[0];
            arr[0]=arr[minIdx];
            arr[minIdx]=temp;

           int temp1=arr[2];
           arr[2]=arr[minIdx];
           arr[minIdx]=temp1;

            for(int a:arr)
                System.out.print(a+" ");

    }
}
