package br.com.universidadereferencia.principal;

import br.com.universidadereferencia.beans.Aluno;
import br.com.universidadereferencia.beans.Curso;
import br.com.universidadereferencia.beans.Endereco;
import br.com.universidadereferencia.beans.Turma;
import br.com.universidadereferencia.tela.Magica;

public class TesteTurma {

	public static void main(String[] args) {

		/*
		 * Produto produto = new Produto(
				Integer.parseInt(JOptionPane.showInputDialog("ID")),
				JOptionPane.showInputDialog("Descrição").toUpperCase(),
				Float.parseFloat(JOptionPane.showInputDialog("Valor compra ")),
				Float.parseFloat(JOptionPane.showInputDialog("Valor venda ")),
				Integer.parseInt(JOptionPane.showInputDialog("Qtde")),
				JOptionPane.showInputDialog("Tipo").toUpperCase()			
				);
				
				
		 */
		/*
		 * 	this.rm = rm;
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
		 */
		
	/*	Endereco endereco = new Endereco(
				Magica.s("Nome da rua"),
				Magica.s("CEP"),
				Magica.s("Numero"),
				Magica.s("Complemento")
				);
				*/
		Aluno aluno = new Aluno(
				Magica.i("Insira RM"),
				Magica.s("Insira nome do aluno"),
				Magica.s("Email do aluno"),
				new Endereco(
						Magica.s("Nome da rua"),
						Magica.s("CEP"),
						Magica.s("Numero"),
						Magica.s("Complemento")
						));
		
		Curso curso = new Curso(
				Magica.s("Nome do curso"),
				Magica.f("Valor "),
				Magica.i("Carga horaria")
				);
				
		Turma turma = new Turma(
				Magica.s("Sigla da turma"),
				Magica.s("Periodo"),
				curso,
				aluno
				);
		
		System.out.println(turma.getAll());
		
		
	}

}
