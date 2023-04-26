package Test2;
import java.util.Arrays;
public class Que2 {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,4,3,7,9,4,6,8};
        System.out.println("Array is" + Arrays.toString(arr));
        int sumodd=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==1){
              sumodd+=arr[i];
            }

        }
        System.out.println(" sum of add place is"+sumodd);

    }
}
