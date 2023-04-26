package String;

public class Split {
    public static void main(String[] args) {
        String s="JAVA_SQL _MANUAL_J2EE";
        System.out.println(s);
        String[] data=s.split(" ");
        for(int a=0;a< data.length;a++){
            System.out.println(data[a]);
        }
    }
}
