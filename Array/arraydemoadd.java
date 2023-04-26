package Array;

public class arraydemoadd {
    public static void main(String[] args) {
        int[] arr1={10,20,30,40};
        int[] arr2={50,60,70,80};
        int[]result=new int[arr1.length];
        // sum
        for (int a=0;a<arr1.length;a++){
            result[a]=arr1[a]+arr2[a];
            System.out.println(result[a]);
        }

    }
}
