package br.com.generation.javainvest;

import javax.swing.JOptionPane;

public class JavaInvest {

	public static void main(String[] args) {
		
		Calculos calc = new Calculos();
		Usuario user = new Usuario();
		
		int opcao;
		double despesaRenda, resto, rendaTotal, despesa, despesaTotal, lazer, investimento;
		
		
		
		//Pegando entradas do usuário
		user.setNome(JOptionPane.showInputDialog(null, "Informe seu nome: ", "Java Invest", JOptionPane.INFORMATION_MESSAGE));

		user.setRendaFixa(Double.parseDouble(JOptionPane.showInputDialog(null, "Informe seus ganhos fixos: ", "Java Invest", JOptionPane.INFORMATION_MESSAGE)));
		
		user.setRendaVariavel(Double.parseDouble(JOptionPane.showInputDialog(null, "Informe seus ganhos variáveis: ", "Java Invest", JOptionPane.INFORMATION_MESSAGE)));
		
		user.setDespesaFixa(Double.parseDouble(JOptionPane.showInputDialog(null, "Informe suas despesas fixas: ", "Java Invest", JOptionPane.INFORMATION_MESSAGE)));
		
		user.setDespesaVariavel(Double.parseDouble(JOptionPane.showInputDialog(null, "Informe suas despesas variáveis: ", "Java Invest", JOptionPane.INFORMATION_MESSAGE)));
		
		
		//Calculo do total da renda (fixa + variavel) - metodo na classe calculos
		rendaTotal = calc.calcularRenda(user.getRendaFixa(), user.getRendaVariavel());
		
		
		//Calculo do total das despesas (fixa + variavel)- metodo na classe calculos
		despesaTotal = calc.calcularDespesa(user.getDespesaFixa(), user.getDespesaVariavel());
		
		//Calculo das depesas sobre a renda (100 * despesa)/renda 
		despesaRenda = calc.despesaSobreRenda(rendaTotal, despesaTotal);
	
		
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha um perfil de investimento: " + 
					"\n1 - Perfil investimento baixo" 
					+ "\n2 - Perfil investimento intermediário" 
					+ "\n3 - Perfil investimento alto" 
					+ "\n4 - Ajuda(?)", "Java Invest", JOptionPane.INFORMATION_MESSAGE));
			switch(opcao) {
				case 1: 
					if(despesaRenda >= 0 && despesaRenda < 50 ) {
						JOptionPane.showMessageDialog(null,"As suas despesas representam: " + Math.round(despesaRenda)  + "% da sua renda", "Java Invest", JOptionPane.INFORMATION_MESSAGE);
						resto = despesaRenda - 40;
						if(resto >= 0) {
							despesa = (despesaRenda/100) * rendaTotal;
							lazer = calc.calcularValorRestante(rendaTotal, (50 - resto));
							investimento = calc.calcularValorRestante(rendaTotal, 10);
							JOptionPane.showMessageDialog(null, user.getNome() + ", com base nos seus ganhos, despesas e perfil de investimento baixo, \nas indicações para gerenciamento financeiro são:" 
															+ "\n\nR$ " + Math.round(despesa) + ", para destinar as despesas fixas;" + "\nR$ " 
															+ Math.round(lazer) + ", para lazer; \nR$ " + Math.round(investimento) + " para investir.", "Java Invest", JOptionPane.INFORMATION_MESSAGE);
						}
						else {
							despesa = (despesaRenda/100) * rendaTotal;
							lazer = calc.calcularValorRestante(rendaTotal, 50);
							investimento = calc.calcularValorRestante(rendaTotal, (10 - resto));
							JOptionPane.showMessageDialog(null, user.getNome() + ", com base nos seus ganhos, despesas e perfil de investimento baixo, \nas indicações para gerenciamento financeiro são:"  
															+ "\n\nR$ " + Math.round(despesa) + ", para destinar as despesas fixas;" + "\nR$ " 
															+ Math.round(lazer) + ", para lazer; \nR$ " + Math.round(investimento) + " para investir.", "Java Invest", JOptionPane.INFORMATION_MESSAGE);
						}
					}
					else if(despesaRenda >= 50 && despesaRenda < 60) {
						JOptionPane.showMessageDialog(null,"As suas despesas representam: " + Math.round(despesaRenda) + "% da sua renda");
						resto = despesaRenda - 50;
						if(resto >= 0) {
							despesa = (despesaRenda/100) * rendaTotal;
							lazer = calc.calcularValorRestante(rendaTotal, (40 - resto));
							investimento = calc.calcularValorRestante(rendaTotal, 10);
							JOptionPane.showMessageDialog(null, user.getNome() + ", com base nos seus ganhos, despesas e perfil de investimento baixo, \nas indicações para gerenciamento financeiro são:"  
									+ "\n\nR$ " + Math.round(despesa) + ", para destinar as despesas fixas;" + "\nR$ " 
									+ Math.round(lazer) + ", para lazer; \nR$ " + Math.round(investimento) + " para investir.", "Java Invest", JOptionPane.INFORMATION_MESSAGE);
						}
						else {
							despesa = (despesaRenda/100) * rendaTotal;
							lazer = calc.calcularValorRestante(rendaTotal, 40);
							investimento = calc.calcularValorRestante(rendaTotal, (10 - resto));
							JOptionPane.showMessageDialog(null, user.getNome() + ". com base nos seus ganhos, despesas e perfil de investimento baixo, \nas indicações para gerenciamento financeiro são:"  
									+ "\n\nR$ " + Math.round(despesa) + ", para destinar as despesas fixas;" + "\nR$ " 
									+ Math.round(lazer) + ", para lazer; \nR$ " + Math.round(investimento) + " para investir.", "Java Invest", JOptionPane.INFORMATION_MESSAGE);
						}
						
					}
					else if(despesaRenda >= 60 && despesaRenda <= 65) {
						JOptionPane.showMessageDialog(null,"As suas despesas representam: " + Math.round(despesaRenda) + "% da sua renda");
						resto = despesaRenda - 60;
						if(resto >= 0) {
							despesa = (despesaRenda/100) * rendaTotal;
							lazer = calc.calcularValorRestante(rendaTotal, (37 - resto));
							investimento = calc.calcularValorRestante(rendaTotal, 3);
							JOptionPane.showMessageDialog(null, user.getNome() + ", com base nos seus ganhos, despesas e perfil de investimento baixo, \nas indicações para gerenciamento financeiro são:"  
									+ "\n\nR$ " + Math.round(despesa) + ", para destinar as despesas fixas;" + "\nR$ " 
									+ Math.round(lazer) + ", para lazer; \nR$ " + Math.round(investimento) + " para investir.", "Java Invest", JOptionPane.INFORMATION_MESSAGE);
						}
						else {
							despesa = (despesaRenda/100) * rendaTotal;
							lazer = calc.calcularValorRestante(rendaTotal, 37);
							investimento = calc.calcularValorRestante(rendaTotal, (3 - resto));
							JOptionPane.showMessageDialog(null, user.getNome() + ", com base nos seus ganhos, despesas e perfil de investimento baixo, \nas indicações para gerenciamento financeiro são:"  
									+ "\n\nR$ " + Math.round(despesa) + ", para destinar as despesas fixas;" + "\nR$ " 
									+ Math.round(lazer) + ", para lazer; \nR$ " + Math.round(investimento) + " para investir.", "Java Invest", JOptionPane.INFORMATION_MESSAGE);
						}
					}
					else {
						JOptionPane.showMessageDialog(null, "Oops! " + user.getNome() + ", parece que você ainda não tem perfil para investir!", "Java Invest", JOptionPane.INFORMATION_MESSAGE);
					}
				break;
				case 2: 
					if(despesaRenda >= 0 && despesaRenda < 50 ) {
						JOptionPane.showMessageDialog(null,"Porcentagem da despesa: " + Math.round(despesaRenda) + "%", "Java Invest", JOptionPane.INFORMATION_MESSAGE);
						resto = despesaRenda - 40;	
						if(resto >= 0) {
							despesa = (despesaRenda/100) * rendaTotal;
							lazer = calc.calcularValorRestante(rendaTotal, (45 - resto));
							investimento = calc.calcularValorRestante(rendaTotal, 15);
							JOptionPane.showMessageDialog(null, user.getNome() + ", com base nos seus ganhos, despesas e perfil de investimento intermediário, \nas indicações para gerenciamento financeiro são:" 
															+ "\n\nR$ " + Math.round(despesa) + ", para destinar as despesas fixas;" + "\nR$ " 
															+ Math.round(lazer) + ", para lazer; \nR$ " + Math.round(investimento) + " para investir.", "Java Invest", JOptionPane.INFORMATION_MESSAGE);
						}
						else {
							despesa = (despesaRenda/100) * rendaTotal;
							lazer = calc.calcularValorRestante(rendaTotal, 45);
							investimento = calc.calcularValorRestante(rendaTotal, (15 - resto));
							JOptionPane.showMessageDialog(null, user.getNome() + ", com base nos seus ganhos, despesas e perfil de investimento intermediário, \nas indicações para gerenciamento financeiro são:"  
															+ "\n\nR$ " + Math.round(despesa) + ", para destinar as despesas fixas;" + "\nR$ " 
															+ Math.round(lazer) + ", para lazer; \nR$ " + Math.round(investimento) + " para investir.", "Java Invest", JOptionPane.INFORMATION_MESSAGE);
						}
					}
					else if(despesaRenda >= 50 && despesaRenda < 60) {
						JOptionPane.showMessageDialog(null,"Porcentagem da despesa: " + Math.round(despesaRenda) + "%", "Java Invest", JOptionPane.INFORMATION_MESSAGE);
						resto = despesaRenda - 50;	
						if(resto >= 0) {
							despesa = (despesaRenda/100) * rendaTotal;
							lazer = calc.calcularValorRestante(rendaTotal, (30 - resto));
							investimento = calc.calcularValorRestante(rendaTotal, 20);
							JOptionPane.showMessageDialog(null, user.getNome() + ", com base nos seus ganhos, despesas e perfil de investimento intermediário, \nas indicações para gerenciamento financeiro são:" 
															+ "\n\nR$ " + Math.round(despesa) + ", para destinar as despesas fixas;" + "\nR$ " 
															+ Math.round(lazer) + ", para lazer; \nR$ " + Math.round(investimento) + " para investir.", "Java Invest", JOptionPane.INFORMATION_MESSAGE);
						}
						else {
							despesa = (despesaRenda/100) * rendaTotal;
							lazer = calc.calcularValorRestante(rendaTotal, 30);
							investimento = calc.calcularValorRestante(rendaTotal, (20 - resto));
							JOptionPane.showMessageDialog(null, user.getNome() + ", com base nos seus ganhos, despesas e perfil de investimento intermediário, \nas indicações para gerenciamento financeiro são:"  
															+ "\n\nR$ " + Math.round(despesa) + ", para destinar as despesas fixas;" + "\nR$ " 
															+ Math.round(lazer) + ", para lazer; \nR$ " + Math.round(investimento) + " para investir.", "Java Invest", JOptionPane.INFORMATION_MESSAGE);
						}
					}
					else if(despesaRenda >= 60 && despesaRenda <= 65) {
						JOptionPane.showMessageDialog(null,"Porcentagem da despesa: " + Math.round(despesaRenda) + "%", "Java Invest", JOptionPane.INFORMATION_MESSAGE);
						resto = despesaRenda - 60;	
						if(resto >= 0) {
							despesa = (despesaRenda/100) * rendaTotal;
							lazer = calc.calcularValorRestante(rendaTotal, (20 - resto));
							investimento = calc.calcularValorRestante(rendaTotal, 20);
							JOptionPane.showMessageDialog(null, user.getNome() + ", com base nos seus ganhos, despesas e perfil de investimento intermediário, \nas indicações para gerenciamento financeiro são:" 
															+ "\n\nR$ " + Math.round(despesa) + ", para destinar as despesas fixas;" + "\nR$ " 
															+ Math.round(lazer) + ", para lazer; \nR$ " + Math.round(investimento) + " para investir.", "Java Invest", JOptionPane.INFORMATION_MESSAGE);
						}
						else {
							despesa = (despesaRenda/100) * rendaTotal;
							lazer = calc.calcularValorRestante(rendaTotal, 20);
							investimento = calc.calcularValorRestante(rendaTotal, (20 - resto));
							JOptionPane.showMessageDialog(null, user.getNome() + ", com base nos seus ganhos, despesas e perfil de investimento intermediário, \nas indicações para gerenciamento financeiro são:"  
															+ "\n\nR$ " + Math.round(despesa) + ", para destinar as despesas fixas;" + "\nR$ " 
															+ Math.round(lazer) + ", para lazer; \nR$ " + Math.round(investimento) + " para investir.", "Java Invest", JOptionPane.INFORMATION_MESSAGE);
						}
					}
					else {
						JOptionPane.showMessageDialog(null, "Oops! " + user.getNome() + ", parece que você ainda não tem perfil para investir!", "Java Invest", JOptionPane.INFORMATION_MESSAGE);
					}
				break;
				case 3:
					if(despesaRenda >= 0 && despesaRenda < 50 ) {
						JOptionPane.showMessageDialog(null,"Porcentagem da despesa: " + Math.round(despesaRenda) + "%", "Java Invest", JOptionPane.INFORMATION_MESSAGE);
						resto = despesaRenda - 40;	
						if(resto >= 0) {
							despesa = (despesaRenda/100) * rendaTotal;
							lazer = calc.calcularValorRestante(rendaTotal, (35 - resto));
							investimento = calc.calcularValorRestante(rendaTotal, 25);
							JOptionPane.showMessageDialog(null, user.getNome() + ", com base nos seus ganhos, despesas e perfil de investimento alto, \nas indicações para gerenciamento financeiro são:" 
															+ "\n\nR$ " + Math.round(despesa) + ", para destinar as despesas fixas;" + "\nR$ " 
															+ Math.round(lazer) + ", para lazer; \nR$ " + Math.round(investimento) + " para investir.", "Java Invest", JOptionPane.INFORMATION_MESSAGE);
						}
						else {
							despesa = (despesaRenda/100) * rendaTotal;
							lazer = calc.calcularValorRestante(rendaTotal, 35);
							investimento = calc.calcularValorRestante(rendaTotal, (25 - resto));
							JOptionPane.showMessageDialog(null, user.getNome() + ", com base nos seus ganhos, despesas e perfil de investimento alto, \nas indicações para gerenciamento financeiro são:"  
															+ "\n\nR$ " + Math.round(despesa) + ", para destinar as despesas fixas;" + "\nR$ " 
															+ Math.round(lazer) + ", para lazer; \nR$ " + Math.round(investimento) + " para investir.", "Java Invest", JOptionPane.INFORMATION_MESSAGE);
						}
					}
					else if(despesaRenda >= 50 && despesaRenda < 60) {
						JOptionPane.showMessageDialog(null,"Porcentagem da despesa: " + Math.round(despesaRenda) + "%", "Java Invest", JOptionPane.INFORMATION_MESSAGE);
						resto = despesaRenda - 50;	
						if(resto >= 0) {
							despesa = (despesaRenda/100) * rendaTotal;
							lazer = calc.calcularValorRestante(rendaTotal, (20 - resto));
							investimento = calc.calcularValorRestante(rendaTotal, 30);
							JOptionPane.showMessageDialog(null, user.getNome() + ", com base nos seus ganhos, despesas e perfil de investimento alto, \nas indicações para gerenciamento financeiro são:" 
															+ "\n\nR$ " + Math.round(despesa) + ", para destinar as despesas fixas;" + "\nR$ " 
															+ Math.round(lazer) + ", para lazer; \nR$ " + Math.round(investimento) + " para investir.", "Java Invest", JOptionPane.INFORMATION_MESSAGE);
						}
						else {
							despesa = (despesaRenda/100) * rendaTotal;
							lazer = calc.calcularValorRestante(rendaTotal, 20);
							investimento = calc.calcularValorRestante(rendaTotal, (30 - resto));
							JOptionPane.showMessageDialog(null, user.getNome() + ", com base nos seus ganhos, despesas e perfil de investimento alto, \nas indicações para gerenciamento financeiro são:"  
															+ "\n\nR$ " + Math.round(despesa) + ", para destinar as despesas fixas;" + "\nR$ " 
															+ Math.round(lazer) + ", para lazer; \nR$ " + Math.round(investimento) + " para investir.", "Java Invest", JOptionPane.INFORMATION_MESSAGE);
						}
					}
					else if(despesaRenda >= 60 && despesaRenda <= 65) {
						JOptionPane.showMessageDialog(null,"Porcentagem da despesa: " + Math.round(despesaRenda) + "%", "Java Invest", JOptionPane.INFORMATION_MESSAGE);
						resto = despesaRenda - 60;	
						if(resto >= 0) {
							despesa = (despesaRenda/100) * rendaTotal;
							lazer = calc.calcularValorRestante(rendaTotal, (10 - resto));
							investimento = calc.calcularValorRestante(rendaTotal, 30);
							JOptionPane.showMessageDialog(null, user.getNome() + ", com base nos seus ganhos, despesas e perfil de investimento alto, \nas indicações para gerenciamento financeiro são:" 
															+ "\n\nR$ " + Math.round(despesa) + ", para destinar as despesas fixas;" + "\nR$ " 
															+ Math.round(lazer) + ", para lazer; \nR$ " + Math.round(investimento) + " para investir.", "Java Invest", JOptionPane.INFORMATION_MESSAGE);
						}
						else {
							despesa = (despesaRenda/100) * rendaTotal;
							lazer = calc.calcularValorRestante(rendaTotal, 10);
							investimento = calc.calcularValorRestante(rendaTotal, (30 - resto));
							JOptionPane.showMessageDialog(null, user.getNome() + ", com base nos seus ganhos, despesas e perfil de investimento alto, \nas indicações para gerenciamento financeiro são:"  
															+ "\n\nR$ " + Math.round(despesa) + ", para destinar as despesas fixas;" + "\nR$ " 
															+ Math.round(lazer) + ", para lazer; \nR$ " + Math.round(investimento) + " para investir.", "Java Invest", JOptionPane.INFORMATION_MESSAGE);
						}
					}
					else {
						JOptionPane.showMessageDialog(null, "Oops! " + user.getNome() + ", parece que você ainda não tem perfil para investir!", "Java Invest", JOptionPane.INFORMATION_MESSAGE);
					}
				break;
				case 4: 
					
					JOptionPane.showMessageDialog(null, "\n1- O perfil de baixo investimento se adequa a pessoas"
							+ "que estao dispostas a destinar\n uma pequena parcela dos seus ganhos para investimento." +
							"\n\n2- O perfil de moderado investimento se adequa a pessoas que buscam um equilibrio\n entre os investimentos e os gastos com lazer." + 
							"\n\n3- O perfil de alto investimento se adequa a pessoas que estao dispostas a destinar\n grande parte dos seus ganhos" + 
							" para investimentos.", "Java Invest", JOptionPane.INFORMATION_MESSAGE);
				break;	
				default:
					JOptionPane.showMessageDialog(null,"Valor inválido.", "Java Invest", JOptionPane.INFORMATION_MESSAGE);
				break;
			}
			
		}while(opcao == 4);
		
	}

}
