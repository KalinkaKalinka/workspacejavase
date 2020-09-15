package br.com.universidade.modelo;

/**/
public class Aluno {
   //atributos -sempre private
	
	private int rm;
	private String nome;
	private String email;
	
	
	/*Sintaxe para criação dos metodos
	 * <modificador> <retorno> <nomedoMetodo> (<TipodoParametro> <nomedoParametro),...
	 * em caso de retorno seria return = "" (caso public String
	 * 
	 *  
	 *  Se possive colocar o metodo logo abaixo do atributo relacionado*/
	
	
	public void preencherNome(String pNome) 
	{
		nome = pNome.toUpperCase();
	}
	
	public String retornarNome()
	{
		return nome;
	}
	
	public void preencherEmail(String pEmail)
	{
		email = pEmail.toLowerCase();
		
	}
	public String retornarEmail()
	{
		return email;
	}
	public void preencherRm(int pRm)
	{
		//pelo metodo fazemos validações
		rm = pRm;
	}
	
	public int retornarRm()
	{
		return rm; 
	}
}
