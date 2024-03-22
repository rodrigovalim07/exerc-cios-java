package aplicativo;

import java.util.Scanner;

import utilitarios.Banco;

public class Programa {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nome;
		char x;
		int conta;
		double deposito, saque;
		Banco banco;
		
		System.out.print("Digite o número da conta: ");
		conta = teclado.nextInt();
		teclado.nextLine();
		System.out.print("Nome do titular da conta: ");
		nome = teclado.nextLine();
		System.out.print("Deseja fazer um depósito inicial (s/n)? ");
		x = teclado.next().charAt(0);
		
		if (x == 's') {
			System.out.print("Qual o valor do deposito inicial? ");
			deposito = teclado.nextDouble();
			banco = new Banco(nome, conta, deposito);
		}
		else {
			banco = new Banco(nome, conta);
		}
		
		System.out.println(banco);
		
		System.out.print("Qual o valor que deseja depositar? ");
		deposito = teclado.nextDouble();
		banco.deposito(deposito);
		System.out.println("Conta atualizada:");
		System.out.println(banco);
		
		System.out.print("Valor do saque (taxa de $5,00): ");
		saque = teclado.nextDouble();
		banco.saque(saque);
		System.out.println("Conta atualizada:");
		System.out.println(banco);
		
		
		teclado.close();
	}

}
