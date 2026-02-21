import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConversorAPI {

    private static final String API_KEY = "9bf7dc460dae55a857dbf54c";
    private final HttpClient client = HttpClient.newHttpClient();
    private final Gson gson = new Gson();

    public Moedas buscarTaxas(String base) {
        URI uri = URI.create("https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/" + base.toUpperCase());

        HttpRequest request = HttpRequest.newBuilder()
                .uri(uri)
                .GET()
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            Moedas data = gson.fromJson(response.body(), Moedas.class);

            if (data == null || data.result() == null || !"success".equalsIgnoreCase(data.result())) {
                throw new RuntimeException("Falha ao consultar a API! Resposta: " + response.body());
            }

            return data;
        } catch (Exception e) {
            throw new RuntimeException("Erro ao consultar a API: " + e.getMessage(), e);
        }
    }
}
