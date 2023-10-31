package buoi2;

import java.util.Arrays;
import java.util.Scanner;

public class bai4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s;
		do {
			System.out.println("Nhap chuoi do dai ko qua 1000 ky tu:");
			s = sc.nextLine();
		}while(s.length() > 1000);
		
		char[] s1 = s.toLowerCase().toCharArray();
		boolean check = true;
		int[] checkList = new int[26];
		
		if(s1.length < 26) {
			check = false;
		}
		else {
			for(int i = 0; i < s1.length; i++) {
				
				int check1 = s1[i] - 97;
				if(check1 < 0 || check1 >= 26) {
					break;
				}
				else {
					checkList[check1]++;
				}
				
			}
		}
		
		if(check) {
			
			for(int number : checkList) {
				
				if(number == 0) {
					check = false;
					break;
				}
				
			}
			
		}
		
		if(check) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		
	}
}
