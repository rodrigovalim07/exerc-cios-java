package entidades;

public class ProdutoImportado extends Produto {

	private Double taxaAlfandega;
	
	public ProdutoImportado() {
	}

	public ProdutoImportado(String nome, Double preco, Double taxaAlfandega) {
		super(nome, preco);
		this.taxaAlfandega = taxaAlfandega;
	}

	public Double getTaxaAlfandega() {
		return taxaAlfandega;
	}

	public void setTaxaAlfandega(Double taxaAlfandega) {
		this.taxaAlfandega = taxaAlfandega;
	}
	
	@Override
	public String etiquetaPreco() {
		return nome + " $" + String.format("%.2f", precoTotal()) + " (Taxa Alfandegária: " + taxaAlfandega + ")";
	}
	
	public Double precoTotal() {
		return preco + taxaAlfandega;
	}
}
