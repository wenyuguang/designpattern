package design.pattern.J2EE设计模式.数据访问对象模式DataAccessObjectPattern;

import java.util.List;

public interface StudentDao {
    public List<Student> getAllStudents();

    public Student getStudent(int rollNo);

    public void updateStudent(Student student);

    public void deleteStudent(Student student);
}