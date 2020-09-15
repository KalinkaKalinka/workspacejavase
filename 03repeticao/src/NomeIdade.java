import javax.swing.JOptionPane;

public class NomeIdade {

	public static void main(String[] args) {
		/*MOnte um programa que solicite a idade e o nome das pessoas
		 * Ao terminar o programa devera exibir a pessoa mais velha e a pessoa mais nova 
		 * e a quantidade de pessoas maiores de idade
		 * e a media de idades que foram digitadas 
		 * exige entrada do usuario  = usar do while*/ 

		String nome = "";
		int idade = 0;
		int contmaior = 0;
		int contpessoas = 0;
		String pessoavelha = "";
		String pessoanova = "";
		double mediaidades = 0;
		short finaliza = 1;
		int idademaior = 0;
		int idademenor = 0;
		int somaidade = 0;
		
		
		nome = JOptionPane.showInputDialog("Digite nome ");
		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite idade"));
		finaliza = Short.parseShort(JOptionPane.showInputDialog("Digite 0 para finalizar ou 1 para prosseguir:"));	
		if (idade > 17) 
		{			contmaior += 1;				}
		
		contpessoas++ ;
		pessoavelha = nome;
		pessoanova = nome;
		idademaior = idade;
		idademenor = idade;
		somaidade = idade;
		mediaidades = (somaidade/contpessoas);
		
do {
	
	nome = JOptionPane.showInputDialog("Digite nome ");
	idade = Integer.parseInt(JOptionPane.showInputDialog("Digite idade"));
	if (idade > idademaior)
	{
		idademaior = idade;
		pessoavelha = nome;
		
		} else if (idade < idademenor) {
			idademenor = idade;
			pessoanova = nome;
		}
	somaidade = somaidade + idade;
	mediaidades = (somaidade/contpessoas);
	
	contpessoas++;
	
	//contador de maior de idade
	if (idade >= 18) {
		contmaior++;
				}

	finaliza = Short.parseShort(JOptionPane.showInputDialog("Digite 0 para finalizar ou 1 para prosseguir:"));	
}while (finaliza != 0);


	
	
System.out.println("Qtde de pessoas maior de idade: " + contmaior);
System.out.println("Quntidade de pessoas cadastradas: "+contpessoas);
System.out.println("Pessoa mais velha " + pessoavelha + " com " + idademaior + " anos");
System.out.println("Pessoa mais nova " + pessoanova + " com " + idademenor + "anos");
System.out.println("Media de idades " + mediaidades);

	}

}
