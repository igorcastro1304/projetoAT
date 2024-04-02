package projetoAT;

import projetoAT.model.domain.Cliente;
import projetoAT.model.domain.Endereco;
import projetoAT.model.service.ClienteService;
import projetoAT.model.service.EnderecoService;

public class ClienteLoader {
	
	public static void main(String[] args) {
		Endereco ec1 = EnderecoService.obterPorCep("78735349");
		Endereco ec2 = EnderecoService.obterPorCep("78735129");
		Endereco ec3 = EnderecoService.obterPorCep("78700200");
		Endereco ec4 = EnderecoService.obterPorCep("20010020");
		
		Cliente c1 = new Cliente("000.111.222-34", "Fulano de Campos", ec1, null);
		ClienteService.incluir(c1);
		
		Cliente c2 = new Cliente("111.222.333-34", "Fulano Araujo", ec2, null);
		ClienteService.incluir(c2);
		
		Cliente c3 = new Cliente("222.333.444-34", "Fulano Miranda", ec3, null);
		ClienteService.incluir(c3);
		
		Cliente c4 = new Cliente("333.444.555-34", "Fulano de Campos", ec4, null);
		ClienteService.incluir(c4);
		
		System.out.println(ClienteService.obterLista());
		
		ClienteService.excluir(c4.getId());
		
		System.out.println(ClienteService.obterPorId(c1.getId()));
		
	}
}
