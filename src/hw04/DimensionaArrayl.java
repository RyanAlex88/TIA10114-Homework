package hw04;

import java.util.Scanner;

public class DimensionaArrayl {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);		
		int[][] colleague = {{25, 2500}, {32, 800}, {8, 500}, {19, 1000}, {27, 1200}};
		
		System.out.println("請輸入,要借的金額: ");
		
		int money, people = 0;
		
		if(input.hasNextInt()) {
			money = input.nextInt();
			System.out.println("有辦法借的同事: ");
			for(int i = 0; i < colleague.length; i++) {
				if(colleague[i][1] >= money) {
					System.out.println(colleague[i][0]);
					people++;
				}
				
			}
			
		}
		if(people != 0) {
			System.out.println("共有 " + people + "人");
		}else{
			System.out.println("金額過大,沒有人可以借");			
		}
		input.close();
				
		
	}

}
