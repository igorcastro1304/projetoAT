package projetoAT;

import projetoAT.model.domain.Maquiagem;
import projetoAT.model.domain.Produto;
import projetoAT.model.domain.Skincare;
import projetoAT.model.service.ProdutoService;

public class ProdutoLoader {
	
	public static void main(String[] args) {
		
		Produto p1 = new Maquiagem("Blush Vermelho", 150);
		ProdutoService.incluir(p1);
		
		Produto p2 = new Skincare("Esfoliante de Tangerina", 20);
		ProdutoService.incluir(p2);
		
		Produto p3 = new Maquiagem("Pó de Ararajuba", 260);
		ProdutoService.incluir(p3);
		
		Produto p4 = new Skincare("Hidratante de Maçã Verde", 60);
		ProdutoService.incluir(p4);
		
		System.out.println(ProdutoService.obterLista());
		
		ProdutoService.excluir(p3.getId());
		
		System.out.println(ProdutoService.obterPorId(p1.getId()));
		
	}
}
