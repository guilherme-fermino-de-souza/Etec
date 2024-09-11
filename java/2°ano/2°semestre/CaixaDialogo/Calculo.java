package caixaDialogo;

import javax.swing.JOptionPane;

/*
1. Valor fixo somado a porcentagem da comissão sobre o valor 
total vendido, o total vendido é calculado pelo valor unitário de cada 
unidade vendida.
Utilizando caixas de diálogo, crie um programa que calcule o valor total
do salário.
*/


public class Calculo {
	  
	public void CalculoSalario() {
		
		
		double sFixo = Double.parseDouble(JOptionPane.showInputDialog(null, 
				"Qual o valor de seu Salário:", "Salário",
				JOptionPane.QUESTION_MESSAGE));
		
		double vUnitario = Double.parseDouble(JOptionPane.showInputDialog(null,
				"Qual o valor unitário de cada Peça:", "Valor Unitário",
				JOptionPane.QUESTION_MESSAGE));
		
		int qtdVendida = Integer.parseInt(JOptionPane.showInputDialog(null, 
				"Quantas peças você vendeu: ", "Cálculo comissão", 
				JOptionPane.QUESTION_MESSAGE));
		
		double pComissao = Double.parseDouble(JOptionPane.showInputDialog(null,
				"Qual a porcentagem da sua Comissão:", "Comissão",
				JOptionPane.QUESTION_MESSAGE));
		
		
		double aReceber = sFixo + ((vUnitario*qtdVendida)*pComissao/100);
		JOptionPane.showMessageDialog(null, "O valor da comissão será de R$"+aReceber);
	}
}
