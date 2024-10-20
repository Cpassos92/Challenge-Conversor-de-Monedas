import java.util.Scanner;

public class ConversorMoneda {
    private static ApiMonedaService apiService = new ApiMonedaService(); // Inicializamos el servicio de API

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("****************************************");
            System.out.println("\n Bienvenido al conversor de monedas");
            System.out.println("\n Seleccione la conversión de moneda que desea realizar:");
            System.out.println("1. Peso Colombiano ==> Peso Chileno");
            System.out.println("2. Dollar ==> Euro");
            System.out.println("3. Peso Argentino ==> Dollar");
            System.out.println("4. Peso Colombiano ==> Euro");
            System.out.println("5. Peso Chileno ==> Dollar");
            System.out.println("6. Euro ==> Dollar Canadiense");
            System.out.println("7. Salir");
            System.out.println("\n ****************************************");

            int opcion = scanner.nextInt();

            String base = "";
            String destino = "";

            switch (opcion) {
                case 1:
                    base = "COP";
                    destino = "CLP";
                    break;
                case 2:
                    base = "USD";
                    destino = "EUR";
                    break;
                case 3:
                    base = "ARS";
                    destino = "USD";
                    break;
                case 4:
                    base = "COP";
                    destino = "EUR";
                    break;
                case 5:
                    base = "CLP";
                    destino = "USD";
                    break;
                case 6:
                    base = "EUR";
                    destino = "CAD";
                    break;
                case 7:
                    continuar = false;
                    System.out.println("Saliendo del programa...");
                    continue;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    continue;
            }

            try {
                System.out.print("Ingrese la cantidad a convertir: ");
                double cantidad = scanner.nextDouble();

                // Obtenemos la tasa de cambio mediante el servicio
                TasaCambio tasaCambio = apiService.obtenerTasaCambio(base, destino);
                double resultado = tasaCambio.convertir(cantidad);

                System.out.printf(" El valor %.2f %s corresponde al valor final de ==> %.2f %s%n", cantidad, base, resultado, destino);
            } catch (Exception e) {
                System.out.println("Error en la conversión: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
