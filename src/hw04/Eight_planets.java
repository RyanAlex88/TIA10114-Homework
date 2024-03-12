package hw04;

public class Eight_planets {
	
	public static void main(String[] args) {
	
		String[] planets = {"mercury", "venus", "earth", "mars",
					"jupiter", "saturn", "uranus","neptune"};
	
		int sum = 0;
		for(String str: planets) {
			char[] planetsToChar = str.toCharArray();
			for(char a: planetsToChar) {
				switch(a) {
					case 'a':
					case 'e':
					case 'i':
					case 'o':
					case 'u':
						sum++;
						break;
				}
				
			}
		}
		System.out.println("共有幾個 " + sum + " 母音");
	}
}
