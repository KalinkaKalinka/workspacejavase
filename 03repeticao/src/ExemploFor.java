import javax.swing.JOptionPane;

public class ExemploFor {

	public static void main(String[] args) {
		/* do e while sao bem parecidos
		 * for ja � mais diferente
		 * For � proprio quando nao existe intera��o com o usuario
		 * 1 variavel vai controlar o la�o
		 * 2 condi��o
		 * 3 evolu��o da contagem 
		 * sintaxe for (tipo da variavel variavel; ate quando funciona;como fara a contagem*/
		
		int tabuada = Integer.parseInt(JOptionPane.showInputDialog("Digite numero de tabuada"));
		
		for (int cont = 0;cont<11;cont+=1) {
			System.out.println(tabuada + " x "+cont + " = "+ (tabuada *cont));
		}

	}

}
