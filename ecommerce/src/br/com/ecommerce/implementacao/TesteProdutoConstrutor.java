package br.com.ecommerce.implementacao;

import javax.swing.JOptionPane;

import br.com.ecommerce.beans.Produto;
import br.com.ecommerce.beans.Venda;

public class TesteProdutoConstrutor {

	public static void main(String[] args) {
		/*inputs pelo construtor
		 * ctrl + espaço para mostrar atributos do construtor
		 * precisa estar na mesma ordem do construtor
		 * Se inverter a order da RUIM
		 * 
		 * aqui eu posso preencher direto pelo construtor
		 * nao preciso usar o setAll
		 * 
		 */
		Produto produto = new Produto(
				Integer.parseInt(JOptionPane.showInputDialog("ID")),
				JOptionPane.showInputDialog("Descrição").toUpperCase(),
				Float.parseFloat(JOptionPane.showInputDialog("Valor compra ")),
				Float.parseFloat(JOptionPane.showInputDialog("Valor venda ")),
				Integer.parseInt(JOptionPane.showInputDialog("Qtde")),
				JOptionPane.showInputDialog("Tipo").toUpperCase()			
				);
		
		/* poderia pre definir assim
		 * 
		 * 
		 * 
		 */
		
		/*Produto produto2 = new Produto(
				
				);*/
	
	
	

	}

}
