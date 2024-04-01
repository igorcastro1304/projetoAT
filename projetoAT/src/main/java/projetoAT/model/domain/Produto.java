package projetoAT.model.domain;

public class Produto {
	private Integer id;
	private String nome;
	private float valorUnitario;
	private int ean;
	private int quantidade;
	private float valorTotal;

	
	private float calcularDesconto() {
		return valorUnitario * quantidade > 200 ? (valorUnitario * quantidade) * 0.9f : valorUnitario * quantidade;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public float getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(float valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	
	public int getEan() {
		return ean;
	}
	public void setEan(int ean) {
		this.ean = ean;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
		setValorTotal();
	}
	
	public float getValorTotal() {
		return valorTotal;
	}
	
	private void setValorTotal() {
		this.valorTotal = calcularDesconto();
	}


	@Override
	public String toString() {
		return "[" + nome + " - " + valorUnitario + " - " + ean + " - " + quantidade + " - " + valorTotal;
	}
}
