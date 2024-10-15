import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner lectura = new Scanner(System.in);
        URI direccion =URI.create("https://v6.exchangerate-api.com/v6/64be233f6a56c7cc2dd20db5/latest/USD");
        HttpClient client =HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(direccion).build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());


//        try {
//            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
//            return new Gson().fromJson(response.body(), Moneda.class);
//        } catch (Exception e) {
//            throw new RuntimeException("ERROR");
//        }
    }
}