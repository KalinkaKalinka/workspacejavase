import javax.swing.JOptionPane;

public class OrdemDecrescente {

	public static void main(String[] args) {
		// 4. Escreva um código que leia três valores inteiros e diferentes e mostre-os em ordem decrescente. 
		
int num1 = Integer.parseInt(JOptionPane.showInputDialog("Insira primeiro numero"));
int num2 = Integer.parseInt(JOptionPane.showInputDialog("Insira segundo numero"));
int num3 = Integer.parseInt(JOptionPane.showInputDialog("Insira terceiro numero"));

if	((num1 > num2) || (num1 == num2))
{
	if ( (num2 > num3) ||(num2 == num3))
	{
		System.out.println(num3 + " " + num2 + " " + num1);
	} 
	else { System.out.println(num2 + " " + num3 + " " + num1);}
	
		
} else if ((num2 < num3)||(num2 == num3) )
		{  System.out.println(num1 + " " + num2 + " " + num3);
		
	
}else { System.out.println(num3 + " " + num1 + " " + num2);

}

	
	}//fecha main

}//fecha classe
