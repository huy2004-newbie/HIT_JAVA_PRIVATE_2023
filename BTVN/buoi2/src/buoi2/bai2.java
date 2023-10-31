package buoi2;

import java.util.Scanner;

public class bai2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			
			arr[i] = sc.nextInt();
	
		}
		
		int m = sc.nextInt();
		int[] arr1 = new int[m];
		int index = 0;
		
		for(int i = 0; i < m; i++) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			int tong = 0;
			
			for(int j = a-1; j < b; j++) {
				
				tong += arr[j];
			
			}
			
			arr1[index++] = tong;
			
		}
		
		for(int number : arr1) {
			
			System.out.println(number);
		
		}
	}
}
