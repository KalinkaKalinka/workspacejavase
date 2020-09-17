package br.com.tratamento.principal;

public class TesteExcecoes {

	public static void main(String[] args) {
		// try - trata de exce��es - o codigo do main fica dentro do try

		try {
			int num = Integer.parseInt("1");
			System.out.println(num);
			
			
			String palavra = ""; //isso causa um erro
			System.out.println(palavra.length());
			
			
			int nums[] = new int [2];
			nums [0] = 521;
			nums [1] = 350;
			nums [2] = 150;
			
		} catch(NumberFormatException e)//aqui eu capturo as possiveis exce�oes catch e= nome que escolhi (Exception e){}
		{
			System.out.println("numero invalido"); 
			//e.printStackTrace(); 
			//essa linh traz o erro vc remove depois de terminar
					/*a��o relacionada a qq exce��o, logo 
			 * so vou usar isso depois que terminar meu codigo */
			 
		} catch(NullPointerException e) {
			System.out.println("objeto nulo");
		
			
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("vetor com itens a mais");
		}
		
		catch (Exception e) {
			System.out.println("Erro desconhecido");
			e.printStackTrace();
		}
	}

}
