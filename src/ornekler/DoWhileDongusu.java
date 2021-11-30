package ornekler;

import java.util.Scanner;

public class DoWhileDongusu {
	
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			int sayi;
			do {
				System.out.println("Bir sayı giriniz(Programdan çıkmak için 0 giriniz):");
				sayi = scn.nextInt();
				System.out.println(sayi * sayi);
			} while (sayi != 0);
		}
		System.out.println("Sayı olarak 0 girildi ve programdan çıkıldı.");
		
	}
	
}
