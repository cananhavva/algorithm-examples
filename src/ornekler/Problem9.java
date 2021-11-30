package ornekler;

import java.util.Scanner;

public class Problem9 {
	
	public static void main(String[] args) {
		try (// 2. dereceden bir denklemin köklerini bulma
				Scanner scn = new Scanner(System.in)) {
			System.out.println("Katsayı giriniz(a):");
			double a = scn.nextDouble();
			System.out.println("katsayı giriniz(b):");
			double b = scn.nextDouble();
			System.out.println("katsayı giriniz (c):");
			double c = scn.nextDouble();
			
			double D = b * b - 4 * a * c;
			if (D > 0) {
				double x1 = (-b + Math.sqrt(D)) / 2 * a;
				double x2 = (-b - Math.sqrt(D)) / 2 * a;
				System.out.println("kök 1 (x1):" + x1);
				System.out.println("kök 2 (x2):" + x2);
				
			} else if (D == 0) {
				double x1 = (-b + Math.sqrt(D)) / 2 * a;
				System.out.println("kök 1 (x1):" + x1);
				
			} else if (D < 0) {
				System.out.println("Reel kökler yoktur.");
				
			}
		}
	}
	
}
