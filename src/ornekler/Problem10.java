package ornekler;

import java.util.Scanner;

public class Problem10 {
	
	public static void main(String[] args) {
		try (// Girilen sayının ortalamasını hesaplama
				Scanner scn = new Scanner(System.in)) {
			double ort = 1.0;
			int n = 0, sayi = 0;
			do {
				System.out.println("Bir sayi giriniz, çıkmak için 0 giriniz.:");
				sayi = scn.nextInt();
				if (sayi != 0) {
					ort *= sayi;
					n++;
					
				}
				
			} while (sayi != 0);
			ort = Math.pow(ort, 1.0 / (double) n);
			System.out.println("geometrik ortalama:" + ort);
		}
		
	}
	
}
