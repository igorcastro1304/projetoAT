package projetoAT.model.service;

import com.google.gson.Gson;

import projetoAT.clients.EnderecoClient;
import projetoAT.model.domain.Endereco;

public class EnderecoService {
	
	public static Endereco obterPorCep(String cep) {
		String enderecoJson = EnderecoClient.obterPorCep(cep);
		
		Endereco endereco = new Gson().fromJson(enderecoJson, Endereco.class);
		return endereco;
	}
	
}
