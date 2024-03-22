package utilitarios;

public class Banco {
	private String nome;
	private int conta;
	private double saldo;

	public Banco(String nome, int conta) {
		this.nome = nome;
		this.conta = conta;
	}
	
	public Banco(String nome, int conta, double deposito) {
		this.nome = nome;
		this.conta = conta;
		deposito(deposito);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getConta() {
		return conta;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public static int taxa = 5;
	
	public void deposito(double deposito) {
		saldo += deposito;
	}
	
	public void saque(double saque) {
		saldo -= saque + taxa;
	}
	
	public String toString() {
		return "Conta: " + conta + ", Titular: " + nome + String.format(", Saldo: $%.2f", saldo);
	}
	
}
