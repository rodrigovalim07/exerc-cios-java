package app;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entidades.Aluno;

public class Programa {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		Set<Aluno> a = new HashSet<>();
		Set<Aluno> b = new HashSet<>();
		Set<Aluno> c = new HashSet<>();
		Set<Aluno> todos = new HashSet<>();
		
		System.out.print("Quantos alunos no curso A: ");
		int n = teclado.nextInt();
		for (int i = 0; i < n; i++) {
			int codigo = teclado.nextInt();
			a.add(new Aluno(codigo));
		}
		
		System.out.print("Quantos alunos no curso B: ");
		n = teclado.nextInt();
		for (int i = 0; i < n; i++) {
			int codigo = teclado.nextInt();
			b.add(new Aluno(codigo));
		}
		
		System.out.print("Quantos alunos no curso C: ");
		n = teclado.nextInt();
		for (int i = 0; i < n; i++) {
			int codigo = teclado.nextInt();
			c.add(new Aluno(codigo));
		}
		
		todos.addAll(a);
		todos.addAll(b);
		todos.addAll(c);
		
		System.out.print("Total de estudantes: " + todos.size());
		
		teclado.close();
	}
}
