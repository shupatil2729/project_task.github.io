package objectClass2;

public class WrapperDemo2 {
    public static void main(String[] args) {
        //convert string to primitive
        String s1="100";
        String s2="200";
        System.out.println(s1+s2);      //100200

        int no1=Integer.parseInt(s1);
        int no2=Integer.parseInt(s2);
        System.out.println(no1+no2);       //300

        //convert primitive to string
        double p=34.11;
        double q=24.22;
        System.out.println(p+q);          //58

        String v1=Double.toString(p);
        String v2=Double.toString(q);
        System.out.println(v1+v2);        //34.1124.22


    }
}
