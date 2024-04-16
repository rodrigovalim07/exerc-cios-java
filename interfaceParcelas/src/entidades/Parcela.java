package entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Parcela {
	
	private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	private Double quantia;
	private LocalDate dataVencimento;
	
	public Parcela(Double quantia, LocalDate dataVencimento) {
		this.quantia = quantia;
		this.dataVencimento = dataVencimento;
	}

	public Double getQuantia() {
		return quantia;
	}

	public void setQuantia(Double quantia) {
		this.quantia = quantia;
	}

	public LocalDate getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(LocalDate dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	
	public String toString() {
		return dtf.format(dataVencimento) + " - "  + String.format("%.2f", quantia);
	}
}
