package br.com.ecommerce.implementacao;

import br.com.ecommerce.beans.Produto;
import br.com.ecommerce.beans.Venda;
import br.com.ecommerce.tela.Magica;

public class AplicacaoVenda {
	//static chamar metodo sem instanciar objeto
	//para ser estatico nao pode ser associado a nenhum atributo
	


	public static void main(String[] args) {

		Venda venda = new Venda();
		Produto produto = new Produto(); //instanciei produto pq nao existe venda sem produto
		
		
		venda.setNumero(Magica.i("Numero "));
		venda.setOperacao(Magica.s("Operação"));
		venda.setTotal(Magica.f("Valor Total "));
		
		venda.setProduto(produto); //dentro do objeto produto temos varios atributos
		produto.setDescricao(Magica.s("Descrição do produto"));
		produto.setId(Magica.i("Id do protudo"));
		produto.setQtde(Magica.i("Qtde de produto"));
		produto.setTipo(Magica.s("Tipo"));
		produto.setValorCompra(Magica.f("Valor de compra"));
		produto.setValorVenda(Magica.f("Valor de venda"));
		
		System.out.println(venda.getAll());

		

	}

}
