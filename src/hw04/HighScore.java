package hw04;

public class HighScore {
	
	public static void main(String[] args) {
		
		int[][] sc = {{10, 35, 40, 100, 90, 85, 75, 70},
					  {37, 75, 77, 89, 64, 75, 70, 95},
					  {100, 70, 79, 90, 75, 70, 79, 90},
					  {77, 95, 70, 89, 60, 75, 85, 89},
					  {98, 70, 89, 90, 75, 90, 89, 90},
					  {90, 80, 100, 75, 50, 20, 99, 75},
					};
		
		int[] e = new int[8];
		for(int i = 0; i < sc.length; i++) {
			int max = sc[i][0];
			int p = 0,l = 0;
			for(int j = 1; j < sc[i].length; j++) {
				p++;
				if(sc[i][j] > max) {
					max = sc[i][j];
					l = j;
				}
				if(p == 7) {
					e[l] += 1;
				}
			}
		}
		System.out.println("1號同學,最高分次數 " + e[0]);
		System.out.println("2號同學,最高分次數 " + e[1]);
		System.out.println("3號同學,最高分次數 " + e[2]);
		System.out.println("4號同學,最高分次數 " + e[3]);
		System.out.println("5號同學,最高分次數 " + e[4]);
		System.out.println("6號同學,最高分次數 " + e[5]);
		System.out.println("7號同學,最高分次數 " + e[6]);
		System.out.println("8號同學,最高分次數 " + e[7]);
	}

}
