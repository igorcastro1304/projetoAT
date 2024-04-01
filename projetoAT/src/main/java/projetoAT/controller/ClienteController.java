package projetoAT.controller;

import projetoAT.model.domain.Cliente;
import projetoAT.model.service.ClienteService;
import spark.Route;

public class ClienteController {

	public static Route obterLista = (req, res) -> {
		return ClienteService.obterLista();
	};
	
	public static Route incluir = (req, res) -> {
		
		Cliente c = new Cliente();
		
		ClienteService.incluir(c);
		
		return "Inclusão realizada com sucesso: " + c + "!";
	};
	
	public static Route excluir = (req, res) -> {
		Integer id = Integer.valueOf(req.params("id"));
		
		Cliente c = (Cliente) ClienteService.obterPorId(id);
		
		ClienteService.excluir(id);
		
		return "Exclusão realizada com sucesso " + c + "!";
	};
	
	public static Route obter = (req, res) -> {
		Integer id = Integer.valueOf(req.params("id"));
		
		Cliente c = (Cliente) ClienteService.obterPorId(id);
		
		return "O seguinte cliente foi recuperado: " + c;
	};
}

