package ornekler;

// pisagor teoremi ile hipotenüs hesaplama
import java.util.Scanner;

public class Problem5 {
	
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("Üçgenin 1. dik kenar uzunluğunu giriniz:");
			double a = scn.nextDouble();
			System.out.println("Üçgenin 2. dik uzunluğunu giriniz:");
			double b = scn.nextDouble();
			
			double Hipotenus = Math.sqrt(a * a + b * b);
			System.out.println("hipotenüs:" + Hipotenus);
		}
		
	}
	
}
