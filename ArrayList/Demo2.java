package ArrayList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Demo2 {
    public static void main(String[] args) {

        ArrayList<Integer> data = new ArrayList<>();
        data.add(25);
        data.add(35);
        data.add(45);

        System.out.println(data);

        for (int i = 0; i < data.size(); i++) {
            System.out.println(data.get(i));
        }
        Iterator<Integer> itr = data.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());           //select
            itr.remove();                             //delete
        }
        System.out.println("==============================");

        System.out.println(data);


        HashMap<String, Double> data1 = new HashMap<>();
        data1.put("a", 11.0);
        data1.put("b", 12.0);
        data1.put("a", 13.0);
        System.out.println(data1);
    }

}