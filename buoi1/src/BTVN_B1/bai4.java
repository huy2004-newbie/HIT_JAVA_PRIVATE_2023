package BTVN_B1;

import java.util.Scanner;

public class bai4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String a = "",b = "";
		int t=0;
		int index = -1;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '+') {	
				t = 1;
				index = i;
			}
			else if (s.charAt(i) == '-' ) {
				t = 2;
				index = i;
			}
			else if (s.charAt(i) == '*') {
				t = 3;
				index = i;
			}
			else if (s.charAt(i) == '/') {
				t = 4;
				index = i;
			}
		}
		for(int i = 0; i<s.length(); i++) {
			if (i == index) {
				continue;
			}
			if(i<index) {
				a += s.charAt(i);
			}
			if(i>index) {
				b += s.charAt(i);
			}
		}
		int c = Integer.parseInt(a);
		int d = Integer.parseInt(b);
		if(t == 1) {
			System.out.print("=" + (c+d));
		}
		else if(t == 2) {
			System.out.print("=" + (c-d));
		}
		else if(t == 3) {
			System.out.print("=" + (c*d));
		}
		else if(t == 1) {
			System.out.print("=" + (c/d));
		}
	}
	
}
