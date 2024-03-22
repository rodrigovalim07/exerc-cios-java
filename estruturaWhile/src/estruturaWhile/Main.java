package estruturaWhile;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.print("digite um valor para ser somado (se for 0 o programa encerra): ");
		int condicao = teclado.nextInt();
		int soma = 0;
		soma += condicao;
		
		while (condicao != 0) {
			System.out.print("digite um valor para ser somado (se for 0 o programa encerra): ");
			condicao = teclado.nextInt();
			soma += condicao;
			
		}
		
		System.out.println("o resultado da soma dos numeros digitados foi: " + soma);		

	}

}
