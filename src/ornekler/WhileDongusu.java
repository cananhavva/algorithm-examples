package ornekler;

import java.util.Scanner;

public class WhileDongusu {
	
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			int sayac = 1;
			int toplam = 0;
			while (sayac <= 10) {
				System.out.println(sayac + ". sayıyı giriniz:");
				int sayi = scn.nextInt();
				toplam += sayi;
				sayac++;
				
			}
			System.out.println("girilen sayıların toplamı:" + toplam);
		}
		
	}
	
}
