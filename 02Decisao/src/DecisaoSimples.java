import java.util.Scanner;

import javax.swing.JOptionPane;

public class DecisaoSimples {

	public static void main(String[] args) {
		// Aula 2 decisao simples
		//== comparação entre numeros
		//JOptionPane traz uma caixa de entrada
		//Ctrl + shift + O para importar a classe JOptionPane
		//showinput - abre caixa que permite digitação
				
		//Usando o JOptionPane: abrirá caixa de dialogo
		String nome=JOptionPane.showInputDialog("Digite o nome do Aluno"); 
		
		//aqui utilizamos um Class Wraper Double para realizar um parse de String para double
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite nota 1: "));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite nota 2: "));
		
		double media = (nota1+nota2) /2;
		
		if (media >= 6) {
			System.out.println("Parabéns você está aprovad@!");
		}
		if	(media < 3) {
			System.out.println("Infelizmente você foi reprovad@ =/");
		}
		if (media >= 3 && media < 6 ) {
			System.out.println("Tente o exame!");
		}
		System.out.println("Sua média foi: " + media);
		//Usar o E = &&
		//Usar o OU = ||

		/*
		 * Mesma construção usando Scanner
		 * 
		 * Scanner tec = new Scanner(System.in);
		 * System.out.println("Digite o nome do aluno:");
		 * String nome2=tec.next()+tec.nextLine();
		 * System.out.println("Digite a primeira nota: ");
		 * double nota1 = tec.nextDouble();
		*/
		//o Scanner busca metodos que retornam double,String, int
		//o JOption.showInputDialog só retorna String
		//Mas por sorte eu consigo representar um numero como String, posso realizar o parse usando as Class wraper de auxilio aos tipos primitivos
		
}
}