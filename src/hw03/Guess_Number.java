package hw03;

import java.util.Scanner;

public class Guess_Number {
	
	public static void main(String[] args) {
		
		Guess_Number a = new Guess_Number();
		a.game1(new Scanner(System.in));
		System.out.println("結束第一場遊戲");
		System.out.println("=============================================");
		a.game2(new Scanner(System.in));
		
	}
	
	public void game1(Scanner inputData) {
		
		int anwser = (int)(Math.random()* 10);
		int guess;
		
		System.out.println("請猜一個0~9的數字,試試你的運氣吧");
		
		while(true) {
			if (inputData.hasNextInt()) {
				guess = inputData.nextInt();
				if (guess >= 0 && guess <=9) {
					if(guess == anwser) {
						System.out.println("恭喜答對,答案即是" + anwser);
						
					}else {
						System.out.println("猜錯瞜");
						continue;
					}
					break;
				}else {
					System.out.println("請輸入0~9之間的數字");
					continue;
				}
			}else {
				System.out.println("請輸入0~9之間的數字");
			}
			
		}
			
		
	}
	
	public void game2(Scanner inputData) {
		
		int anwser = (int)(Math.random() * 101);
		int guess;
		int min = 0, max = 100;
		
		System.out.println("請猜一個0~100的數字");
		
		while(true) {
			if (inputData.hasNextInt()) {
				guess = inputData.nextInt();
				if (guess >= 0 && guess <= 100) {
					if (guess == anwser) {
						System.out.println("恭喜答對,答案即是" + anwser);
						
					}else if(guess > anwser) {
						max = guess - 1;
						System.out.print("數字過大,請猜小一點! 範圍在" + min + "~" + max + "之間");
						continue;
					}else {
						min = guess + 1;
						System.out.print("數字過小,請猜大一點! 範圍在" + min + "~" + max + "之間");
						continue;
					}
					break;
				}else {
					System.out.println("請輸入0~100之間的數字");
					continue;
				}
			}else{
				System.out.println("請輸入0~100之間的數字");
			}
		
		}
		
	}

}
