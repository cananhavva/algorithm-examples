package ornekler;

import java.util.Scanner;

public class ElseIfKararYapısı {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("sınav puanını giriniz:");
			int puan = scn.nextInt();
			if (puan >= 85 && puan <= 100) {
				System.out.println("Harf notu : AA");
			} else if (puan >= 75) {
				System.out.println("Harf notu : BB");
			} else if (puan >= 60) {
				System.out.println("Harf notu : CC");
			} else if (puan >= 45) {
				System.out.println("Harf notu : DD");
			} else if (puan >= 30) {
				System.out.println("Harf notu : FF");
			} else {
				System.out.println("Yanlış aralıkta bir sayı girdiniz!");
			}
		}
	}
}
