package variaveis;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		
		// pe�am nome do aluno, duas notas, e calcule a m�dia aritmetica
		//Exibir nome e m�dia
		
		Scanner teclado = new Scanner(System.in); 
		//Scanner para habilitar coleta de dados do teclado
		
		
		System.out.print("Digite nome do aluno: ");
		String nomealuno= teclado.nextLine();
		
		System.out.print("Digite nota 1: ");
		Double nota1= teclado.nextDouble();
		
		System.out.print("Digite nota 2: ");
		Double nota2= teclado.nextDouble();
		
		//calculo da media
		Double media= (nota1+nota2)/2;
		
		System.out.println("Aluno: " + nomealuno);
		System.out.println("M�dia: "+media);
		//%f numeros reais - %.1 (arredonda) / %.2 (duas casas decimais)
		//%d numeros inteiros
		//%s strings
		
		System.out.printf("Aluno %s a sua m�dia � %.2f \n",nomealuno,media);
	}

}
