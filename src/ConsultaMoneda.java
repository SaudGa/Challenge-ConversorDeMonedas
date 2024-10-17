import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {
    public Monedas buscarMoneda(String monedaBase, String monedaCambio){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/64be233f6a56c7cc2dd20db5/pair/"+monedaBase+"/"+ monedaCambio);

        HttpClient client =HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(direccion).build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Monedas.class);
        } catch (Exception e) {
            throw new RuntimeException("Error en el sistema");
        }
    }
}
