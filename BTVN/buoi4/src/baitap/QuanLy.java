package baitap;

import java.util.Scanner;

public class QuanLy {
    private String maQL;
    private String tenQL;
    public QuanLy(String maQL, String tenQL) {
        this.maQL = maQL;
        this.tenQL = tenQL;
    }
    public QuanLy() {
    }

    public String getMaQL() {
        return maQL;
    }

    public void setMaQL(String maQL) {
        this.maQL = maQL;
    }

    public String getTenQL() {
        return tenQL;
    }

    public void setTenQL(String tenQL) {
        this.tenQL = tenQL;
    }
    
    public void output() {
        System.out.println("Mã quản lý: "+maQL+"\nTên quản lý: "+tenQL);
    }
    public void input() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập quản lý!");
        System.out.print("Nhập mã quản lý: ");maQL=sc.nextLine();
        System.out.print("Nhập tên quản lý: ");tenQL=sc.nextLine();
    }
}
