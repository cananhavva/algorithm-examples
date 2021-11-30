package ornekler;

import java.util.Scanner;

public class Problem1 {
	
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			int a, b;
			System.out.println("İlk sayı (a) giriniz:");
			a = scn.nextInt();
			System.out.println("İkinci sayı (b) giriniz:");
			b = scn.nextInt();
			int T = a + b;
			int F = a - b;
			int C = a * b;
			double B = a / b;
			System.out.println("Toplam:" + T);
			System.out.println("Fark:" + F);
			System.out.println("Çarpım:" + C);
			System.out.println("Bölüm:" + B);
		}
	}
	
}
