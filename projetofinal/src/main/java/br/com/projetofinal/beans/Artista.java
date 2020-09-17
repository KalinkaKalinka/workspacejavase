package br.com.projetofinal.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="TB_ARTISTA")
public class Artista {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //identity - autonumeracao incremento de 1 em 1 / usar sequence apenas em Oracle DB
	@Column(name ="id")
	private int id;
	
	@Column(name ="nomeArt")
	private String nomeArtistico;
	
	@Column(name ="nacionalidade")
	private String nacionalidade;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomeArtistico() {
		return nomeArtistico;
	}
	public void setNomeArtistico(String nomeArtistico) {
		this.nomeArtistico = nomeArtistico;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public Artista(int id, String nomeArtistico, String nacionalidade) {
		super();
		this.id = id;
		this.nomeArtistico = nomeArtistico;
		this.nacionalidade = nacionalidade;
	}
	public Artista() {
		super();
	}
	
	
	
}
