package hw2;

public class Even1_1000 {
	
	public static void main(String[] args) {
		
		int sum = 0;
		for (int i = 1;i <= 1000;i++) {
			if (i % 2 == 1) {
				continue;
				
			}
			sum = i + sum;
			
		}
		System.out.println("1到1000偶數總合為" + sum);
	}

}
