package baitap;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Sach> list = new ArrayList<Sach>();


        do {
            System.out.println("MOI BAN NHAP VAO LUA CHON:");
            System.out.println("1. Them sach");
            System.out.println("2. Hien thi thong tin sach");
            System.out.println("3. Tim kiem sach");
            System.out.println("4. Sap xep theo ten tac gia");
            System.out.println("5. Thoat");
            System.out.print("Lua chon cua ban: ");

            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Nhap vao so luong quyen sach: ");
                    int n = sc.nextInt();
                    sc.nextLine(); 
                    for (int i = 0; i < n; i++) {
                        System.out.println("Nhap vao thong tin quyen sach thu " + (i + 1));
                        Sach a = new Sach();
                        a.input();
                        list.add(a);
                    }
                    break;

                case 2:
                    System.out.println("------------------------------THONG TIN VE CAC QUYEN SACH-------------------------------");
                    for (Sach sach : list) {
                        sach.output();
                        System.out.println("-------------------------");
                    }
                    break;

                case 3:
                    System.out.print("Nhap vao ten quyen sach ban muon tim kiem: ");
                    String name = sc.nextLine();
                    for (Sach sach : list) {
                        if (sach.getTenSach().equalsIgnoreCase(name)) {
                            sach.output();
                        }
                    }
                    break;

                case 4:
                    System.out.println("------------------------------SAP XEP THU TU CAC QUYEN SACH THEO TEN TAC GIA-------------------------------");
                    list.sort((o1, o2) -> o1.getTacGia().getTenTacGia().compareTo(o2.getTacGia().getTenTacGia()));
                    for (Sach sach : list) {
                        sach.output();
                    }
                    break;

                case 5:
                    System.out.println("Ket thuc chuong trinh.");
                    return;

                default:
                    System.out.println("Lua chon khong hop le. Vui long nhap lai.");
                    break;
            }
        } while (true);
    }
}
