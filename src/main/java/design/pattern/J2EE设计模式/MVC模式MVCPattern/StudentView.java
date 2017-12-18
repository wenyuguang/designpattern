package design.pattern.J2EE设计模式.MVC模式MVCPattern;

public class StudentView {
    public void printStudentDetails(String studentName, String studentRollNo) {
        System.out.println("学生: ");
        System.out.println("姓名: " + studentName);
        System.out.println("序号: " + studentRollNo);
    }
}