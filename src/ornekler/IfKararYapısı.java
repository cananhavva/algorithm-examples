package ornekler;

import java.util.Scanner;

public class IfKararYapısı {
	
	public static void main(String[] args) {
		
		try (Scanner scn = new Scanner(System.in)) {
			int sayi;
			
			System.out.println("Lütfen bir sayı giriniz :");
			sayi = scn.nextInt();
			
			if (sayi >= 10) {
				System.out.println("Sayı 10'dan büyük veya eşittir.");
			} else {
				System.out.println("sayı 10'dan küçüktür.");
			}
		}
	}
	
}
