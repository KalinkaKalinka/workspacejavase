package br.com.universidade.implementacao;

import javax.swing.JOptionPane;

import br.com.universidade.modelo.Professor;

public class TesteProfessor {

	public static void main(String[] args) {
		
		Professor objeto = new Professor();
		
		objeto.preencherNome(JOptionPane.showInputDialog("Digite nome do professor"));
		
		objeto.preencherId(Integer.parseInt(JOptionPane.showInputDialog("Digite ID:")));
		
		objeto.preencherValorHora(Float.parseFloat(JOptionPane.showInputDialog("Digite valor hora/aula:" )));
		
		objeto.preencherArea(JOptionPane.showInputDialog("Digite nome da area "));
		
		System.out.println("ID: " + objeto.retornarId());
		System.out.println("Nome do Professor: " + objeto.retornarNome());
		System.out.println("Valor hora/aula " + objeto.retornarVHora());
		System.out.println("Area de ensino: " + objeto.retornarArea());
		
		System.out.println(objeto.getAll());
		
		Professor objeto2 = new Professor();
		
		objeto2.setAll(
				Integer.parseInt(JOptionPane.showInputDialog("id")), 
				JOptionPane.showInputDialog("nome"), 
				Float.parseFloat(JOptionPane.showInputDialog("valor hora")),
				JOptionPane.showInputDialog("area")
				);
		
		System.out.println(objeto2.getAll());
		
		
		
	}

}
