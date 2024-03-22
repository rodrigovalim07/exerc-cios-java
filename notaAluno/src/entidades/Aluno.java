package entidades;

public class Aluno {
	
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double notaFinal () {
		return nota1 + nota2 + nota3;
	}
	
	public String resultado () {
		double restante;
		if (notaFinal() >= 60) {
			return "Aprovado";
		} else {
			restante = - notaFinal() + 60;
			return String.format("Reprovado\nFaltaram %.2f pontos", restante);
		}
	}
	
	public String toString() {
		return "Nota final: " + notaFinal() + "\n" + resultado();
	}
}
