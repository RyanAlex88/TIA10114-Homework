package hw04;

public class ArraysAverage {
	
	public static void main(String[] args) {
		
		int[] a = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
			}
		sum /= a.length;
		
		System.out.println("平均值 = " + sum);
		
		for(int i = 0; i < a.length; i++) {
			int num = a[i];
			if (num > sum) {
				System.out.println("大於平均的數有 " + num);
			}
		}
	}

}
