package imprimirImpares;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int x;
		System.out.print("digite um numero inteiro e será impresso os impares até chegar no próprio: ");
		x = teclado.nextInt();

		for (int i = 0; i <= x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}

		}
	}

}
