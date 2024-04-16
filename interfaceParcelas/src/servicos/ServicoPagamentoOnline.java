package servicos;

public interface ServicoPagamentoOnline {

	double taxaPagamento(double quantia);

	double jurosSimples(double quantia, double meses);
}
