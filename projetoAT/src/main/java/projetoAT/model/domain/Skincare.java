package projetoAT.model.domain;

public class Skincare extends Produto {
	private String tipo;
	private String principioAtivo;
	private String finalidade;
	
	
	public Skincare() {
		this.setNome("Esfoliante Maracujá");
		this.setValorUnitario(500.0f);
		this.setEan(12345);
		this.setQuantidade(2);
		setTipo("Peles ressecadas");
		setPrincipioAtivo("Vitamina C");
		setFinalidade("Renovar os poros e hidratar a pele");
	}
	
	public Skincare(String nome, float valorUnitario) {
		super();
		this.setNome(nome);
		this.setValorUnitario(valorUnitario);
	}
	
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getPrincipioAtivo() {
		return principioAtivo;
	}
	public void setPrincipioAtivo(String principioAtivo) {
		this.principioAtivo = principioAtivo;
	}
	
	public String getFinalidade() {
		return finalidade;
	}
	public void setFinalidade(String finalidade) {
		this.finalidade = finalidade;
	}
	
	
	@Override
	public String toString() {
		return super.toString() + " - " + tipo + " - " + principioAtivo + " - " + finalidade + "]";
	}
}
