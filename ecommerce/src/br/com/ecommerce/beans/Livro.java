package br.com.ecommerce.beans;

public class Livro extends Produto{

	private String isbn;
	private String autor;
	private String editora;
	
	
	
		
	public Livro(int pId, String pDescricao, float pVCompra, float pVVenda, int pQtde, String pTipo, String isbn,
			String autor, String editora) {
		super(pId, pDescricao, pVCompra, pVVenda, pQtde, pTipo);
		this.isbn = isbn;
		this.autor = autor;
		this.editora = editora;
	}
	
	public void setAll(int pId, String pDescricao, float pVCompra, float pVVenda, int pQtde, String pTipo, String isbn,
			String autor, String editora) {
		super.setAll(pId, pDescricao, pVCompra, pVVenda, pQtde, pTipo);
		this.isbn = isbn;
		this.autor = autor;
		this.editora = editora;
	}
	
	public String getAll() {
		return "\n ISBN " + isbn + "\n" +
				"\n Autor(a) " + autor + "\n" +
				"\n Editora " + editora + "\n" +
				super.getAll();
	}
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public Livro() {
		super();
	}
	
	
	
}
