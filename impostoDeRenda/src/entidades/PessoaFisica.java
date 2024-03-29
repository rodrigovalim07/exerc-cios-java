package entidades;

public class PessoaFisica extends Contribuinte {

	public Double gastoSaude;
	
	public PessoaFisica() {
	}

	public PessoaFisica(String nome, Double rendimentoAnual, Double gastoSaude) {
		super(nome, rendimentoAnual);
		this.gastoSaude = gastoSaude;
	}

	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}
	
	@Override
	public double impostoDeRenda() {
			if (rendimentoAnual < 20000.00) {
				return rendimentoAnual * 0.15 - (gastoSaude * 0.5);
			}
			else {
				return rendimentoAnual * 0.25 - (gastoSaude * 0.5);
			}
	}
}
