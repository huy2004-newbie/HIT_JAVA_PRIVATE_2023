package KiemTra;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentService s = new StudentServiceImpl();
        int choice;
        do {
            System.out.println("1, Add");
            System.out.println("2, Delete");
            System.out.println("3, Search");
            System.out.println("4, Sort");
            System.out.println("5, Show");
            System.out.println("6, exit");
            System.out.print("Input choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            if(choice == 1){
                Student st = new Student();
                st.input();
                s.addStudent(st);
            }
            else if(choice == 2){
                System.out.print("Input find id: ");
                int id = sc.nextInt();
                sc.nextLine();
                s.deleteStudent(id);
            }
            else if(choice == 3){
                System.out.print("Input find Name: ");
                String name = sc.nextLine();
                s.searchStudent(name);
            }
            else if(choice == 4){
                s.sortedStudent();
            }
            else if(choice == 5){
                s.showAllStudent();
            }
            else if(choice == 6){
                System.out.println("EXIT");
            }
            else {
                System.out.println("INPUT AGAIN");
            }
        }while(choice != 6);
    }
}
