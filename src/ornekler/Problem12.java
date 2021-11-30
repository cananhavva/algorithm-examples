package ornekler;

import java.util.Scanner;

public class Problem12 {
	
	public static void main(String[] args) {
		// iki sayı arasındaki sayıları belirli bir adım miktarına göre toplama
		Scanner scn = new Scanner(System.in);
		int x, y, n, toplam = 0;
		System.out.println("Başlangıç değerini giriniz(x):");
		x = scn.nextInt();
		System.out.println("Bitiş değerini giriniz(y):");
		y = scn.nextInt();
		System.out.println("Adım değerini giriniz(n):");
		n = scn.nextInt();
		for (int i = x; i <= y; i += n) {
			toplam += i;
		}
		System.out.println("toplam=" + toplam);
		
	}
	
}
