package projetoAT.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import projetoAT.model.domain.Produto;

public class ProdutoService {
	private static Map<Integer, Produto> listaProdutos = new HashMap<Integer, Produto>();
	
	private static Integer id = 0;
	
	public static void incluir(Produto produto) {
		produto.setId(++id);
		
		listaProdutos.put(produto.getId(), produto);
	}
	
	public static void excluir(Integer id) {
		listaProdutos.remove(id);
	}
	
	public static Collection<Produto> obterLista() {
		return listaProdutos.values();
	}
	
	public static Produto obterPorId(Integer id) {
		return listaProdutos.get(id);
	}
}
