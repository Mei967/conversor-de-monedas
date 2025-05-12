
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

    // Clase encargada de conectarse a xchangeRate y obtener la tasa de conversión entre dos monedas
    public class ConsultaApi {

        // Construcción de la URL que se utilizará para consultar la API
       private static final String API_KEY = "61581fa232817507d9e1eedb";// / Clave personal de acceso a la API

       // Método que se conecta a la API y obtiene la tasa de conversión entre dos monedas.
       public double obtenerTasa(String monedaOrigen, String monedaDestino) {
           String direccion = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/" + monedaOrigen + "/" + monedaDestino;


           HttpClient client = HttpClient.newHttpClient();//crea el cliente HTTP que enviará la solicitud
           HttpRequest request = HttpRequest.newBuilder() //Crear la solicitud HTTP usando la URL anterior
                   .uri(URI.create(direccion))
                   .build();

           try {// Bloque try-catch para manejar posibles errores al conectarse con la API

               // Enviar la solicitud y obtener la respuesta como texto (formato JSON)
               HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

               Gson gson = new Gson(); //  Convertir el JSON a objeto Java

               RespuestaApi datos = gson.fromJson(response.body(), RespuestaApi.class);
               return datos.getConversion_rate();

           } catch (IOException | InterruptedException e) {
               // En caso de error de conexión o interrupción, lanzar una excepción personalizada
               throw new RuntimeException("Error al conectar con la API: " + e.getMessage());
           }

       }
    }

