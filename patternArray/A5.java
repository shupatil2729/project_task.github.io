package patternArray;

public class A5 {
    public static void main(String[] args) {
        int [][]tarr=new int [3][3];
        int[][]arr ={{10,20,30},
                {40,50,60},
                {70,80,90}};

        for(int i=0;i< 3;i++){
            int sum=0;
            for (int j=0; j< 3;j++){
                sum+=arr[j][i];

            }
            System.out.println(sum);
        }

    }
}
