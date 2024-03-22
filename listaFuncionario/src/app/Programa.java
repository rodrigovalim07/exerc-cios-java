package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entidades.Funcionario;

public class Programa {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		List<Funcionario> funcionarios = new ArrayList<>();
		
		System.out.print("Quantos funcionários deseja cadastrar? ");
		int n = teclado.nextInt();
		teclado.nextLine();
		System.out.println();
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Qual o ID do %dº funcionário? ", i+1);
			Integer id = teclado.nextInt();
			while (existeId(funcionarios, id)) {	//chama a funçao existeId, se ela retornar verdadeiro, é pq existe um funcionario com o id digitado
				System.out.print("Esse ID ja existe, digite outro: ");
				id = teclado.nextInt();
				}
			teclado.nextLine();
			System.out.print("Qual o nome do funcionário? ");
			String nome = teclado.nextLine();
			System.out.print("Qual o salário do funcionário? ");
			Double salario = teclado.nextDouble();
			Funcionario funcionario = new Funcionario(id, nome, salario);
			funcionarios.add(funcionario);
			System.out.println();
			}
		
		System.out.print("Qual funcionário receberá o aumento (ID)? ");
		Integer id = teclado.nextInt();
		Funcionario acrescimo = funcionarios.stream().filter(x -> x.getId() == id).findFirst().orElse(null);	//pegando o id da lista funcionarios
		if (acrescimo == null) {	
			System.out.println("Esse empregado não existe");
		}
		else {
			System.out.print("Qual o aumento em porcentagem? ");
			Double acrescimoSal = teclado.nextDouble();
			acrescimo.aumentoSalario(acrescimoSal);
		}
		System.out.println();
		
		System.out.println("Lista dos funcionários:");
		for (Funcionario funcionarioAtual : funcionarios) {
		    System.out.println(funcionarioAtual);
		}
		
		teclado.close();
	}
	
	/*public static boolean existeId(List<Funcionario> funcionarios, int id) {	// procura o funcionario, se achar retorna diferente de nulo (true)
		Funcionario acharId = funcionarios.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return acharId != null;*/
	
	public static boolean existeId(List<Funcionario> list, int id) {
	    return list.stream().filter(x -> x.getId() == id).findFirst().isPresent();
	}	/*O método isPresent verifica se o findFirst contém um valor. Se contiver, significa que um funcionário foi encontrado
	      com o ID especificado e true é retornado. Caso contrário, false é retornado.*/


}
