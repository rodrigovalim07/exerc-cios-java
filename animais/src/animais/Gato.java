package animais;

public class Gato extends Animal {

	public static Integer contador = 0;
	
	public Gato() {
	}

	public Gato(String nome, String cor, Double altura, Double peso) {
		super(nome, cor, altura, peso);
		contador ++;
	}
	
	public static Integer getContador() {
		return contador;
	}

	@Override
	public void soar() {
		System.out.println("miau miau");
	}

	@Override
	public String toString() {
		return "Gato [nome=" + nome + ", cor=" + cor + ", estado de espirito=" + estadoDeEspirito + ", altura=" + altura
				+ ", peso=" + peso + "]";
	}
}
