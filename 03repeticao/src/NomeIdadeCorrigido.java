import javax.swing.JOptionPane;

public class NomeIdadeCorrigido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome="";
		int idade = 0;
		int contmaioresdeidade = 0;
		int qdtepessoas = 0;
		int totalidades =0;
		
		
		do {
			nome = JOptionPane.showInputDialog("Digite nome");
			idade = Integer.parseInt(JOptionPane.showInputDialog("Digite idade"));
			
			if (idade > 17) {
				contmaioresdeidade++;
			}
			
			
			qdtepessoas++;
			totalidades += idade; //totalidades = totalidades + idade
						
			
		} while (JOptionPane.showInputDialog("Digite S para continuar").toUpperCase().charAt(0)=='S');
		
		System.out.println("Quantidade de pessoas " + qdtepessoas);
		System.out.println("Qtde de pessoas maior de idade " + contmaioresdeidade);
		System.out.println("Média de idades: " + (totalidades/qdtepessoas));
	}

}
