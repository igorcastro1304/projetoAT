package projetoAT.controller;

import projetoAT.model.domain.Endereco;
import projetoAT.model.service.EnderecoService;
import spark.Route;

public class EnderecoController {
	public static Route obterLista = (req, res) -> {
		return EnderecoService.obterLista();
	};
	
	public static Route incluir = (req, res) -> {
		
		Endereco e = new Endereco();
		
		EnderecoService.incluir(e);
		
		return "Inclusão realizada com sucesso: " + e + "!";
	};
	
	public static Route excluir = (req, res) -> {
		Integer id = Integer.valueOf(req.params("id"));
		
		Endereco e = (Endereco) EnderecoService.obterPorId(id);
		
		EnderecoService.excluir(id);
		
		return "Exclusão realizada com sucesso " + e + "!";
	};
	
	public static Route obter = (req, res) -> {
		Integer id = Integer.valueOf(req.params("id"));
		
		Endereco e = (Endereco) EnderecoService.obterPorId(id);
		
		return "O seguinte cliente foi recuperado: " + e;
	};
}
