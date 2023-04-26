package ArrayList;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList a1=new ArrayList();
        a1.add(25);
        a1.add(25.25);
        a1.add("java");
        a1.add(true);
        a1.add(null);
        a1.add('A');
        a1.set(0,35);
       // a1.get(2);
        System.out.println(a1);
        System.out.println(a1.size());
        System.out.println(  a1.get(2));
        // for loop one by one
        for(int a=0;a<a1.size();a++) {

            System.out.println(a1.get(a));

        }

            for(Object s:a1){
               System.out.println(s);
            }
        }

    }
