package hw05;

import java.util.Scanner;

public abstract class Square {
	
	public static void starSquare(int width, int height) {
		
		for(int i = 0; i < width; i++) {
			for(int j = 1; j < height; j++ ) {
				System.out.print("*");
			}
			System.out.println("*");
		}
	}
	
	
	public static void main(String[] args) {
		
		Scanner sq = new Scanner(System.in);
		
		System.out.print("輸入寬與高");
		
			int width = sq.nextInt();
			int height = sq.nextInt();
			
			starSquare(width, height);
	}

}
