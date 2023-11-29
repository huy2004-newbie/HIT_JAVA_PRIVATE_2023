package KiemTra;

import java.util.Scanner;

public class Student extends Person{
    private double score;

    public Student() {
    }

    public Student(double score) {
        this.score = score;
    }

    public Student(String name, short age, Address address, double score) {
        super(name, age, address);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        if(score<=10 && score >0)
            this.score = score;
        else
            this.score = 0;
    }



    @Override
    public String toString() {
        return super.toString() + "\nScore: " + getScore();
    }

    @Override
    public String getCapacity() {
        if(this.score >= 9.0){
            return "Xuat xac";
        }
        else if(this.score >= 8.0){
            return "Gioi";
        }
        else if(this.score >= 6.5){
            return "Kha";
        }
        else {
            return "Yeu";
        }
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input name: ");
        setName(sc.nextLine());
        System.out.print("Input age: ");
        setAge(sc.nextShort());
        sc.nextLine();
        super.getAddress().input();
        System.out.print("Input score: ");
        setScore(sc.nextDouble());
    }

    public static void main(String[] args) {
        Student a = new Student();
        a.input();
        System.out.println(a.toString());
    }
}
