package Groming2_student;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApp2 {
  static   Scanner sc1=new Scanner(System.in);
ArrayList <Student> data=new ArrayList<>();
   static MainApp2 m1=new MainApp2();
    public static void main(String[] args) {
      operation();
    }
    public static void operation() {
        boolean status = true;
        while (status) {
            System.out.println("1:Add student");
            System.out.println("2:Swap roll no");
            System.out.println("3:display");
            System.out.println("3:Enter your choice");
            int choice = sc1.nextInt();
            switch (choice) {
                case 1:
                    acceptDetails();
                    break;
                case 2:
                    swapData();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    System.out.println("thank you for visiting");
                    status =false;
                    break;
            }
        }
    }

    public static void acceptDetails(){
        System.out.println("Enter id");
        int id=sc1.nextInt();
        System.out.println("Enter name");
        String name=sc1.next();
        System.out.println("Enter mark");
        int mark= sc1.nextInt();
        Student s1=new Student(id,name,mark);

        m1.data.add(s1);  //   (new Student(id,name,mark))
        System.out.println("data add successfully");
    }
    public static void swapData(){
        System.out.println("Enter student 1 name");
        String student1=sc1.next();

        System.out.println("enter student 2 name");
        String student2=sc1.next();
      int temp=0,temp1=0;
      for(Student s1:m1.data){
          if(s1.getStudentName().equals(student1)){
              temp= s1.getStudentId();
              break;
          }
      }
        for(Student s1:m1.data){
            if(s1.getStudentName().equals(student2)){
                temp1= s1.getStudentId();
                s1.setStudentId(temp);
                break;
            }
        }
        for(Student s1:m1.data){
            if(s1.getStudentName().equals(student1)){
                s1.setStudentId(temp1);
                break;
            }
        }
    }
    public static void display(){

    }
}
