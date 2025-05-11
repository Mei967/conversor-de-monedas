public class ConversorMoneda {

    public double convertir(double monto, String monedaOrigen, String monedaDestino){

        ConsultaApi consulta = new ConsultaApi();
        double tasa = consulta.obtenerTasa(monedaOrigen, monedaDestino);
        return monto * tasa;

    }

}
