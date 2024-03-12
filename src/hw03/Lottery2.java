package hw03;

import java.util.Random;
import java.util.Scanner;

public class Lottery2 {
	
	public static void main(String[] args) {
		
		int hatenumber = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入你討厭的數字");
		
		if(sc.hasNextInt()) {
			hatenumber = sc.nextInt();
		}
		
		int q = 0, number = 0;
		for(int i = 1; i <= 49; i++) {
			if( i / 10 != hatenumber && i % 10 != hatenumber) {
				
				System.out.print(i + " ");
				q++;
				number++;
				if (number%10 == 0)
                	System.out.println();
			}
		}
		System.out.println();
		System.out.println("共有" + q + "個");
		System.out.println("==========================");
		
		int htnumber = 0;
		Scanner cs = new Scanner(System.in);
		System.out.println("請輸入你討厭的數字");
		
		if(cs.hasNextInt()) {
			htnumber = cs.nextInt();
		}
		int[] randomNu = new int[6];
		Random random = new Random();
		
		int a = 0;
		while (a < 6) {
			int randomNub = random.nextInt(49) + 1;
			if (randomNub != htnumber) {
				randomNu[a] = randomNub;
				a++;
			}
		
		}
		
		for (int i = 0; i < randomNu.length; i++) {
			System.out.println(randomNu[i]);
		}
		
	}
	
}
		
		