package projetoAT.clients;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class EnderecoClient {

	private static final String URL_VIACEP = "https://viacep.com.br/ws/";
	
	public static String obterPorCep(String cep) {
		try {
			CloseableHttpClient httpClient = HttpClients.createDefault();
			
			String url = URL_VIACEP + cep + "/json/";
			
			HttpGet request = new HttpGet(url);
			
			HttpResponse response = httpClient.execute(request);
			
			return EntityUtils.toString(response.getEntity());
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}	
	}
	
}
