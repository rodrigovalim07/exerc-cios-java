package servicos;

import java.time.LocalDate;

import entidades.Contrato;
import entidades.Parcela;

public class ServicoContrato {
	
	private ServicoPagamentoOnline taxas;

	public ServicoContrato(ServicoPagamentoOnline taxas) {
		this.taxas = taxas;
	}

	public void processarContrato(Contrato contrato, int meses) {
		
		for (int parcela = 1; parcela <= meses; parcela++) {
			LocalDate dataPagamento = contrato.getData().plusMonths(parcela);
			double valorSemJuros = contrato.getValorTotal() / meses;
			double simples = taxas.jurosSimples(valorSemJuros, parcela);
			double taxa = taxas.taxaPagamento(valorSemJuros + simples);
			double valorParcela = valorSemJuros + simples + taxa;

			Parcela parcelas = new Parcela(valorParcela, dataPagamento);
			contrato.addParcelas(parcelas);
        }
		contrato.getParcelas();
	}
}
