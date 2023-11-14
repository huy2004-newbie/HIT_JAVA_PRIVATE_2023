package baitap;

import java.util.ArrayList;
import java.util.Scanner;

public class PhongMay {
	   private String maPhong;
	    private String tenPhong;
	    private QuanLy quanLy;
	    private ArrayList<May> mays= new ArrayList<>();
	    private int n;
	    public PhongMay(String maPhong, String tenPhong, QuanLy quanLy, ArrayList<May> mays, int n) {
	        this.maPhong = maPhong;
	        this.tenPhong = tenPhong;
	        this.quanLy = quanLy;
	        this.mays = mays;
	        this.n = n;
	    }

	    public PhongMay() {
	    }

	    public String getMaPhong() {
	        return maPhong;
	    }

	    public void setMaPhong(String maPhong) {
	        this.maPhong = maPhong;
	    }

	    public String getTenPhong() {
	        return tenPhong;
	    }

	    public void setTenPhong(String tenPhong) {
	        this.tenPhong = tenPhong;
	    }

	    public QuanLy getQuanLy() {
	        return quanLy;
	    }

	    public void setQuanLy(QuanLy quanLy) {
	        this.quanLy = quanLy;
	    }

	    public ArrayList<May> getMays() {
	        return mays;
	    }

	    public void setMays(ArrayList<May> mays) {
	        this.mays = mays;
	    }

	    public int getN() {
	        return n;
	    }

	    public void setN(int n) {
	        this.n = n;
	    }
	    
	    public void output() {
	        System.out.println("Mã phòng máy: "+maPhong);
	        System.out.println("Tên phòng máy: "+tenPhong);
	        quanLy.output();
	        System.out.println("Danh sách các máy trong phòng: ");
	        for(May i : mays) i.output();
	    }
	    public void input() {
	        Scanner sc= new Scanner(System.in);
	        System.out.println("Nhập phòng máy!");
	        System.out.print("Nhập mã phòng: ");maPhong=sc.nextLine();
	        System.out.print("Nhập tên phòng: ");tenPhong=sc.nextLine();
	        quanLy.input();
	        System.out.print("Nhập số lượng máy: ");n=sc.nextInt();
	        for(int i=1;i<=n;i++) {
	            May may= new May();
	            may.input();
	            mays.add(may);
	        }
	    }
}
