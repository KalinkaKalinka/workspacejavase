package br.com.ecommerce.beans;



public class Produto {
	
	//atributos
	private int id;
	private String descricao;
	private float valorCompra;
	private float valorVenda;
	private int qtde;
	private String tipo;
	
	//construtor letra maiuscula seguido de ()
	//sempre vai ter o nome da Classe
	
	/* Regras DTO
	 * Sugere todos os atributos privados
	 * getter e setter para cada atributo
	 * possuir no minimo 2 Construtores: 
	 * 1 vazio e um completo =  com todos atributos
	 * 
	 */
	
	//Construtor vazio
	
	public Produto () {
		//coloco aqui atributos pre definidos
		//obrigatorio ter dois construtores um vazio e um cheio -
		/*
		 * 
		 */
	}
	
	//construtor cheio (define o valor dos atributos e a estrutura lembra o setall)
	
	public Produto (int pId, 
			String pDescricao, 
			float pVCompra, 
			float pVVenda,
			int pQtde,
			String pTipo) {
		
			this.id = pId;
			this.descricao = pDescricao;
			this.valorCompra = pVCompra;
			this.valorVenda = pVVenda;
			this.qtde = pQtde;
			this.tipo = pTipo;	
			}
	
	

	public float getTotalVenda() {
		return qtde * valorVenda;
	}
	
	public float getTotalCompra() {
		return qtde * valorCompra;
	}
	
	//metodo get promoção
	public float getPromocao() {
		return valorVenda * (float) 0.9;
				}
	//metodo getEstoque
	public String getEstoque() {
		if (qtde <5) {
			return "Estoque baixo";
			} else if (qtde >10) {
				return "Estoque alto";
			} else { return "Estoque médio";
				
			}
	
	}
	
	public void setEntrarEstoque(int entrada) {
		qtde += entrada;
	}
	
	public void setSaidaEstoque(int saida) {
		qtde -= saida;
	}
	
	public float cederDesconto(float porcentagem) {
	return valorVenda - valorVenda 	* (porcentagem / 100);
	}
	
	//tipo set = vou pedir uma entrada e ai fazer o calculo
	public void ajustarValores(float porcentagem) {
	valorCompra = valorCompra + valorCompra	* (porcentagem/100);
	valorVenda = valorVenda + valorVenda * (porcentagem / 100);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(float valorCompra) {
		this.valorCompra = valorCompra;
	}
	public float getValorVenda() {
		return valorVenda;
	}
	public void setValorVenda(float valorVenda) {
		this.valorVenda = valorVenda;
	}
	public int getQtde() {
		return qtde;
	}
	public void setQtde(int qtde) {
		this.qtde = qtde;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	public void setAll
			(int pId, 
			String pDescricao, 
			float pVCompra, 
			float pVVenda,
			int pQtde,
			String pTipo) {
		
			this.id = pId;
			this.descricao = pDescricao;
			this.valorCompra = pVCompra;
			this.valorVenda = pVVenda;
			this.qtde = pQtde;
			this.tipo = pTipo;	}

	
	public String getAll()
	{
		return "ID "+ id + "\n" + 
				"Descricao Produto "+ descricao + "\n" + 
				"Valor de Compra "+ valorCompra + "\n" + 
				"Valor de Venda "+ valorVenda + "\n" + 
				"Qtde "+ qtde + "\n" + 
				"Tipo "+ tipo;
	}

}
