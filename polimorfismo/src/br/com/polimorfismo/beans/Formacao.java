package br.com.polimorfismo.beans;

public class Formacao {

	private String descricao = ""; // definir valor de um atributo serve para evitar um calculo em um dado nulo
	private int periodo;
	private double mensalidade;
	private int duracao;
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getPeriodo() {
		return periodo;
	}
	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}
	public double getMensalidade() {
		return mensalidade;
	}
	public void setMensalidade(double mensalidade) {
		this.mensalidade = mensalidade;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	public Formacao(String descricao, int periodo, double mensalidade, int duracao) {
		super();
		this.descricao = descricao;
		this.periodo = periodo;
		this.mensalidade = mensalidade;
		this.duracao = duracao;
	}
	public Formacao() {
		super();
	}
	
	public String getAll() {
		return "\n Descrição " + descricao + "\n" +
				"\n Período " + periodo + "\n" +
				"\n Mensalidade " + mensalidade + "\n" +
				"\n Duração " + duracao + " meses \n";
	}
	
	public void setAll (String descricao, int periodo, double mensalidade, int duracao) {
		this.descricao = descricao;
		this.periodo = periodo;
		this.mensalidade = mensalidade;
		this.duracao = duracao;
	}
	
	
	public double exibirMedia(double ps1, double ps2) {
		
		return (ps1+ps2)/2;
		
	}
	
	public double exibirMedia(double ps1, double ps2, double nac1, double nac2) {
		
		return ps1*0.4+ps2*0.4+nac1*0.1+nac2*0.1;
		
	}
	
	public double exibirMedia(double ps1, double ps2, double nac1, double nac2, double am1, double am2) {
		
		return ps1*0.25+ps2*25.4+nac1*0.1+nac2*0.1+am1*0.15+am2*0.15;
		
	}
	

	public void DefinirDuracao() //poderia ter sido feito o calculo em cada classe
	{
		if (this instanceof Medio)//this instance of = qq objeto que chame esse metodo
		{
			duracao =36;
		} else if (this instanceof Tecnologo) {
			duracao =24;
		} else if (this instanceof Bacharelado)
		{
			if (descricao.indexOf("ENGENHARIA")==-1) //se eu nao encontrar a palavra engenharia na descrição
			{
			duracao = 48;
		} else {
			duracao = 60;
		}
			}
		
	}
	
	public void calcularMensalidade(double fator) { } //esse calculo é feito dentro das classes filhas

}
