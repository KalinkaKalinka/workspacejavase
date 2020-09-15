import java.util.Scanner;

import javax.swing.JOptionPane;

public class DecisaoEncadeada {

	public static void main(String[] args) {
		
		
		String nome=JOptionPane.showInputDialog("Digite o nome do Aluno"); 
		
		//aqui utilizamos um Class Wraper Double para realizar um parse de String para double
		short faltas = Short.parseShort(JOptionPane.showInputDialog("Insira quantidade de faltas"));
		
	
		
		if	(faltas>=20)
		{
			System.out.println(nome+", voce foi reprovado por faltas");
		
		}
		else
		{
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite nota 1: "));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite nota 2: "));
		double media = (nota1+nota2) /2;	
			
		if (media >= 6)
		{
			System.out.println("Parabéns você está aprovad@!");
		}
		else if	(media < 3) 
		{
			System.out.println("Infelizmente você foi reprovad@ =/");
		}
		else
		{

			System.out.println("Tente o exame!");
		} 
	
		
		System.out.println("Sua média foi: " + media);
		
		
		
}}
}