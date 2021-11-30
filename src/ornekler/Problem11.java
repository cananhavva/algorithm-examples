package ornekler;

import java.util.Scanner;

public class Problem11 {
	
	public static void main(String[] args) {
		try (// girilen sayının harmonik ortalaması
				Scanner scn = new Scanner(System.in)) {
			double ort = 0, sayi = 0.0;
			int n = 0;
			do {
				System.out.println("bir sayı giriniz çıkmak için 0 giriniz:");
				sayi = scn.nextInt();
				if (sayi != 0) {
					ort += 1.0 / sayi;
					n++;
					
				}
			} while (sayi != 0);
			ort = ((double) n) / ort;
			System.out.println("Harmonik ortalama=" + ort);
		}
		
	}
	
}
