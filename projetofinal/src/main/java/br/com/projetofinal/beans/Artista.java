package br.com.projetofinal.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
	
	@JsonIgnoreProperties("artista")
	@OneToMany(mappedBy ="artista", cascade =CascadeType.ALL) 
	//necessário indicar qual é o atributo que vai mapear a conexao entre as tabelas
	//cascade nao é obrigatorio mas indica que qq alteração no artista, sera replicado para musica
	//assim como se eu apagar o artista todas as suas musicas serao apagadas
	private List<Musica> musicas;
	
	
	
	public List<Musica> getMusicas() {
		return musicas;
	}
	public void setMusicas(List<Musica> musicas) {
		this.musicas = musicas;
	}
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
