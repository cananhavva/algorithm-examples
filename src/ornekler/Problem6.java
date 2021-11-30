package ornekler;

import java.util.Scanner;

// taban ve yüksekliği bilinen bir üçgenin alanını hesaplama
public class Problem6 {
	
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("Lütfen üçgenin taban (t) uzunluğunu giriniz:");
			int t = scn.nextInt();
			System.out.println("Lütfen üçgenin yüksekliğini (h) giriniz:");
			int h = scn.nextInt();
			
			int alan = (t * h) / 2;
			System.out.println("Üçgenin alanı:" + alan);
		}
		
	}
	
}
