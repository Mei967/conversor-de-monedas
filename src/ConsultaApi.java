
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

    public class ConsultaApi {
       private static final String API_KEY = "61581fa232817507d9e1eedb";

       public double obtenerTasa(String monedaOrigen, String monedaDestino) {
           String direccion = " https://v6.exchangerate-api.com/v6" + API_KEY + "/pair/" + monedaOrigen + "/" + monedaDestino;

           HttpClient client = HttpClient.newHttpClient();//crea el cliente y solicitud Http
           HttpRequest request = HttpRequest.newBuilder()
                   .uri(URI.create(direccion))
                   .build();

           try {
               HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());//envia una solicitud y obtiene respuesta

               Gson gson = new Gson(); //  Convertir el JSON a objeto Java
               RespuestaApi datos = gson.fromJson(response.body(), RespuestaApi.class);
               return datos.getConversion_rate();
           } catch (IOException | InterruptedException e) {
               throw new RuntimeException("Error al conectar con la API: " + e.getMessage());
           }

       }
    }

