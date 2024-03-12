package hw05;

public class RandAvg {
	
	public static void randAvg() {
		
		int total = 0, count = 0;
		System.out.println("本次亂數結果為");
		for(int i = 0; i < 10; i++) {
			int t = (int)(Math.random() * 101);
			System.out.print(t + "\t");
			
			total += t;
			count++;
		}
		System.out.println("平均為 " + total / count);
	}
	
	public static void main(String[] args) {
		
		randAvg();
	}

}
