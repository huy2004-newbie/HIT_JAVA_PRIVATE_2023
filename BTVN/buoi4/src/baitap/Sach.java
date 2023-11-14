package baitap;

import java.util.Scanner;

public class Sach {
	private String id;
    private String tenSach;
    private int namXuatBan;
    private String theLoai;
    private TacGia tacGia;
    static int ID = 1;

    public Sach() {
        this.id = ID + "";
        ID++;
    }

    public Sach(String tenSach, int namXuatBan, String theLoai, TacGia tacGia) {
        this();
        this.tenSach = tenSach;
        this.namXuatBan = namXuatBan;
        this.theLoai = theLoai;
        this.tacGia = tacGia;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public TacGia getTacGia() {
        return tacGia;
    }

    public void setTacGia(TacGia tacGia) {
        this.tacGia = tacGia;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten sach: ");
        this.setTenSach(sc.nextLine());
        System.out.print("Nhap nam xuat ban: ");
        this.setNamXuatBan(sc.nextInt());
        sc.nextLine(); // Consume the newline character
        System.out.print("Nhap the loai: ");
        this.setTheLoai(sc.nextLine());
        TacGia a = new TacGia();
        a.input();
        this.tacGia = a;
    }

    public void output() {
        System.out.println("Ma sach: " + this.getId());
        System.out.println("Ten sach: " + this.getTenSach());
        System.out.println("Nam xuat ban: " + this.getNamXuatBan());
        System.out.println("The loai: " + this.getTheLoai());
        this.tacGia.output();
        System.out.println("------------------------------");
    }
}
