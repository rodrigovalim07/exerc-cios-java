package animais;

public class Passaro extends Animal {

	public static Integer contador = 0;
	
	public Passaro() {
	}

	public Passaro(String nome, String cor, Double altura, Double peso) {
		super(nome, cor, altura, peso);
		contador ++;
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
	
	public static Integer getContador() {
		return contador;
	}

	@Override
	public void soar() {
		System.out.println("piu piu");
	}

	@Override
	public String toString() {
		return "Passaro [nome=" + nome + ", cor=" + cor + ", estado de espirito=" + estadoDeEspirito + ", altura=" + altura
				+ ", peso=" + peso + "]";
	}
}
