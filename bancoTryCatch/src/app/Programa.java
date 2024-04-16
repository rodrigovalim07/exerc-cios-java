package app;

import java.util.Scanner;

import model.entidades.Conta;
import model.exceções.ContaExceção;

public class Programa {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		try {
			System.out.println("Entre com os dados da conta");
			System.out.print("Número da conta: ");
			int conta = teclado.nextInt();
			teclado.nextLine();
			System.out.print("Titular: ");
			String nome = teclado.nextLine();
			System.out.print("Saldo inicial: ");
			double saldo = teclado.nextDouble();
			System.out.print("Limite de saque: ");
			double limiteSaque = teclado.nextDouble();
			
			Conta conta1 = new Conta(conta, nome, saldo, limiteSaque);
			
			System.out.println();
			System.out.print("Digite o valor de saque: ");
			double saque = teclado.nextDouble();
			conta1.saque(saque);
			System.out.printf("Novo saldo: $%.2f", conta1.getSaldo());			
		}
		catch (ContaExceção e) {
			System.out.println(e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("Erro inesperado!");
		}
		
		
		teclado.close();
	}

}
