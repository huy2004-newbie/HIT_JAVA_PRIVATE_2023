package buoi2;

import java.util.Scanner;

public class bai3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String s1 = s.toLowerCase();
		int kyTu = 0;
		int so = 0;
		int dacBiet = 0;
		
		for(int i = 0; i < s.length(); i++) {
			
			int check = s1.charAt(i) - 97;
			int check1 = s1.charAt(i) - 48;
			
			if(check >= 0 && check < 26) {
				kyTu++;
			}
			else if(check1 >= 0 && check1 < 10) {
				so++;
			}
			else {
				dacBiet++;
			}
			
		}
		
		System.out.println(kyTu + " " + so + " " + dacBiet);
	}
}
