package bt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class University {
    private List<Student> students = new ArrayList<>();
    private List<Course> courses = new ArrayList<>();

    public University(ArrayList<Student> students, ArrayList<Course> courses) {
        this.students = students;
        this.courses = courses;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    //1
    public void getStudent() {
        for (Student st : students) {
            System.out.println("--------------------------------");
            st.displayInfo();
        }
    }

    //2
    public void getCourse() {
        System.out.printf("%-10s%-15s\n", "courseId", "courseName");
        for (Course c : courses) {
            c.output();
        }
    }

    //3
    public void addStudent() {
        Student s = new Student();
        s.input();
        students.add(s);
        System.out.println("Đã thêm!");
    }

    //4
    public void removeStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên muốn xóa: ");
        String findName = sc.nextLine();
        boolean check = false;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equals(findName)) {
                students.remove(i);
                check = true;
                break;
            }
        }
        if (check) {
            System.out.println("Đã xóa!");
        } else {
            System.out.println("Ko xóa đc!");
        }
    }

    //5
    public void addCourse() {
        Course c = new Course();
        c.input();
        courses.add(c);
    }

    //6
    public void removeCourse() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập khóa muốn xóa: ");
        String removeCourse = sc.nextLine();
        boolean check1 = false;
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getCourseName().equals(removeCourse)) {
                check1 = true;
                courses.remove(i);
                break;
            }
        }
        if (check1) {
            System.out.println("Đã xóa khóa " + removeCourse);
        } else {
            System.out.println("Xóa ko thành công!");
        }
    }

    //7
    public void enrollStudentInCourse() {
        Scanner sc = new Scanner(System.in);
        boolean check_id_Student = false;
        System.out.print("Nhập id sv muốn đăng ký: ");
        int findID = sc.nextInt();
        sc.nextLine();
        for (Student st : students) {
            if (st.getId() == findID) {
                check_id_Student = true;
            }
        }
        if (check_id_Student) {
            System.out.println("Đăng ký khóa học");
            System.out.printf("%-10s%-15s\n", "courseId", "courseName");
            for (Course course : courses) {
                course.output();
            }
            System.out.print("Nhập mã khóa học muốn đk: ");
            boolean check_id_Course = false;
            int choice = sc.nextInt();
            sc.nextLine();
            for (Course c : courses) {
                if (c.getCourseId() == choice) {
                    check_id_Course = true;
                    break;
                }
            }
            if (check_id_Course) {
                students.get(findID-1).Enroll(courses.get(choice-1));
            } else {
                System.out.println("Ko tồn tại!");
            }
        } else {
            System.out.println("Ko có sinh viên muốn tìm!");
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Course> courses = new ArrayList<>();
        courses.add(new Course("KTLT"));
        courses.add(new Course("OOP"));
        courses.add(new Course("JAVA"));
        courses.add(new Course("HTCSDL"));
        courses.add(new Course("KTMT&HDH"));
        courses.add(new Course("TRR"));
        students.add(new Student("Huy", 18, "ktpm02"));
        students.get(0).Enroll(courses.get(0));
        students.get(0).Enroll(courses.get(1));
        students.get(0).Enroll(courses.get(2));
        students.get(0).Enroll(courses.get(3));
        students.add(new Student("Hải", 18, "ktpm02"));
        students.get(1).Enroll(courses.get(0));
        students.get(1).Enroll(courses.get(1));
        students.get(1).Enroll(courses.get(2));
        students.get(1).Enroll(courses.get(3));
        students.add(new Student("Nam", 18, "ktpm02"));
        students.get(2).Enroll(courses.get(0));
        students.get(2).Enroll(courses.get(1));
        students.get(2).Enroll(courses.get(2));
        students.get(2).Enroll(courses.get(3));


        University u = new University(students, courses);
        int choice;
        do {
            choice = 0;
            System.out.println();
            System.out.println("=================================================");
            System.out.println("MENU");
            System.out.println("1, Hiện thị sinh viên và khóa học đang tg");
            System.out.println("2, Hiện thị các khóa học");
            System.out.println("3, Thêm SV");
            System.out.println("4, Xóa SV");
            System.out.println("5, Thêm khóa học");
            System.out.println("6, Xóa Khóa học");
            System.out.println("7, Đăng ký khóa học cho SV");
            System.out.println("8, Thoát");
            System.out.print("Nhập lựa chọn: ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1){
                System.out.println("-----------Hiện thị sinh viên và khóa học đang tg-------------");
                u.getStudent();
            }
            else if(choice == 2){
                System.out.println("----------- Hiện thị các khóa học ------------");
                u.getCourse();
            }
            else if(choice == 3){
                System.out.println("Nhập sinh viên muốn thêm:");
                u.addStudent();
            }
            else if(choice == 4){
                System.out.println("Xóa sinh viên:");
                u.removeStudent();
            }
            else if(choice == 5){
                System.out.println("Nhập khóa học muốn thêm: ");
                u.addCourse();
            }
            else if(choice == 6){
                System.out.println("Xóa khóa học: ");
                u.removeCourse();
            }
            else if(choice == 7){
                System.out.println("Đăng ký khóa học: ");
                u.enrollStudentInCourse();
            }
            else if(choice == 8){
                System.out.println("FINISHED");
            }
            else {
                System.out.println("Ko hợp lệ. Mời nhập lại!");
            }

        }while (choice != 8);
    }

}
