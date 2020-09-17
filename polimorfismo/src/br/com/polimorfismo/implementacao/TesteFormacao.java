package br.com.polimorfismo.implementacao;

import br.com.polimorfismo.beans.Bacharelado;
import br.com.polimorfismo.beans.Formacao;
import br.com.polimorfismo.beans.Medio;
import br.com.polimorfismo.beans.Tecnologo;
import br.com.polimorfismo.tela.Magica;

public class TesteFormacao {

	public static void main(String[] args) {

		Formacao formacao = null;// cria o objeto, quando eu coloco = new ai sim ele foi instanciado
		
		
		char resp = Magica.s("Escolha Tecnologo <1> \n "
				+ "Medio <2> ou \n "
				+ "Bacharelado <3> ").charAt(0);
		
		//Preencher primeiro o que é comum a super classe
		String descricao =  Magica.s("Insira descricao do curso");
		int periodo = Magica.i("digite 1 noite digite 2 manha");

		
		 if (resp =='1') {
			 
			 formacao = new Tecnologo(descricao,periodo,0,0,Magica.b("É Estendido?"));
					
							
		 } else if (resp =='2') {
			 formacao = new Medio(
					 descricao,periodo,0,0,Magica.s("Tipo")
					 );
			 
		 } else if (resp =='3') {
			 formacao = new Bacharelado(
					 descricao,periodo,0,0,
					 Magica.s("Projeto de conclusão"),
					Magica.i("Carga horaria estagio")
					 );
			 
			 
		 } else {
			 System.out.println("Opção inválida");}
		
		 formacao.DefinirDuracao();
		 formacao.calcularMensalidade(Magica.d("Insira o Fator"));
		 System.out.println(formacao.getAll());
		


		
	}

}
