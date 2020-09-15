package br.com.ecommerce.beans;

public class CD extends Produto {

	private String artista;
	private String gravadora;
	private String duracao;
	
	
	public CD(int pId, String pDescricao, float pVCompra, float pVVenda, int pQtde, String pTipo, String artista,
			String gravadora, String duracao) {
		super(pId, pDescricao, pVCompra, pVVenda, pQtde, pTipo);
		this.artista = artista;
		this.gravadora = gravadora;
		this.duracao = duracao;
	}
	
	
	
	public CD() {
		super();
	}

	
	public void setAll(int pId, String pDescricao, float pVCompra, float pVVenda, int pQtde, String pTipo, String artista,
			String gravadora, String duracao) {
		super.setAll(pId, pDescricao, pVCompra, pVVenda, pQtde, pTipo);
		this.artista = artista;
		this.gravadora = gravadora;
		this.duracao = duracao;
	}
	
	public String getAll() {
		return (
				"\n Artista " + artista + "\n" +
				"\n Gravadora " + gravadora + "\n" +
				"\n Duração " + duracao + "\n" +
				super.getAll()
				);
				}

	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getGravadora() {
		return gravadora;
	}
	public void setGravadora(String gravadora) {
		this.gravadora = gravadora;
	}
	public String getDuracao() {
		return duracao;
	}
	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	
}
