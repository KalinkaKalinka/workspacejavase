package variaveis;

import java.util.Scanner;

public class ManipulaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tec = new Scanner(System.in);
		System.out.print("Digite o email: ");
		String email= tec.next();
		//next metodo que retorna o que foi digitado no formato string
		//nextInt = captura e retorna numero inteiro
		
		System.out.println("Original: "+email);

		System.out.println("Minuscula: " + email.toLowerCase());
		System.out.println("Maiuscula: " + email.toUpperCase());
		
		System.out.println("Qtde de caracteres: " + email.length());
		//contar caracteres de uma string
		System.out.println("POsição do @: "+email.indexOf("@"));
		//pode ser mais de um caracter ex. itau-unibanco
		//ele conta a partir de zero , 
		//se o resultado for -1 = nao encontrado
		System.out.println("Do 2º até o 4º caracter: "+email.substring(1, 4));
		//coordenada inicial e para uma posiçao antes da final demarcada
		//nunca a segunda coordenada sera menor que a primeira
		System.out.println("A partir do terceiro"+email.substring(2));
		System.out.println("Usuario: "+email.substring(0, email.indexOf("@")));
		
		System.out.println("Servidor de email: "+email.substring(email.indexOf("@")+1, email.indexOf(".com")));
		//conta a partir do @ sem incluir o arroba
		
		System.out.println("Primeiro caracter: "+email.charAt(0));

		/* COmparando strings
		 * == nao se aplica!
		 * com numeros ele diz = é atribuição == é comparação
		 * Strings nao se compara dessa forma
		 * */
		System.out.println("Comparando strings "+email.equals("xpto@xpto.com"));
		System.out.println("Comparando strings ignorand CASE"+email.equalsIgnoreCase("xpto@xpto.com"));
		
	}
	

}
