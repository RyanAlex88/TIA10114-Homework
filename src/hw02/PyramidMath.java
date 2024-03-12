package hw02;

public class PyramidMath {
	
	public static void main(String[] args) {
		
		for(int a = 0; a < 10; a++) {
			for(int b = 1; b <= 10 - a; b++) {
				
				System.out.print(b + " ");
			}
			
			System.out.println();
		}
	}

}
