package hw02;

public class Prouduct1_10_while {
	
	public static void main(String[] args) {
		
		int prout = 1;
		int i = 1;
		while(i <= 10) {
			prout *= i;
			i++;
			
		}
		System.out.println("連積為" + prout);
	}

}
