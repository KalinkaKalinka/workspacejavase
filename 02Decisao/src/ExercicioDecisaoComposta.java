import javax.swing.JOptionPane;

public class ExercicioDecisaoComposta {

	public static void main(String[] args) {
		/* Solicitar nome e idade de uma pessoa
		 * e ir�o exibir:
		 * voce � obrigado a votar - idade maior ou igual a 18 e menor ou igual a 70
		 * seu voto � facultativo se a pessoa tiver, 16, 17 ou  maior que 70 anos
		 * voc� nao pode votar se a pessoas tiver menos que 16 anos
		 */
		
		String nome=JOptionPane.showInputDialog("Digite seu nome"); 
		
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade? "));
		//poderia ter usado o short no lugar de int
		
		if (idade >= 18 && idade <= 70)
		{
			System.out.println(nome+ ", voc� � obrigad@ a votar!");
		}
		else if ((idade <= 17 && idade >= 16) || idade > 70)
		{
			System.out.println(nome+ ", seu voto � facultativo");
		}
		else if (idade < 16)
		{
			System.out.println(nome+ ", voc� n�o pode votar ainda");
		}

	}

}
