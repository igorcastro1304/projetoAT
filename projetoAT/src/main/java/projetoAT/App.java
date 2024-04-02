package projetoAT;

import projetoAT.controller.ClienteController;
import projetoAT.controller.EnderecoController;
import projetoAT.controller.MaquiagemController;
import projetoAT.controller.PedidoController;
import projetoAT.controller.ProdutoController;
import projetoAT.controller.SkincareController;
import spark.Spark;

public class App {

	public static void main(String[] args) {
		
		projetoAT.ClienteLoader.main(args);
		projetoAT.ProdutoLoader.main(args);
		
		Spark.port(8080);

		Spark.get("/", (req, res) -> {
			return App.class.getResourceAsStream("/index.html");
		});

		Spark.get("/produtos/lista", ProdutoController.obterLista);
		Spark.delete("/produtos/:id/excluir", ProdutoController.excluir);
		Spark.get("/produtos/:id", ProdutoController.obter);
		
		Spark.post("/skincare/:nome/:valorUnitario/incluir", SkincareController.incluir);
		
		Spark.post("/maquiagem/:nome/:valorUnitario/incluir", MaquiagemController.incluir);

		Spark.get("/cliente/lista", ClienteController.obterLista);
		Spark.post("/cliente/incluir", ClienteController.incluir);
		Spark.delete("/cliente/:id/excluir", ClienteController.excluir);
		Spark.get("/cliente/:id", ClienteController.obter);
		
		Spark.get("/pedido/lista", PedidoController.obterLista);
		Spark.post("/pedido/incluir", PedidoController.incluir);
		Spark.delete("/pedido/:id/excluir", PedidoController.excluir);
		Spark.get("/pedido/:id", PedidoController.obter);
		
		Spark.get("/endereco/:cep", EnderecoController.obterPorCep);
		
	}
}
