package hw03;

import java.util.Scanner; //導入java.util套件中的Scanner類 用於讀取使用者的輸入
import java.util.Arrays;  //提供對數組的 各種操做方式

public class Triangle {
	
	public static void main(String[] args) {
		
		int[] edgeLength = new int[3];//存入3個數的陣列
		Scanner inputData = new Scanner(System.in);//從控制台 讀取使用者的輸入
		
		int count = 0;//統計已輸入的數
		
		
		System.out.println("請輸入三個整數:");
		
		while(count < edgeLength.length) { //當 count 大於陣列長度 則跳出迴圈
			if(inputData.hasNextInt()) {   //hasNextInt 判斷是否為整數
				edgeLength[count] = inputData.nextInt();
				count++;
			}else {
				System.out.println("輸入有誤,請重新輸入");
				count = 0;//重製
				inputData = new Scanner(System.in);//繼續輸入
			}
			
		}
		inputData.close();//關閉Scanner物件 釋放資源
		
		Arrays.sort(edgeLength);//使資料 有小到大進行排序 方便後續 判斷三角形類型
		if(edgeLength[0] + edgeLength[1] > edgeLength[2]) {
			if(edgeLength[0] == edgeLength[1] && edgeLength[1] == edgeLength[2]) {
				System.out.println("正三角形");
			}else if(edgeLength[0] == edgeLength[1] || edgeLength[1] == edgeLength[2]){
				System.out.println("等腰三角形");
			}else if(Math.pow(edgeLength[0], 2) + Math.pow(edgeLength[1], 2) == Math.pow(edgeLength[2], 2)){
				System.out.println("垂直三角形");
			}else {
				System.out.println("其他三角形");
			}
		}else {
			System.out.println("不是三角形");
		}
	}

}
