package projetoAT.controller;

import projetoAT.clients.EnderecoClient;
import spark.Route;

public class EnderecoController {
	
	public static Route obterPorCep = (req, res) -> {
		String cep = req.params("cep");
		
		return EnderecoClient.obterPorCep(cep);
	};
	
}
