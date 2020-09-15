package br.com.banco.beans;

public class Conta {
	
	private int numero;
	private String tipo;
	private float saldo;
	private float limite;
	private String titular;
	private float aplicacao;
	
	//construtor vazio;
	public Conta () {};
	
	//Construtor Cheio:
	 
	public Conta (int n, String t, float s, float l, String tt, float a ) {
		this.numero = n;
		this.tipo = t;
		this.saldo = s;
		this.limite = l;
		this.titular = tt;
		this.aplicacao =a;
	}
	
	public void setAll(int n, String t, float s, float l, String tt, float a ) {
		this.numero = n;
		this.tipo = t;
		this.saldo = s;
		this.limite = l;
		this.titular = tt;
		this.aplicacao =a;
	}
	
	public String getAll() {
		return 
				"Numero conta: " + numero + "\n" + 
				"Tipo da conta: " + tipo + "\n" + 
				"Saldo: " + saldo  + "\n" + 
				"Limite: " + limite  + "\n" + 
				"Titular: " + titular  + "\n" + 
				"Valor Aplicado: " + aplicacao;
	}
	
	public void depositar(float valor) {
		this.saldo += valor;
	}
	
	public void sacar(float valor) {
		this.saldo -= valor;
	}
	
	
	//BO - Business Object - o menos reaproveitavel, pq centraliza tudo que é muit
	// especifico do negocio
	//metodo aplicar automatico nao exige valor externo
	public void aplicarAutomatico () {
		float valor = saldo * (float) 0.25; 
		//como existem dois calculos o ideal é criar a variavel, para poupar processamento
		
		if (tipo.equalsIgnoreCase("corrente")) {
			saldo -= valor;
			aplicacao += valor;
		}

		
	}
	
	public void aplicarRendimento (float porcentagem) {
		aplicacao = aplicacao + aplicacao * (porcentagem/100);
	}
	
	//getters and setters
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	//retorna saldo e limite
	
	public float getSaldoLimite()
	{
		return saldo + limite;
		
	}
	
	public float getSaldo()
	{
		return saldo;
		
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public float getLimite() {
		return limite;
	}
	public void setLimite(float limite) {
		this.limite = limite;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public float getAplicacao() {
		return aplicacao;
	}
	public void setAplicacao(float aplicacao) {
		this.aplicacao = aplicacao;
	}
	
	

}
