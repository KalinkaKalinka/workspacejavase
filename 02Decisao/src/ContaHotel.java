import javax.swing.JOptionPane;

public class ContaHotel {

	public static void main(String[] args) {
		/*1. Um hotel cobra R$ 80,00 a diária e mais uma taxa de serviços. 
		 * A taxa de serviços é de: 
		 * R$ 5,50 por diária, se o número de diárias for maior que 15;
		 * R$ 6,00 por diária, se o número de diárias for igual a 15; 
		 * R$ 8,00 por diária, se o número de diárias for menor que 15.
		 * Monte uma aplicação que apresente a conta do cliente.
		 */

		String cliente = JOptionPane.showInputDialog("Nome do cliente");
		int diarias = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de diárias"));
		double custodiaria = 80.00;
		double custotaxa = 8;
		
		
		if (diarias==15) {
			custotaxa = 6;
			
		} else if (diarias > 15) {
			custotaxa = 5.50;
		}
		
		//o que será exibido na conta
		System.out.println("Cliente "+cliente);
		System.out.println("Estadia de "+diarias+" dias");
		System.out.println("Valor da diária R$ " + custodiaria + " / Total em diárias R$ " + (custodiaria * diarias));
		System.out.println("Taxa de serviços por dia R$ " + custotaxa + " / Total em taxa de serviço R$ " + custotaxa*diarias);
		System.out.println("Custo total em R$ " + (custodiaria + custotaxa) * diarias);

	}

}
