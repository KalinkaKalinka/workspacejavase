package br.com.universidade.modelo;

public class Professor {

	//atributos e metodos
	
	private String nome;
	
	public void preencherNome(String pNome)
	{
		nome = pNome.toUpperCase();
				
	}
	
	public String retornarNome()
	{
		return nome;
	}
	
	private int id;
	
	public void preencherId(int pId)
	{
		id = pId;
	}
	public int retornarId()
	{
		return id; 
	}
	
	private float valorHora;
	public void preencherValorHora(float pVHora)
	{
		valorHora = pVHora;
				
	}
	
	public float  retornarVHora()
	{
		return valorHora; 
	}
	
	private String area;
	public void preencherArea(String pArea)
	{
		area = pArea.toUpperCase();
				
	}
	public String retornarArea()
	{
		return area;
	}
	

	//metodo que retorna tudo
	
	public String getAll()
	{
		return id + "\n" + nome + "\n" + valorHora + "\n" + area;
	}
	
	//metodo que seta tudo
	
	public void setAll(int pId, String pNome, float pVHora, String pArea) {
		id = pId;
		nome = pNome;
		valorHora = pVHora;
		area = pArea;	}
}
