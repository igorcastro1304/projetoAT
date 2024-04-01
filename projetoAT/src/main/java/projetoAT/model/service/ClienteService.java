package projetoAT.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import projetoAT.model.domain.Cliente;

public class ClienteService {
	private static Map<Integer, Cliente> listaClientes = new HashMap<Integer, Cliente>();
	
	private static Integer id = 0;
	
	public static void incluir(Cliente cliente) {
		cliente.setId(++id);
		
		listaClientes.put(cliente.getId(), cliente);
	}
	
	public static void excluir(Integer id) {
		listaClientes.remove(id);
	}
	
	public static Collection<Cliente> obterLista() {
		return listaClientes.values();
	}
	
	public static Cliente obterPorId(Integer id) {
		return listaClientes.get(id);
	}
}
