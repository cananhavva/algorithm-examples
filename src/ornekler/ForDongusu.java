package ornekler;

public class ForDongusu {
	
	public static void main(String[] args) {
		for (int i = 0; i <= 20; i++) {
			System.out.println(i);
		} // iki değişkenli for döngüsü
		
		for (int a = 0, b = 20; a <= 20 && b >= 10; a += 2, b--) {
			System.out.println(a + "\t" + b);
		}
		// içiçe döngüler
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.println("*");
			}
			System.out.println();
		}
		// break anahtar kelimesi ile döngü sonlanır!!
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println(i);
		}
		// continue anahtar kelimesi çalıştırıldığında kod işlemeden bir sonraki
		// iterasyona (ardışık işleme) geçiş yapılır.
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.println(i);
		}
	}
	
}
