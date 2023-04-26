package JavaProgram;

public class changeValue {
    public static void main(String[] args) {
        int p=15,q=25,r=35,s=45;
        System.out.println("p "+p);
        System.out.println("q "+q);
        System.out.println("r "+r);
        System.out.println("s "+s);

        System.out.println("============");
        q=s;
        p=r;
        r=q;
        s=p;

        System.out.println("p "+p);
        System.out.println("q "+q);
        System.out.println("r "+r);
        System.out.println("s "+s);
    }
}
