package projetoAT.controller;

import projetoAT.model.domain.Maquiagem;
import projetoAT.model.service.ProdutoService;
import spark.Route;

public class MaquiagemController {

	public static Route incluir = (req, res) -> {
		
		String nome = req.params("nome");
		float valorUnitario = Float.valueOf(req.params("valorUnitario"));
		
		Maquiagem m = new Maquiagem(nome, valorUnitario);
		
		ProdutoService.incluir(m);
		
		return "Inclusão realizada com sucesso: " + m + "!";
	};
	
}
