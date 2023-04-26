package patternArray;

public class A4 {
    public static void main(String[] args) {
        int [][]tarr=new int [3][3];
        int[][]arr ={{10,20,30},
                     {40,50,60},
                     {70,80,90}};

        for(int i=0;i<arr.length;i++){
            for (int j=0; j<arr[i].length;j++){
                tarr[i][j]=arr[j][i];
                }
            }
            for(int[]a1:tarr)
            {
            for(int a:a1)
                System.out.print(a+"  ");
            System.out.println();
        }

    }
    }
