package divisao;

import java.util.Scanner;

public class Msin {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n;
		float n1, n2, resultado = 0;

		System.out.print("digite quantos pares de números deseja dividir: ");
		n = teclado.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print("qual numero sera dividido? ");
			n1 = teclado.nextInt();

			System.out.print("qual numero ira dividir? ");
			n2 = teclado.nextInt();
			if (n2 == 0) {
				System.out.println("divisão invalida");
			} else {
				resultado = n1 / n2;
				System.out.println("o resultado é: " + resultado);
			}

		}
	}

}
