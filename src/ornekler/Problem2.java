package ornekler;

import java.util.Scanner;

public class Problem2 {
	
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("Bir sayı giriniz:");
			int s = scn.nextInt();
			if (s % 2 == 0) {
				System.out.println("Girilen sayi çift sayidir.");
			} else {
				System.out.println("Girilen sayı tek sayıdır.");
				
			}
		}
	}
}
