import javax.swing.JOptionPane;

public class VendaProduto {

	public static void main(String[] args) {
		//Venda produto
		
		String produto = JOptionPane.showInputDialog("Digite o nome do produto");
		double valorbruto = Double.parseDouble(JOptionPane.showInputDialog("Digite valor do produto"));
		double qtdeproduto = Double.parseDouble(JOptionPane.showInputDialog("Insira qtde do produto"));
		String formapagto = JOptionPane.showInputDialog("Forma de pagto - VISTA ou CARTAO");
		double valortotal = (valorbruto * qtdeproduto);
		
		if (formapagto.equalsIgnoreCase("VISTA"))
		{
			if (qtdeproduto > 10)
			{ valortotal *= 0.9; }
			else 
			{ valortotal *= 0.95; }

		}
		
		System.out.println("Produto escolhido: " + produto);
		System.out.println("Valor total: " + valortotal);
		
} //fecha main
		
} // fecha classe
