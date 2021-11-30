package ornekler;

import java.util.Scanner;

// Bir üçgende sinüs teoremi ile alan hesaplama

public class Problem7 {
	
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("Birinci kenar uzunluğunu giriniz (a):");
			double a = scn.nextDouble();
			System.out.println("İkinci kenar uzunluğunu giriniz (b):");
			double b = scn.nextDouble();
			System.out.println("İki kenar arasındaki açıyı giriniz(alfa-açı):");
			double aci = scn.nextDouble();
			
			double alan = a * b * Math.sin(aci * Math.PI / 180) / 2;
			System.out.println("Alan:" + alan);
		}
		
	}
	
}
