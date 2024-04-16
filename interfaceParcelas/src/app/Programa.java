package app;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entidades.Contrato;
import servicos.ServicoContrato;
import servicos.ServicoPaypal;

public class Programa {

	public static void main(String[] args) throws ParseException {
		Scanner teclado = new Scanner(System.in);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println("Entre com os dados do contrato:");
		System.out.print("Número: ");
		int numero = teclado.nextInt();
		teclado.nextLine();
		System.out.print("Data (dd/mm/aaaa): ");
		LocalDate data = LocalDate.parse(teclado.nextLine(), dtf);
		System.out.print("Valor do contrato: ");
		double valor = teclado.nextDouble();
		System.out.print("Número de parcelas: ");
		int parcelas = teclado.nextInt();
		
		Contrato contrato = new Contrato(numero, data, valor);
		ServicoContrato servico = new ServicoContrato(new ServicoPaypal());
		System.out.println("Parcelas:");
		servico.processarContrato(contrato, parcelas);
		
		
		
		
		teclado.close();
	}

}
