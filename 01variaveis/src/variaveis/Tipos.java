package variaveis;

import java.util.Scanner;

public class Tipos {

	public static void main(String[] args) {
		// marcar o public static void main na hora de criar a classe
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite seu nome: ");
		String nome = teclado.nextLine();
		System.out.print("Digite sua idade: ");
		int idade=teclado.nextInt();
		System.out.print("Digite sua altura: ");
		double altura=teclado.nextDouble();
		System.out.print("Digite seu peso: ");
		double peso=teclado.nextDouble();
		
		
		/*String sobrenome; < sempre que criar variavel atribuir valor para ela
		 * se vazia = String sobrenome= ""*/
			
		System.out.println("Nome...: " + nome);
		System.out.println("Idade...: "+idade+"anos");
		System.out.println("Altura...: "+altura);
		System.out.println("Peso...: "+peso);
		
		double imc = peso/(altura*altura);
		System.out.println("IMC...: "+imc);
	}

}
