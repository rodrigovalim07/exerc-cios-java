package app;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		File arquivo = new File("D:\\curso java udemy\\texto.txt");
		Scanner leitor = null;
		
		try {
			leitor = new Scanner(arquivo);
			while (leitor.hasNextLine()) {
				System.out.println(leitor.nextLine());
			}
		}
		catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		finally {
			if (leitor != null) {
				leitor.close();
			}
		}
	}
}
