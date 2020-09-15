package br.com.ecommerce.implementacao;

import javax.swing.JOptionPane;

import br.com.ecommerce.beans.Produto;


public class TesteProduto {

	public static void main(String[] args) {
		/*Instanciar um objeto em Produto 
		 *(instanciar = criar o objeto para que el possa ser utilizado)*/
		
		Produto objeto = new Produto();
		
		objeto.setAll(
				Integer.parseInt(JOptionPane.showInputDialog("Digite ID")), 
				JOptionPane.showInputDialog("Insira Descrição").toUpperCase(), 
				Float.parseFloat(JOptionPane.showInputDialog("Insira valor de compra")),
				Float.parseFloat(JOptionPane.showInputDialog("Insira valor de venda")),
				Integer.parseInt(JOptionPane.showInputDialog("Digite Qtde")),
				JOptionPane.showInputDialog("Tipo de produto").toUpperCase());
		
		System.out.println(objeto.getAll());
		System.out.println("Total de compra: "+ objeto.getTotalCompra());
		System.out.println("Total de venda: "+ objeto.getTotalVenda());
		System.out.println("Com desconto de 10% na venda" + objeto.getPromocao());
		System.out.println(objeto.getEstoque());
		
		objeto.setEntrarEstoque(Integer.parseInt(JOptionPane.showInputDialog("Insira adicional ao estoque")));
		System.out.println("novo estoque " + objeto.getQtde());
		
		objeto.setSaidaEstoque(Integer.parseInt(JOptionPane.showInputDialog("Remover do estoque" + objeto.getQtde())));
		System.out.println("tirado do estoque" + objeto.getQtde());
		
		
	}

}
