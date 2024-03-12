package hw04;

import java.util.Scanner;

public class Date {
	
	public static void main(String[] args) {
		
		int[] arr = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int daytotal = 0;
		int t = 0;
		Scanner i = new Scanner(System.in);
		
		System.out.println("請輸入年份: ");
		int year = i.nextInt();
		System.out.println("請輸入月份: ");
		int mon = i.nextInt();
		System.out.println("請輸入日期: ");
		int day = i.nextInt();
		
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			arr[1]++;
		}
		for(int a = 1; a <= mon - 1; a++) {
			
			if(mon == 2 && day > 29) {
				System.out.println("二月不會超過 29 天!");
				daytotal = 0;
				day = 0;
				
			}else {
				daytotal += arr[t];
				t++;
			}
		
		}
		
		System.out.println("輸入的日期為該年第 " + (daytotal + day) + "天");
		
	}

}
