package projetoAT.model.domain;

import java.util.List;

public class Cliente {
	private Integer id;
	private InfoCliente informacao;
	private Endereco endereco;
	private List<Pedido> pedidos;

	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public InfoCliente getInformacao() {
		return informacao;
	}
	public void setInformacao(InfoCliente informacao) {
		this.informacao = informacao;
	}

	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}
	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}


	@Override
	public String toString() {
		return "[" + id + " - " + informacao + " - " + endereco + " - " + pedidos + "]";
	}
}
