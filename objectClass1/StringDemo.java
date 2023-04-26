package objectClass1;

public class StringDemo {
    public static void main(String[] args) {

        String s1 = new String("java");
        String s2 = new String("java");
        String s3 = new String("Manual");
        System.out.println(s1 == s2);     //false
        System.out.println(s1.hashCode() == s2.hashCode());       //true
        System.out.println(s2.hashCode() == s3.hashCode());       //false


        System.out.println(s1.hashCode());          //3254818
        System.out.println(s2.hashCode());          //3254818
        System.out.println(s3.hashCode());          //-1997548570


        String s4=new String("java");
        System.out.println(s1.getClass());


    }
}
