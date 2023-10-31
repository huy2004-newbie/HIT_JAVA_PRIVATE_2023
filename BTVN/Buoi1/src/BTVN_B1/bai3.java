package BTVN_B1;

import java.util.Scanner;

public class bai3 {
	public static long tinhTich(int a) {
		long tich = 1;
		if(a == 0) {
			return 0;
		}
		while(a>0) {
			tich *= a%10;
			a /= 10;
		}
		return tich;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(tinhTich(a));
	}
}
