package br.com.generation.javainvest;

public class Usuario {
	
	private String nome;
	private double rendaFixa, rendaVariavel, despesaFixa, despesaVariavel;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getRendaFixa() {
		return rendaFixa;
	}
	public void setRendaFixa(double rendaFixa) {
		this.rendaFixa = rendaFixa;
	}
	public double getRendaVariavel() {
		return rendaVariavel;
	}
	public void setRendaVariavel(double rendaVariavel) {
		this.rendaVariavel = rendaVariavel;
	}
	public double getDespesaFixa() {
		return despesaFixa;
	}
	public void setDespesaFixa(double despesaFixa) {
		this.despesaFixa = despesaFixa;
	}
	public double getDespesaVariavel() {
		return despesaVariavel;
	}
	public void setDespesaVariavel(double despesaVariavel) {
		this.despesaVariavel = despesaVariavel;
	}
	
	
}
