package model.entidades;

import model.exceções.ContaExceção;

public class Conta {

	private Integer numero;
	private String titular;
	private Double saldo;
	private Double limiteSaque;
	
	public Conta() {
	}

	public Conta(Integer numero, String titular, Double saldo, Double limiteSaque) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(Double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}

	public Double getSaldo() {
		return saldo;
	}
	
	public void deposito(Double deposito) {
		saldo += deposito;
	}
	
	public void saque(double saque) {
		if (saque > limiteSaque) {
			throw new ContaExceção("Essa quantia excede seu limite de saque");
		}
		else if (saque > saldo) {
			throw new ContaExceção("Essa quantia excede o saldo da conta");
		}
		saldo -= saque;
	}
}
