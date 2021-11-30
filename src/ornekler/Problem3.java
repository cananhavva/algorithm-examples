package ornekler;

import java.util.Scanner;

public class Problem3 {
	
	public static void main(String[] args) {
		try (// karenin çevresini bulan alg
				Scanner scn = new Scanner(System.in)) {
			System.out.println("Lütfen karenin bir kenar uzunluğunu giriniz:");
			double u = scn.nextDouble();
			double cevre = u * 4;
			double alan = u * u;
			System.out.println("karenin çevresi:" + cevre);
			System.out.println("karenin alanı:" + alan);
		}
	}
	
	public static void main1(String[] args) {
		try (// dikdörtgenin çevre ve alanını hesaplayalım.
				Scanner scn = new Scanner(System.in)) {
			System.out.println("Lütfen dikdörtgenin uzun kenarını giriniz:");
			double a = scn.nextDouble();
			System.out.println("Lütfen dikdörtgenin kısa kenarını giriniz:");
			double b = scn.nextDouble();
			double cevre = (a + b) * 2;
			double alan = a * b;
			System.out.println("dikdörtgenin çevresi:" + cevre);
			System.out.println("dikdörtgenin alanı:" + alan);
		}
	}
	
	public static void main2(String[] args) {
		try (// kürenin alanını ve hacmini hesaplama
				Scanner scn = new Scanner(System.in)) {
			System.out.println("Lütfen kürenin yarı çapını giriniz:");
			double r = scn.nextDouble();
			final double PI = 3.14;
			double alan = 4 * PI * r * r;
			double hacim = (4 / 3) * PI * r * r * r;
			System.out.println("Kürenin alanı:" + alan);
			System.out.println("Kürenin hacmi:" + hacim);
		}
		
	}
}