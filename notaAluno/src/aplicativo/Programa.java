package aplicativo;

import java.util.Scanner;

import entidades.Aluno;

public class Programa {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		Aluno aluno = new Aluno();
		
		System.out.print("Nome do aluno: ");
		aluno.nome = teclado.nextLine();
		System.out.print("Nota do primeiro bimestre: ");
		aluno.nota1 = teclado.nextDouble();
		System.out.print("Nota do segundo bimestre: ");
		aluno.nota2 = teclado.nextDouble();
		System.out.print("Nota do terceiro bimestre: ");
		aluno.nota3 = teclado.nextDouble();
		
		System.out.println(aluno);

	}

}
