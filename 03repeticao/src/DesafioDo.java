import javax.swing.JOptionPane;

public class DesafioDo {

	public static void main(String[] args) {
		/* Game adivinhação 
		 * Jogador 1 vai digitar um numero inteiro
		 * jogador 2 tem que descobrir, enquanto ele nao descobrir
		 * pede novamente um numero e da uma dica
		 * se ele esta arriscando um numero
		 * maior ou menr que o numero que ele tem que advinhar
		 * Plus: exibir no final quantas tentativas ele usou*/
int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero"));
int chute = 0;
int contador = 0;


do {
	chute = Integer.parseInt(JOptionPane.showInputDialog("Tente acertar"));
	contador += 1; //contador++ / contador = contador +1
	if (chute > numero) {
		JOptionPane.showMessageDialog(null, "Voce chutou alto!");
	} else if (chute < numero){
		JOptionPane.showMessageDialog(null, "Voce chutou baixo!");
	}
	
}while (numero!=chute);
	
System.out.println("Parabéns! Você acertou utilizando " +contador +" tentativas");
	}

}
