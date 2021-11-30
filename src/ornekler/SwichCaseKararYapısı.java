package ornekler;

import java.util.Scanner;

public class SwichCaseKararYapısı {
	
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("Bir sayi giriniz:");
			int sayi = scn.nextInt();
			switch (sayi) {
				case 1:
					System.out.println("Girilen sayi 1");
					break;
				case 2:
					System.out.println("Girilen sayi 2");
					break;
				case 3:
					System.out.println("Girilen sayi 3");
					break;
			}
		}
		
	}
	
}
