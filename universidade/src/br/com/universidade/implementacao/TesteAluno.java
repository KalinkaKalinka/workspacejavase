package br.com.universidade.implementacao;

import javax.swing.JOptionPane;

import br.com.universidade.modelo.Aluno;

public class TesteAluno {

	public static void main(String[] args) {
		/**/
		
		//criando o objeto
		//fazer a separação na memoria sem colocar o conteudo  - 
		//Aluno objeto;
		
		//Instanciando o objeto
		Aluno objeto = new Aluno();
		
		objeto.preencherNome(JOptionPane.showInputDialog("Digite nome do aluno"));
	
		objeto.preencherRm(Integer.parseInt(JOptionPane.showInputDialog("Digite RM:")));
		
		objeto.preencherEmail(JOptionPane.showInputDialog("Digite email:" ));
		
		System.out.println("RM: " + objeto.retornarRm());
		System.out.println("Nome do aluno: " + objeto.retornarNome());
		System.out.println("Email " + objeto.retornarEmail());
		
	
	}

}
