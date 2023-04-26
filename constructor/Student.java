package constructor;

public class Student {
    int studentID;
    String studentName;
    double studentPercentage;      //user defined constructor
    public Student(int ID, String Name, double Percentage){

        studentID=ID;
        studentName=Name;
        studentPercentage=Percentage;

    }
    void display(){
        System.out.println(studentID+"\t"+studentName+"\t"+studentPercentage);
    }
}
class MainApp2{
    public static void main(String[] args) {
        Student s1=new Student(101,"shubham",88.00);
        s1.display();
        Student s2=new Student(102,"rohan",77.00);
        s2.display();
    }
}