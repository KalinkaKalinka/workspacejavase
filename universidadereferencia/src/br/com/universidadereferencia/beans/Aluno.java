package br.com.universidadereferencia.beans;

public class Aluno {

	private int rm;
	private String nome;
	private String email;
	private Endereco endereco;
	
	public Aluno(int rm, String nome, String email, Endereco endereco) {
		super();
		this.rm = rm;
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
	}
	public Aluno() {
		super();
	}
	
	public String getAll() {
		return "\n Matricula (RM)  " + rm + "\n" +
				"Nome do Aluno  " + nome + "\n" +
				"E-mail " + email + "\n" +
				"Endereço " + endereco.getAll();
	}
	
	public int getRm() {
		return rm;
	}
	public void setRm(int rm) {
		this.rm = rm;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	
}

