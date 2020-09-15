package br.com.universidadereferencia.beans;

public class Curso {

	private String nomecurso;
	private float valor;
	private int cargaHoraria;
	
	
	public Curso(String nomecurso, float valor, int cargaHoraria) {
		super();
		this.nomecurso = nomecurso;
		this.valor = valor;
		this.cargaHoraria = cargaHoraria;
	}


	public Curso() {
		super();
	}


	public String getAll() {
		return "\n"+ nomecurso + "\n" +
				"Valor  " + valor + "\n" +
				"Carga horária " + cargaHoraria;
	}
	
	
	public String getNomecurso() {
		return nomecurso;
	}


	public void setNomecurso(String nomecurso) {
		this.nomecurso = nomecurso;
	}


	public float getValor() {
		return valor;
	}


	public void setValor(float valor) {
		this.valor = valor;
	}


	public int getCargaHoraria() {
		return cargaHoraria;
	}


	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	
}
