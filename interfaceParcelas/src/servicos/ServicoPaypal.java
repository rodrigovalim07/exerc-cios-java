package servicos;

public class ServicoPaypal implements ServicoPagamentoOnline {

	public double taxaPagamento(double quantia) {
		return quantia * 0.02;
	}
	
	public double jurosSimples(double quantia, double meses) {
		return quantia * (0.01 * meses);
	}
	
}
