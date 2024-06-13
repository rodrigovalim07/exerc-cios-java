package animais;

public abstract class Animal {

	protected String nome;
	protected String cor;
	protected String estadoDeEspirito;
	protected Double altura;
	protected Double peso;
	
	public Animal() {
	}
	
	public Animal(String nome, String cor, Double altura, Double peso) {
		this.nome = nome;
		this.cor = cor;
		this.altura = altura;
		this.peso = peso;
		this.estadoDeEspirito = "neutro";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getEstadoDeEspirito() {
		return estadoDeEspirito;
	}

	public void setEstadoDeEspirito(String estadoDeEspirito) {
		this.estadoDeEspirito = estadoDeEspirito;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public void comer() {
	}
	
	public void dormir() {
	}
	
	public void soar() {
	}
}
