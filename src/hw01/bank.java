package hw01;

public class bank {
	
	public static void main (String[] args) {
		 
		double mon = 1500000; 
        double rate = 0.02; 
        int years = 10; 
 
        	for (int i = 0; i <= years; i++) {
        		double interest = mon * rate; 
        			   mon += interest; 
        }

        System.out.println("10年後本利為：" + mon);
	}

}
