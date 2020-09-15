package br.com.ecommerce.beans;

public class Venda {

	//atributos
	
	private int numero;
	private String operacao;
	private float total;
	private Produto produto;
	
	
	
	public Venda(int numero, String operacao, float total, Produto produto) {
		super();
		this.numero = numero;
		this.operacao = operacao;
		this.total = total;
		this.produto = produto;
	}
	
	public Venda() {
		super();
	}
	
	public void setAll(int numero, String operacao, float total, Produto produto)
	{	
		this.numero = numero;
		this.operacao = operacao;
		this.total = total;
		this.produto = produto;
	}
	
	public String getAll() {
		return 
				"N Nota fiscal " + numero +"\n" +
				"Operação " + operacao +"\n"+
				"Total " + total +"\n" +
				"Produto \n" + produto.getAll() ;
		
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getOperacao() {
		return operacao;
	}
	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
}
