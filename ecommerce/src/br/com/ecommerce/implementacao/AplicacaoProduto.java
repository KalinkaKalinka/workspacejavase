package br.com.ecommerce.implementacao;

import br.com.ecommerce.beans.CD;
import br.com.ecommerce.beans.Livro;
import br.com.ecommerce.tela.Magica;

public class AplicacaoProduto {

	public static void main(String[] args) {

char opcao = Magica.s("Digite <L> ou <C>").charAt(0);

if (opcao =='L') {
	Livro livro = new Livro (
			Magica.i("ID"),
			Magica.s("Descrição"),
			Magica.f("Valor de Compra"),
			Magica.f("Valor de venda"),
			Magica.i("Qtde"),
			Magica.s("Tipo"),
			Magica.s("ISBN"),
			Magica.s("Autor(a)"),
			Magica.s("Editora")
			);
	System.out.println(livro.getAll());
	} else if (opcao == 'C') {
		CD cd = new CD(
				Magica.i("ID"),
				Magica.s("Descrição"),
				Magica.f("Valor de Compra"),
				Magica.f("Valor de venda"),
				Magica.i("Qtde"),
				Magica.s("Tipo "),
				Magica.s("Artista"),
				Magica.s("Gravadora"),
				Magica.s("Duração")				
				);
		System.out.println(cd.getAll());
		
	}else {System.out.println("Opção invalida!");}


	}

}
