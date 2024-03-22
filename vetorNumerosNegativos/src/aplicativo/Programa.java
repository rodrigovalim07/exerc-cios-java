package aplicativo;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n;
		int x[];
		
		System.out.print("Quantos números deseja ver os negativos? ");
		n = teclado.nextInt();
		
		while (n > 10 ) {
			System.out.println("Número alto, digite um entre 1 a 10: ");
			n = teclado.nextInt();
		}
		
		int vetor[] = new int[n];
		
		for (int i=0; i < vetor.length; i++) {
			System.out.print("Digite o número: ");
			vetor[i] = teclado.nextInt();
		}
		
		System.out.println("Valores negativos:");
		for (int i=0; i < vetor.length; i++) {
			if (vetor[i] < 0) {
				System.out.println(vetor[i]);;
			}
		}
		
		

	}

}
