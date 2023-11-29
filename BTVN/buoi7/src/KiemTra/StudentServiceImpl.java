package KiemTra;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class StudentServiceImpl implements StudentService{
    static ArrayList<Student> List = new ArrayList<>();

    public StudentServiceImpl() {
    }

    @Override
    public void addStudent(Student t) {
        List.add(t);
    }

    @Override
    public void deleteStudent(int id) {
        boolean check = false;
        for(Student st : List){
            if(st.getId() == id){
                List.remove(st);
                check = true;
                break;
            }
        }
        if(!check){
            System.out.println("FALSE");
        }
    }

    @Override
    public void searchStudent(String name) {
        boolean check = false;
        for (Student st : List){
            if(st.getName().equals(name)){
                check = true;
                System.out.println(st.toString());
                break;
            }
        }
        if(!check){
            System.out.println("FALSE");
        }
    }

    @Override
    public void sortedStudent() {
        Collections.sort(List, (e2,e1) -> Double.compare(e1.getScore(), e2.getScore()));
    }

    @Override
    public void showAllStudent() {
        System.out.printf("%-30s%-5s%-20s%-20s%-10s","Name", "Age", "District", "City", "Score");
        System.out.println();
        for(Student st : List){
            System.out.printf("%-30s%-5d%-20s%-20s%.2f\n", st.getName(), st.getAge(), st.getAddress().getDistrict(), st.getAddress().getCity(), st.getScore());
        }
    }

    public static void main(String[] args) {
        StudentServiceImpl s = new StudentServiceImpl();
        s.addStudent(new Student("huy", (short) 18, new Address("eqw", "eqwe"), 9.2));
        s.addStudent(new Student("hquy", (short) 18, new Address("eqw", "eqwe"), 8.2));
        s.sortedStudent();
        s.showAllStudent();
    }
}
