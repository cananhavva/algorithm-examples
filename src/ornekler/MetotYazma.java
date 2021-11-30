package ornekler;

import java.util.Scanner;

public class MetotYazma {
	
	public static void main(String[] args) {
		int a, b;
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("1. sayıyı giriniz:");
			a = scn.nextInt();
			System.out.println("2. sayıyı giriniz:");
			b = scn.nextInt();
		}
		int sonuc = Topla(a, b);
		System.out.println("bu sayıların toplamı=" + sonuc);
		
	}
	
	public static int Topla(int a, int b) {
		
		int sonuc = a + b;
		return sonuc;
	}
	
}
