package br.com.generation.javainvest;

public class Calculos{

	public double calcularRenda(double rendaFixa, double rendaVariavel) {
		return rendaFixa + rendaVariavel;
	}
	
	public double calcularDespesa(double despesaFixa, double despesaVariavel) {
		return despesaFixa + despesaVariavel;
	}
	
	public double despesaSobreRenda(double renda, double despesa) { 
		return (100 * despesa)/renda;
	}
	
	public double calcularValorRestante(double renda, double porcentagem) { 
		return (porcentagem * renda)/100;
	}
}
