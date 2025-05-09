
import java.util.Scanner;

public class ConversorDeMonedaApp {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int opcion;

        System.out.println("***************************************");

        System.out.println("Bienvenido al conversor de monedas");

        //menu
        System.out.println("""
                1 Dólar =>> Peso Chileno
                2 Peso Chileno =>> Dólar\s
                3 Dólar =>> Real brasileño\s
                4 Real brasileño =>> Dólar\s
                5 Dólar =>> Peso colombiano
                6 Peso colombiano =>> Dólar\s
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

        System.out.println(" Ingrese el valor a convertir");









    }
}
