package br.com.universidadereferencia.beans;

public class Endereco {

	//atributos
	
	private String nomerua;
	private String CEP;
	private String num;
	private String comp;
	
	public Endereco() {
		super();
	}
	public Endereco(String nomerua, String CEP, String num, String comp) {
		super();
		this.nomerua = nomerua;
		this.CEP = CEP;
		this.num = num;
		this.comp = comp;
	}
	
	public String getAll() {
		return "\n Rua " + nomerua + "\n" +
				"CEP" + CEP + "\n" +
				"Numero " + num + "\n" +
				"Complemento " + comp + "\n";
	}
	
	public String getNomerua() {
		return nomerua;
	}
	public void setNomerua(String nomerua) {
		this.nomerua = nomerua;
	}
	public String getCEP() {
		return CEP;
	}
	public void setCEP(String cEP) {
		CEP = cEP;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getComp() {
		return comp;
	}
	public void setComp(String comp) {
		this.comp = comp;
	}
	
}


