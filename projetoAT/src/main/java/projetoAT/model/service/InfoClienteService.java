package projetoAT.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import projetoAT.model.domain.InfoCliente;

public class InfoClienteService {
	private static Map<Integer, InfoCliente> listaInformacoesCliente = new HashMap<Integer, InfoCliente>();
	
	private static Integer id = 0;
	
	public static void incluir(InfoCliente infoCliente) {
		infoCliente.setId(++id);
		
		listaInformacoesCliente.put(infoCliente.getId(), infoCliente);
	}
	
	public static void excluir(Integer id) {
		listaInformacoesCliente.remove(id);
	}
	
	public static Collection<InfoCliente> obterLista() {
		return listaInformacoesCliente.values();
	}
	
	public static InfoCliente obterPorId(Integer id) {
		return listaInformacoesCliente.get(id);
	}
}
