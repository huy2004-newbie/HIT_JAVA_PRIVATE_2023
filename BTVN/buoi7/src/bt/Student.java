package bt;

import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Person {
    private int age;
    private String grade;
    private ArrayList<Course> courses;
    public Student() {
        courses = new ArrayList<>();
    }

    public Student(String name, int age, String grade) {
        super(name);
        this.age = age;
        this.grade = grade;
        courses = new ArrayList<>();
    }

    public Student(int age, String grade, ArrayList<Course> courses) {
        this.age = age;
        this.grade = grade;
        this.courses = courses;
    }

    public Student(String name, int age, String grade, ArrayList<Course> courses) {
        super(name);
        this.age = age;
        this.grade = grade;
        this.courses = courses;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public void Enroll(Course course){
        courses.add(course);
    }

    @Override
    public void input(){
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tuổi: ");
        setAge(sc.nextInt());
        sc.nextLine();
        System.out.print("Nhập lớp: ");
        setGrade(sc.nextLine());
    }

    public void output(){
        super.displayInfo();
        System.out.printf("%-5d%-10s", getAge(), getGrade());
    }

    @Override
    public void displayInfo() {
        System.out.printf("%-5s%-25s%-5s%-10s\n", "ID", "Name", "Age", "Grade");
        super.displayInfo();
        System.out.printf("%-5d%-10s\n", getAge(), getGrade());
        System.out.println("Khóa học tham gia: ");
        System.out.printf("%-10s%-15s\n", "courseId", "courseName");
        for (Course a : courses){
            a.output();
        }

    }

    public static void main(String[] args) {
        ArrayList<Course> courses_main = new ArrayList<>();
        Student st = new Student("Huy", 18, "ktpm02", courses_main);
        for(int i = 0; i < 2; i++){
            Course c = new Course();
            c.input();
            courses_main.add(c);
        }
        st.displayInfo();

    }
}
