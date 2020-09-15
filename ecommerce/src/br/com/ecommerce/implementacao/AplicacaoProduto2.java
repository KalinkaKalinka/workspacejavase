package br.com.ecommerce.implementacao;

import br.com.ecommerce.beans.CD;
import br.com.ecommerce.beans.Livro;
import br.com.ecommerce.beans.Produto;
import br.com.ecommerce.tela.Magica;

public class AplicacaoProduto2 {

	public static void main(String[] args) {
		
		Produto produto = new Produto();
		

char opcao = Magica.s("Para inserir novo produto \n Digite <L>livro  ou <C> CD").charAt(0);

if (opcao =='L') {
	produto = new Livro (
			Magica.i("ID"),
			Magica.s("Descri��o"),
			Magica.f("Valor de Compra"),
			Magica.f("Valor de venda"),
			Magica.i("Qtde"),
			Magica.s("Tipo"),
			Magica.s("ISBN"),
			Magica.s("Autor(a)"),
			Magica.s("Editora")
			);
	} else if (opcao == 'C') {
		produto = new CD(
				Magica.i("ID"),
				Magica.s("Descri��o"),
				Magica.f("Valor de Compra"),
				Magica.f("Valor de venda"),
				Magica.i("Qtde"),
				Magica.s("Tipo "),
				Magica.s("Artista"),
				Magica.s("Gravadora"),
				Magica.s("Dura��o")				
				);
		
	}else {System.out.println("Op��o invalida!");}

	System.out.println(produto.getAll());

	}

}
