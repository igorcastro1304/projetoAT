package projetoAT.controller;

import projetoAT.model.domain.Skincare;
import projetoAT.model.service.ProdutoService;
import spark.Route;

public class SkincareController {
	
	public static Route incluir = (req, res) -> {
		
		String nome = req.params("nome");
		float valorUnitario = Float.valueOf(req.params("valorUnitario"));
		
		Skincare s = new Skincare(nome, valorUnitario);
		
		ProdutoService.incluir(s);
		
		return "Inclusão realizada com sucesso: " + s + "!";
	};
	
}
