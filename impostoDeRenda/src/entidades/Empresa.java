package entidades;

public class Empresa extends Contribuinte{

	public Integer nFuncionarios;
	
	public Empresa() {
	}

	public Empresa(String nome, Double rendimentoAnual, Integer nFuncionarios) {
		super(nome, rendimentoAnual);
		this.nFuncionarios = nFuncionarios;
	}

	public Integer getnFuncionarios() {
		return nFuncionarios;
	}

	public void setnFuncionarios(Integer nFuncionarios) {
		this.nFuncionarios = nFuncionarios;
	}
	
	@Override
	public double impostoDeRenda() {
		if (nFuncionarios <= 10) {
			return rendimentoAnual * 0.16;
		}
		else {
			return rendimentoAnual * 0.14;
		}
	}
}
