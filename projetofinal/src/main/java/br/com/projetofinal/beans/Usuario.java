package br.com.projetofinal.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="TB_USUARIO")


//entity - essa classe usuario vai se relacionar a uma tabela de bd
//annotation @ deve ser usada ACIMA da classe que ela vai ser relacionada

public class Usuario {

	@Id //indica que o campo abaixo é uma chave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY) //identity - autonumeracao incremento de 1 em 1 / usar sequence apenas em Oracle DB
	@Column(name ="id")//nome que estiver na tabela do BD -@Column precisa estar acima do id ja que vai relacionar com id 
	private int id;
	
	@Column(name ="nome", length=40)
	private String nome;
	
	@Column(name ="email", length=70)
	private String email;
	
	@Column(name ="password", length=20)
	private String senha;
	
	@Column(name ="foto", length=100)
	private String foto;
	
	
	
		public Usuario(int id, String nome, String email, String senha, String foto) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.foto = foto;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public Usuario() {
		super();
	}
	
	
}
