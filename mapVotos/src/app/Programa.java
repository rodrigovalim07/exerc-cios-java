package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Map<String, Integer> votos = new LinkedHashMap<>();
		
		System.out.print("Informe o caminho do arquivo: ");
		String caminho = teclado.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
			String linha = br.readLine();
			while (linha != null) {
				String[] partes = linha.split(",");
				String candidato = partes[0];
				Integer quantidadeVotos = Integer.parseInt(partes[1]);
				
				if (votos.containsKey(partes[0])) {
					votos.put(candidato, votos.get(candidato) + quantidadeVotos);
				}
				else {
					votos.put(candidato, quantidadeVotos);
				}
				
				linha = br.readLine();
			}
		}
		catch (IOException e) {
			System.out.print("Erro: " + e.getMessage());
		}
		
		for (String voto : votos.keySet()) {
			System.out.println(voto + ": " + votos.get(voto));
		}

		teclado.close();
	}
}
