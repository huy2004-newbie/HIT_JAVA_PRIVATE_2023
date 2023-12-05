package bt;

import java.util.ArrayList;
import java.util.Scanner;

public class Course implements Displayable {
    public static int count = 0;
    private int courseId;
    private String courseName;
    private ArrayList<Student> student_list;

    public Course(){
        count ++;
        this.courseId = count;
        student_list = new ArrayList<>();
    }

    public Course(String courseName) {
        count++;
        this.courseId = count;
        this.courseName = courseName;
    }

    public Course(String courseName, ArrayList<Student> student_list) {
        count ++;
        this.courseId = count;
        this.courseName = courseName;
        this.student_list = student_list;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public ArrayList<Student> getStudent_list() {
        return student_list;
    }

    public void setStudent_list(ArrayList<Student> student_list) {
        this.student_list = student_list;
    }

    public int getCourseId() {
        return courseId;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên khóa học: ");
        setCourseName(sc.nextLine());
    }

    public void output(){
        System.out.printf("%-10d%-15s\n", getCourseId(), getCourseName());
    }

    @Override
    public void displayInfo() {
        System.out.printf("%-5s%-25s%-5s%-10s%-10s%-20s\n", "ID", "Name", "Age", "Grade", "courseId", "courseName");
        for(Student st : student_list){
            st.output();
            System.out.printf("%-10d%-20s\n", getCourseId(), getCourseName());
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("huy", 18, "ktpm02"));
        students.add(new Student("hy", 8, "ktpm92"));
        students.add(new Student("1y", 18, "ktm02"));
        Course c = new Course("HDH", students);
        c.displayInfo();

    }
}
