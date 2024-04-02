package projetoAT.model.domain;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private Integer id;
	private String cpf;
	private String nome;
	private Endereco endereco;
	private List<Pedido> pedidos;
	
	public Cliente() {
		
	}
	
	public Cliente(String cpf, String nome, Endereco endereco, List<Pedido> pedidos) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.endereco = endereco;
		this.pedidos = new ArrayList<>();
	}
	

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
		return "[" + id + " - " + cpf + " - " + nome + " - " + endereco + " - " + pedidos + "]";
	}
}
