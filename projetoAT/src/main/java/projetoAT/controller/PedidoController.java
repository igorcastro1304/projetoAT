package projetoAT.controller;

import projetoAT.model.domain.Pedido;
import projetoAT.model.service.PedidoService;
import spark.Route;

public class PedidoController {
	public static Route obterLista = (req, res) -> {
		return PedidoService.obterLista();
	};
	
	public static Route incluir = (req, res) -> {
		
		Pedido p = new Pedido();
		
		PedidoService.incluir(p);
		
		return "Inclusão realizada com sucesso: " + p + "!";
	};
	
	public static Route excluir = (req, res) -> {
		Integer id = Integer.valueOf(req.params("id"));
		
		Pedido p = (Pedido) PedidoService.obterPorId(id);
		
		PedidoService.excluir(id);
		
		return "Exclusão realizada com sucesso " + p + "!";
	};
	
	public static Route obter = (req, res) -> {
		Integer id = Integer.valueOf(req.params("id"));
		
		Pedido p = (Pedido) PedidoService.obterPorId(id);
		
		return "O seguinte cliente foi recuperado: " + p;
	};
}
