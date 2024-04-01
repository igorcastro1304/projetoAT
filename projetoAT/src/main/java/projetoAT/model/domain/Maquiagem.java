package projetoAT.model.domain;

public class Maquiagem extends Produto {
	private String regiao;
	private String cor;
	private String textura;
	
	
	public Maquiagem() {
		this.setNome("Blush Vermelho");
		this.setValorUnitario(250.0f);
		this.setEan(123);
		this.setQuantidade(2);
		this.regiao = "rosto";
		this.cor = "lábios de mi amore";
		this.textura = "malte";
	}
	
	public Maquiagem(String nome, float valorUnitario) {
		super();
		this.setNome(nome);
		this.setValorUnitario(valorUnitario);
	}
	
	
	public String getRegiao() {
		return regiao;
	}
	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getTextura() {
		return textura;
	}
	public void setTextura(String textura) {
		this.textura = textura;
	}
	
	
	@Override
	public String toString() {
		return super.toString() + " - " + regiao + " - " + cor + " - " + textura + "]";
	}
}
