package gruming_toString_primeno;

import constructor.Student;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class student_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total num of students ");
        int n=sc.nextInt();
        student_1 [] data=new student_1[n];
        for(int i=0;i<data.length;i++){
            student_1 s1=new student_1();        //it will create everytime new object because of loop;
            System.out.println("Enter "+i+"nd Student roll no : ");
            s1.setRollNo(sc.nextInt());
            System.out.println("Enter Student name : ");
            s1.setName(sc.next());
            System.out.println("Enter Student Percentage : ");
            s1.setPercentage(sc.nextDouble());
            //add the object into array
            data [i]=s1;

        }

        Arrays.sort(data, new Comparator<student_1>() {
            @Override
            public int compare(student_1 s1, student_1 s2) {
                return Double.compare(s2.getPercentage(), s1.getPercentage());
            }
        });

        for(int j=0;j<data.length;j++)
        {
            System.out.println(data[j].getName());
            System.out.println(data[j].getRollNo());
            System.out.println(data[j].getPercentage());
        }


    }
}
