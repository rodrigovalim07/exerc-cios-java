package aplicativo;

import java.util.Scanner;

import utilitatios.ConversordeMoeda;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double compra, dolar;
		
		System.out.print("Qual o preço do dólar: ");
		dolar = teclado.nextDouble();
		
		System.out.print("Quantos dólares deseja comprar: ");
		compra = teclado.nextDouble();
		
		System.out.print("Total a pagar em reais: ");
		System.out.print(ConversordeMoeda.totalCompra(compra, dolar));
		
		teclado.close();
	}

}
