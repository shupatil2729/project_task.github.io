package Array;

public class TwoElement {
    public static void main(String[] args) {
        int[] arr1={10,20,30,40};
        int[] arr2={50,60,70};

        int a= arr1.length;
        int b= arr2.length;

        int[] result=new int[a+b];
        int c=0;

        for(int d=0;d<a;d++)
        {

            result[c]=arr1[d];
            c++;
        }

        for (int e=0;e<arr2.length;e++)
        {
            result[c]=arr2[e];
            c++;
        }
        for(int i=0;i< result.length;i++)
        {
            System.out.println(result[i]+"  ");
        }
    }
}
