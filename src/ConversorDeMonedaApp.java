
import java.util.Scanner;

public class ConversorDeMonedaApp {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);// Crear objeto Scanner para leer datos del usuario por consola
        int opcion;

        System.out.println("***************************************");

        System.out.println("Bienvenido al conversor de monedas");
        //menu
        System.out.println("""
                1 Dólar =>> Peso Chileno
                2 Peso Chileno =>> Dólar
                3 Dólar =>> Real brasileño
                4 Real brasileño =>> Dólar
                5 Dólar =>> Peso colombiano
                6 Peso colombiano =>> Dólar
                7 salir""");

        System.out.println("************************************");

        while (true) {

             System.out.println("Elija una opción válida entre 1 y 7: ");

            if (teclado.hasNextInt()) { //validación de entrada (solo números)
                opcion = teclado.nextInt();
                if (opcion >= 1 && opcion <= 7 ){
                    break;
                }
                else{
                    System.out.println("Número incorrecto. Intente nuevamente");
                }
            }
            else {
                System.out.println("Entrada inválida. Ingrese solo numeros");
                teclado.next();
            }

        }
        System.out.println("Has elegido la opción: " + opcion);

        if (opcion == 7) {
            System.out.println("Gracias por usar el conversor de monedas. ¡Hasta pronto!");
            return; // Detiene el método main
        }

        System.out.println(" Ingrese el monto a convertir");
        double montoIngresado = teclado.nextDouble();

        String monedaOrigen = "";//Determina moneda de acuerdo a ingreso
        String monedaDestino = "";

        switch (opcion){//Determinar las monedas de origen y destino según la opción elegida por el usuario
            case 1 -> {
                monedaOrigen = "USD";
                monedaDestino = "CLP";
            }
            case  2  -> {
                monedaOrigen = "CLP";
                monedaDestino = "USD";
            }
            case 3 -> {
                monedaOrigen = "USD";
                monedaDestino = "BRL";
            }
            case 4 -> {
                monedaOrigen = "BRL";
                monedaDestino = "USD";
            }
            case 5 -> {
                monedaOrigen = "USD";
                monedaDestino = "COP";// COP = peso colombiano
            }
            case 6 -> {
                monedaOrigen = "COP";
                monedaDestino = "USD";
            }
        }


        ConversorMoneda conversor = new ConversorMoneda();// Crear objeto que realiza la conversión utilizando la API
        double resultado = conversor.convertir(montoIngresado, monedaOrigen, monedaDestino);

        //Mostrar el resultado de la conversión con formato: 2 decimales y nombres de monedas
        System.out.printf("Resultado: %.2f %s = %.2f %s",
                montoIngresado, monedaOrigen, resultado, monedaDestino);

        System.out.println("\nConversión realizada exitosamente");
        System.out.println("Gracias por usar el conversor de monedas");

        teclado.close();// Cerrar el scanner
    }

}
