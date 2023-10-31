package BTVN_B1;

import java.util.Scanner;

public class bai1 {
	public static int UCLN(int a, int b) {
		while(a != b) {
			if(a > b) {
				a = a - b;
			}
			else {
				b = b - a;
			}
		}
		return a;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		System.out.println(UCLN(UCLN(a,b),c));
		System.out.println(a*b/UCLN(a, b)*c/UCLN(a*b/UCLN(a, b), c));
	}
}
