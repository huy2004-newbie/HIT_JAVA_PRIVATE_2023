package buoi2;

import java.util.Scanner;

public class bai1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao so phan tu: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for(int i = 0; i < n; i++) {
			
			System.out.print("a[" + i + "]=");
			a[i] = sc.nextInt();
			
		}
		
		for(int i = 0; i < n-1; i++) {
			
			for(int j = n-1; j>i; j--) {
				
				if(a[j] < a[j-1]) {
					int tg = a[j];
					a[j] = a[j-1];
					a[j-1] = tg;
				}
				
			}
			
		}
		
		int[] b = new int[n];
		b[0] = a[0];
		int index = 0;
		int check = b[0];
		
		for(int i = 1; i < n; i++) {
			
			if(a[i] != check) {
				index++;
				b[index] = a[i];
				check = b[index];
			}
			
		}
		
		int[] count = new int[index+1];
		for(int i = 0; i <= index; i++) {
			
			for(int j = 0; j < n; j++) {
				
				if(b[i] == a[j]) {
					count[i]++;
					
				}
				
			}
		
		}
		
		int soLanXuatHienMax = count[0];
		int soMinVaXuatHienMax = b[0]; 
		
		for(int i = 1; i <= index; i++) {
			
			if(count[i] > soLanXuatHienMax) {
				soLanXuatHienMax = count[i];
				soMinVaXuatHienMax = b[i];
			}
			
		}
		
		System.out.println(soMinVaXuatHienMax + " " + soLanXuatHienMax);

	}
}
