package patternArray;

public class A6 {
    public static void main(String[] args) {
        int [] candy={5,2,1,3,2,};

     int extracandy=3;
     int max=0;
     for(int a:candy)
         if(max<a);
     boolean[]arr=new boolean[candy.length];
     for (int i=0;i<arr.length;i++){
         arr[i]=((candy[i]+extracandy)>=max)?true:false;
     }
     for (boolean b:arr){
         System.out.println(b+"  ");
            }
        }
    }