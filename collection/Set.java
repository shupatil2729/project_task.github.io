package collection;

import java.util.*;

public class Set {
    public static void main(String[] args) {
        System.out.println("================Hashset================");
        HashSet <String> data=new HashSet<>();
        data.add("shubham");
        data.add("sd");
        data.add("abc");
        data.add("SHUBHAM");
        data.add("abc");
        data.add("1233");
        data.add(null);              //only one null alow

        System.out.println(data);

        System.out.println("===============LinkedHasSet=============");
        LinkedHashSet <String> data1=new LinkedHashSet<>();
        data1.addAll(data);
        data1.add("rohan");
        data1.add("sd");
        data1.add("123");
        data1.add(null);     //only one null allow

        System.out.println(data1);
        System.out.println("++++++++++++++++++TreeSet++++++++++");
        TreeSet <String> data2=new TreeSet<>();
    // d1.addAll(data1);
        data2.add("sShubham");
        data2.add("sd");
        data2.add("abc");
        data2.add("SHUBHAM");
        data2.add("abc");
        data2.add("rohan");
        data2.add("sd");
        data2.add("123");
        System.out.println(data2);

        System.out.println("================ArrayList================");
        ArrayList<String> data3=new ArrayList<>();
        data3.add("shubham");
        data3.add("sd");
        data3.add("abc");
        data3.add("SHUBHAM");
        data3.add("abc");
        data3.add("1233");
        data3.add(null);
        data3.add(null);
        data3.add(null);  //only one null alow

        System.out.println(data3);
        System.out.println("==================linkedList==============");
        LinkedList<String> data4=new LinkedList<>();
        data4.addAll(data3);
        System.out.println(data4);

        System.out.println("==================Vector==============");
        Vector<String> data5=new Vector<>();
        data5.addElement("sp");
        data5.addElement("rp");
        data5.addElement("ad");
        System.out.println(data5);

        System.out.println("==================stack==============");
        Stack<String> data6=new Stack<>();
        data6.push("sp");
        data6.push("rp");
        data6.push("ad");

        System.out.println(data6);
        System.out.println("remove  "+ data6.pop());
        System.out.println( "fetch 1st value  "+ data6.peek());
        System.out.println(data6);
        System.out.println("search" +data6.search("sp"));
    }
}
