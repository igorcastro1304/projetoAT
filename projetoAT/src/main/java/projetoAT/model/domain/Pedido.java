package projetoAT.model.domain;

import java.util.List;

public class Pedido {
	
	private Integer id;
	private Cliente cliente;
	private Endereco endereco;
	private List<Produto> produtos;
	private float valorPedido;
	
	
	private float calcularDesconto() {
		
		for(Produto p : produtos) {
			valorPedido += p.getValorTotal();
		}
		
		return valorPedido > 1000 ? valorPedido * 0.75f : valorPedido;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public List<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	public float getValorPedido() {
		setValorPedido();
		return valorPedido;
	}
	private void setValorPedido() {
		this.valorPedido = calcularDesconto();
	}
	
	
	
}