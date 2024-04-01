package projetoAT.controller;

import projetoAT.model.domain.Produto;
import projetoAT.model.service.ProdutoService;
import spark.Route;

public class ProdutoController {

	public static Route obterLista = (req, res) -> {
		return ProdutoService.obterLista();
	};
	
	public static Route excluir = (req, res) -> {
		Integer id = Integer.valueOf(req.params("id"));
		
		Produto p = ProdutoService.obterPorId(id);
		
		ProdutoService.excluir(id);
		
		return "Exclusão realizada com sucesso " + p + "!";
	};
	
	public static Route obter = (req, res) -> {
		Integer id = Integer.valueOf(req.params("id"));
		
		Produto p = ProdutoService.obterPorId(id);
		
		return "O seguinte produto foi recuperado: " + p;
	};
}
