package model.exceções;

public class ContaExceção extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ContaExceção(String mensagem) {
		super(mensagem);
	}
}
