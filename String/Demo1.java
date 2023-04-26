package String;

public class Demo1 {
    public static void main(String[] args) {
        String s="Software Developer";
        System.out.println(s.length()); //18
        System.out.println(s.charAt(12));//e
        System.out.println(s.indexOf('w')); //4
        System.out.println(s.lastIndexOf('S'));   //16
        System.out.println(s.contains("eve"));  //true
        System.out.println(s.startsWith("Soft")); //true
        System.out.println(s.endsWith("per"));  //true
        System.out.println(s.substring(1,8)); // Developer
        System.out.println(s.substring(0,8));   //Software
        System.out.println(s.toLowerCase());  //software developer
        System.out.println(s.toUpperCase());  //SOFTWARE DEVELOPER

        System.out.println(s.toCharArray());
    }
}
