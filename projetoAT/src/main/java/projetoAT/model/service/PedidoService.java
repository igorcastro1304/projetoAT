package projetoAT.model.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import projetoAT.model.domain.Cliente;
import projetoAT.model.domain.Pedido;

public class PedidoService {
	private static Cliente cliente = new Cliente();
	private static List<Pedido> listaPedidosCliente = new ArrayList<>();
	
	private static Map<Integer, Pedido> listaPedidos = new HashMap<Integer, Pedido>();
	
	private static Integer id = 0;
	
	public static void incluir(Pedido pedido) {
		pedido.setId(++id);
		
		listaPedidosCliente.add(pedido);
		listaPedidos.put(pedido.getId(), pedido);
		cliente.setPedidos(listaPedidosCliente);
	}
	
	public static void excluir(Integer id) {
		listaPedidos.remove(id);
	}
	
	public static Collection<Pedido> obterLista() {
		return listaPedidos.values();
	}
	
	public static Pedido obterPorId(Integer id) {
		return listaPedidos.get(id);
	}
}
