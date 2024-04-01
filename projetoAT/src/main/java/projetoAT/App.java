package projetoAT;

import projetoAT.controller.ClienteController;
import projetoAT.controller.MaquiagemController;
import projetoAT.controller.ProdutoController;
import projetoAT.controller.SkincareController;
import spark.Spark;

public class App {

	public static void main(String[] args) {
		Spark.port(8080);

		Spark.get("/", (req, res) -> {
			return App.class.getResourceAsStream("/index.html");
		});

		Spark.get("/produtos/lista", ProdutoController.obterLista);
		Spark.get("/produtos/:id/excluir", ProdutoController.excluir);
		Spark.get("/produtos/:id", ProdutoController.obter);
		
		Spark.get("/skincare/:nome/:valorUnitario/incluir", SkincareController.incluir);
		
		Spark.get("/maquiagem/:nome/:valorUnitario/incluir", MaquiagemController.incluir);

		Spark.get("/cliente/lista", ClienteController.obterLista);
		Spark.post("/cliente/incluir", ClienteController.incluir);
		Spark.delete("/cliente/:id/excluir", ClienteController.excluir);
		Spark.get("/cliente/:id", ClienteController.obter);
		
	}
}
