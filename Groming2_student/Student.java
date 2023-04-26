package Groming2_student;

public class Student {
    private int studentId;
    private  String studentName;
    private  int studentMark;

    public Student(int studentId, String studentName, int studentMark) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentMark = studentMark;
    }

    public Student(String name) {
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentMark() {
        return studentMark;
    }

    public void setStudentMark(int studentMark) {
        this.studentMark = studentMark;
    }
}
