package hw04;

import java.util.Scanner;

public class String_1 {
	
	public static void main(String[] args) {
		
		String str;
		Scanner input = new Scanner(System.in);
		System.out.println("請輸入 需要反轉的文字");
		
		if (input.hasNextLine()) {
			str = input.nextLine();
			char[] revStr = new char[str.length()];
			
			for(int i = 0; i < str.length(); i++) {
				revStr[i] = str.charAt((str.length()-1)- i );
			}
			System.out.println("反轉的字串為 ");
			for(char j: revStr) {
				System.out.print(j);
			}
		}
		input.close();
	}

}
