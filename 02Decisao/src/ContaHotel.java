import javax.swing.JOptionPane;

public class ContaHotel {

	public static void main(String[] args) {
		/*1. Um hotel cobra R$ 80,00 a di�ria e mais uma taxa de servi�os. 
		 * A taxa de servi�os � de: 
		 * R$ 5,50 por di�ria, se o n�mero de di�rias for maior que 15;
		 * R$ 6,00 por di�ria, se o n�mero de di�rias for igual a 15; 
		 * R$ 8,00 por di�ria, se o n�mero de di�rias for menor que 15.
		 * Monte uma aplica��o que apresente a conta do cliente.
		 */

		String cliente = JOptionPane.showInputDialog("Nome do cliente");
		int diarias = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de di�rias"));
		double custodiaria = 80.00;
		double custotaxa = 8;
		
		
		if (diarias==15) {
			custotaxa = 6;
			
		} else if (diarias > 15) {
			custotaxa = 5.50;
		}
		
		//o que ser� exibido na conta
		System.out.println("Cliente "+cliente);
		System.out.println("Estadia de "+diarias+" dias");
		System.out.println("Valor da di�ria R$ " + custodiaria + " / Total em di�rias R$ " + (custodiaria * diarias));
		System.out.println("Taxa de servi�os por dia R$ " + custotaxa + " / Total em taxa de servi�o R$ " + custotaxa*diarias);
		System.out.println("Custo total em R$ " + (custodiaria + custotaxa) * diarias);

	}

}
