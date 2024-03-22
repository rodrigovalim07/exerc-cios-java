package app;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Quantas linhas sua matriz vai ter? ");
		int m = teclado.nextInt();
		System.out.print("Quantas colunas sua matriz vai ter? ");
		int n = teclado.nextInt();
		int[][] matriz = new int[m][n];
		
		for (int i=0; i < matriz.length; i++) {
			for (int j=0; j < matriz[i].length; j++) {
				matriz[i][j] = teclado.nextInt();
			}
		}
		
		System.out.print("Digite um numero que esteja dentro da matriz: ");
		int x = teclado.nextInt();
		
		for (int i=0; i < matriz.length; i++) {
			for (int j=0; j < matriz[i].length; j++) {
				if (matriz[i][j] == x) {
					System.out.printf("Posição: %d,%d%n", i, j);
                    // Verificar se existe um número à esquerda
                    if (j - 1 >= 0) {
                        System.out.printf("Nº esquerdo: %d%n", matriz[i][j - 1]);
                    } else {
                        System.out.println("Não há número à esquerda.");
                    }
                    // Verificar se existe um número à direita
                    if (j + 1 < matriz[i].length) {
                        System.out.printf("Nº direito: %d%n", matriz[i][j + 1]);
                    } else {
                        System.out.println("Não há número à direita.");
                    }
                    // Verificar se existe um número acima
                    if (i - 1 >= 0) {
                        System.out.printf("Nº de cima: %d%n", matriz[i - 1][j]);
                    } else {
                        System.out.println("Não há número acima.");
                    }
                    // Verificar se existe um número abaixo
                    if (i + 1 < matriz.length) {
                        System.out.printf("Nº de baixo: %d%n", matriz[i + 1][j]);
                    } else {
                        System.out.println("Não há número abaixo.");
                    }
                }
            }
        }

        teclado.close();
    }
}