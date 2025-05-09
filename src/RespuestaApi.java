public class RespuestaApi {
//Clase modelo que representa la respuesta JSON de la API de conversión de monedas.

    private String base_code;
    private String tarjet_code;
    private double conversion_rate;

    public RespuestaApi() {

    }

    public String getBase_code() {
        return base_code;
    }

    public String getTarjet_code() {
        return tarjet_code;
    }

    public double getConversion_rate() {
        return conversion_rate;
    }
}
