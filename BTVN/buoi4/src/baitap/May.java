package baitap;

import java.util.Scanner;

public class May {
    private int maMay;
    private String kieuMay;
    private String tinhTrang;

    public May(int maMay, String kieuMay, String tinhTrang) {
        this.maMay = maMay;
        this.kieuMay = kieuMay;
        this.tinhTrang = tinhTrang;
    }

    public May() {
    	
    }
    
    public int getMaMay() {
        return maMay;
    }

    public void setMaMay(int maMay) {
        this.maMay = maMay;
    }

    public String getKieuMay() {
        return kieuMay;
    }

    public void setKieuMay(String kieuMay) {
        this.kieuMay = kieuMay;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public void input() {
        Scanner sc= new Scanner(System.in);
        System.out.println("--Nhập máy--");
        System.out.print("Nhập mã máy: ");maMay=sc.nextInt();sc.nextLine();
        System.out.print("Nhập kiểu máy: ");kieuMay=sc.nextLine();
        System.out.print("Nhập tình trạng máy: ");tinhTrang=sc.nextLine();
    }
    
    public void output() {
        System.out.println("Mã máy: "+this.getMaMay()+"\nKiểu máy: "+this.getKieuMay()+"\nTình trạng máy: "+this.getTinhTrang());
    }
}
