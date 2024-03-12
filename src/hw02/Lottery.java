package hw02;

public class Lottery {
	
	public static void main(String[] args) {
		
		int qua = 0, number = 0;
        for (int i = 1; i <= 49; i++) {
        	
            if (i / 10 != 4 && i % 10 != 4) {
            	
                System.out.print(i + " ");
                qua++;
                number++;
                if (number%10 == 0)
                	System.out.println();
            }

        }
        System.out.println();
        System.out.println("共有" + qua + "個");
	}
	
	

}
