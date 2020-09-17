package br.com.polimorfismo.beans;

import br.com.polimorfismo.padrao.PadraoFormacao;

public class Bacharelado extends Formacao implements PadraoFormacao {
	
	private String projetoConclusao;
	private int cargaHorariaEstagio;
	public String getProjetoConclusao() {
		return projetoConclusao;
	}
	public void setProjetoConclusao(String projetoConclusao) {
		this.projetoConclusao = projetoConclusao;
	}
	public int getCargaHorariaEstagio() {
		return cargaHorariaEstagio;
	}
	public void setCargaHorariaEstagio(int cargaHorariaEstagio) {
		this.cargaHorariaEstagio = cargaHorariaEstagio;
	}
	public Bacharelado(String descricao, int periodo, double mensalidade, int duracao, String projetoConclusao,
			int cargaHorariaEstagio) {
		super(descricao, periodo, mensalidade, duracao);
		this.projetoConclusao = projetoConclusao;
		this.cargaHorariaEstagio = cargaHorariaEstagio;
	}
	public Bacharelado() {
		super();
	}

public String getAll() {
		
		return super.getAll() + 
				"\n Projeto de conclusão de curso " + projetoConclusao + "\n" +
				"\n Carga horária de estágio " + cargaHorariaEstagio + "\n";
	}

public void setAll(String descricao, int periodo, float mensalidade, int duracao, String projetoConclusao,
		int cargaHorariaEstagio) {
	super.setAll(descricao, periodo, mensalidade, duracao);
	this.projetoConclusao = projetoConclusao;
	this.cargaHorariaEstagio = cargaHorariaEstagio;
}

public void calcularMensalidade(double fator) {
super.setMensalidade((super.getDuracao()*fator*600) + (cargaHorariaEstagio*12));
}
@Override
public String exibirDetalhes() {
	// aqui vc programa o que vc quer do metodo que veio da interface
	return null;
}

}
