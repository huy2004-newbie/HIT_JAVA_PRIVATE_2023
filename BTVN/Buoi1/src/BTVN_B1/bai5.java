package BTVN_B1;

import java.util.Arrays;
import java.util.Scanner;

public class bai5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		for(int i = 0; i<5; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println(a[4] + " " + a[3]);		
	}
}
