
// Clase encargada de realizar la conversión monetaria utilizando la tasa obtenida desde la API
public class ConversorMoneda {

    // Realiza la conversión de un monto entre dos monedas especificadas.
    public double convertir(double monto, String monedaOrigen, String monedaDestino){

        // Crear objeto para consultar la tasa de cambio entre las dos monedas
         ConsultaApi consulta = new ConsultaApi();

        // Obtener la tasa de conversión actual entre las dos monedas
        double tasa = consulta.obtenerTasa(monedaOrigen, monedaDestino);

       //multiplicar el monto por la tasa y devolver el resultado
        return monto * tasa;

    }

}
