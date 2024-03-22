package aplicativo;

import java.util.Scanner;

import entidades.Funcionario;

public class Programa {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();
		
		System.out.print("Nome do funcionário: ");
		funcionario.nome = teclado.nextLine();
		System.out.print("Salário bruto: ");
		funcionario.salarioBruto = teclado.nextDouble();
		System.out.print("Imposto: ");
		funcionario.imposto = teclado.nextDouble();
		System.out.println("Funcionário: " + funcionario);
		
		System.out.print("Digite a porcentagem de aumento no salário: ");
		funcionario.acrescimoSalario(teclado.nextDouble());
		System.out.println("Dados atualizados: " + funcionario);
		
	}

}
