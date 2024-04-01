package projetoAT.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import projetoAT.model.domain.Endereco;

public class EnderecoService {
	private static Map<Integer, Endereco> listaEnderecos = new HashMap<Integer, Endereco>();
	
	private static Integer id = 0;
	
	public static void incluir(Endereco endereco) {
		endereco.setId(++id);
		
		listaEnderecos.put(endereco.getId(), endereco);
	}
	
	public static void excluir(Integer id) {
		listaEnderecos.remove(id);
	}
	
	public static Collection<Endereco> obterLista() {
		return listaEnderecos.values();
	}
	
	public static Endereco obterPorId(Integer id) {
		return listaEnderecos.get(id);
	}
}
