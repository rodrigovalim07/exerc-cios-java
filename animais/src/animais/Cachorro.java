package animais;

public class Cachorro extends Animal {

	private static Integer contador = 0;
	private Double tamanhoRabo;
	
	public Cachorro() {
	}
	
	public Cachorro(String nome, String cor, Double altura, Double peso, Double tamanhoRabo) {
		super(nome, cor, altura, peso);
		this.tamanhoRabo = tamanhoRabo;
		contador ++;
	}
	
	public Double getTamanhoRabo() {
		return tamanhoRabo;
	}

	public void setTamanhoRabo(Double tamanhoRabo) {
		this.tamanhoRabo = tamanhoRabo;
	}

	public static Integer getContador() {
		return contador;
	}

	@Override
	public void soar() {
		System.out.println("au au");
	}
	
	public String interagir(String acao) {
//		if (acao.equals("carinho")) this.estadoDeEspirito = "feliz";
//		else if (acao.equals("gritar")) this.estadoDeEspirito = "triste";
//		else this.estadoDeEspirito = "neutro";
//		return estadoDeEspirito;
		
		// outra opção
		switch (acao) {
			case "carinho": this.estadoDeEspirito = "feliz"; break;
			case "gritar": this.estadoDeEspirito = "triste"; break;
			default: this.estadoDeEspirito = "neutro";
		}
		return estadoDeEspirito;
	}
	
	@Override
	public String toString() {
		return "Cachorro: nome=" + nome + ", cor=" + cor + ", altura=" + altura + ", peso=" + peso + ", tamanho do rabo="
				+ tamanhoRabo;
	}
}
