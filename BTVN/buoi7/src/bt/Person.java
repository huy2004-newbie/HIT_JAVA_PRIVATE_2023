package bt;

import java.util.Scanner;

public abstract class Person implements Displayable {
    public static int count = 0;
    private int id;
    private String name;

    public Person() {
        count++;
        id = count;
    }

    public Person(String name) {
        count++;
        this.id = count;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        setName(sc.nextLine());
    }

    @Override
    public void displayInfo() {
        System.out.printf("%-5d%-25s", id, name);
    }
}
