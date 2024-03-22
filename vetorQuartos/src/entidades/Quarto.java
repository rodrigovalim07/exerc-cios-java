package entidades;

public class Quarto {
	private int numero;
	private String email;
	private String nome;
	
	public Quarto(int numero, String email, String nome) {
		this.numero = numero;
		this.email = email;
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		return numero + ": " + nome + ", " + email;
	}
	
}
