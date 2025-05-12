
//Clase modelo que representa la respuesta JSON de la API de conversión de monedas.
// Esta clase se utiliza para mapear automáticamente los datos JSON usando la librería Gson.
public class RespuestaApi {

    private String base_code;        // Código de la moneda base (por ejemplo, "USD")
    private String target_code;     // Código de la moneda de destino (por ejemplo, "CLP")
    private double conversion_rate;// Tasa de conversión entre la moneda base y la moneda destino

    // Constructor vacío requerido por Gson para crear el objeto al convertir desde JSON
    public RespuestaApi() {

    }
    // Getter que retorna el código de la moneda base
    public String getBase_code() {
        return base_code;
    }
    // Getter que retorna el código de la moneda destino
    public String getTarget_code() {
        return target_code;
    }
    // Getter que retorna la tasa de conversión
    public double getConversion_rate() {
        return conversion_rate;
    }
}
