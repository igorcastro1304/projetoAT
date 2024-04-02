package projetoAT.model.domain;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	
	private Integer id;
	private Cliente cliente;
	private Endereco endereco;
	private List<Produto> produtos;
	private float valorPedido;
	
	
	public Pedido() {
		
	}
	
	public Pedido(Cliente cliente, Endereco endereco, List<Produto> produtos) {
		super();
		this.cliente = cliente;
		this.endereco = endereco;
		this.produtos = new ArrayList<Produto>();
	}
	
	
	private float calcularDesconto() {
		
		for(Produto p : produtos) {
			valorPedido += p.getValorTotal();
		}
		
		return valorPedido > 1000 ? valorPedido * 0.8f : valorPedido;
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
	
	
	@Override
	public String toString() {
		return "[" + id + " - " + produtos.toString() + " - " + valorPedido + "]";
	}
	
}
