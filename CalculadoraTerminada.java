import java.util.Scanner;

public class CalculadoraTerminada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        System.out.println("Calculadora trigonometrica en Java");
        System.out.println("Programa por terminal para calcular funciones trigonometricas.");

        while (continuar) {
            mostrarMenu();
            System.out.print("Seleccione una opcion: ");

            int opcion = scanner.nextInt();

            if (opcion == 0) {
                continuar = false;
                System.out.println("Programa finalizado.");
            } else if (opcion >= 1 && opcion <= 9) {
                System.out.print("Ingrese el valor de alfa: ");
                double alfa = scanner.nextDouble();

                double resultado = calcular(opcion, alfa);

                if (Double.isNaN(resultado)) {
                    System.out.println("No se puede calcular esa funcion con el valor ingresado.");
                    System.out.println("Recuerde que arcsin y arccos solo aceptan valores entre -1 y 1.");
                } else {
                    System.out.println("Resultado: " + resultado);
                }
            } else {
                System.out.println("Opcion invalida. Intente de nuevo.");
            }

            System.out.println();
        }

        scanner.close();
    }

    public static void mostrarMenu() {
        System.out.println("1. sin(alfa)");
        System.out.println("2. cos(alfa)");
        System.out.println("3. tan(alfa)");
        System.out.println("4. arcsin(alfa)");
        System.out.println("5. arccos(alfa)");
        System.out.println("6. arctan(alfa)");
        System.out.println("7. sinh(alfa)");
        System.out.println("8. cosh(alfa)");
        System.out.println("9. tanh(alfa)");
        System.out.println("0. Salir");
    }

    public static double calcular(int opcion, double alfa) {
        switch (opcion) {
            case 1:
                return Math.sin(Math.toRadians(alfa));
            case 2:
                return Math.cos(Math.toRadians(alfa));
            case 3:
                return Math.tan(Math.toRadians(alfa));
            case 4:
                if (Math.toRadians(alfa) < -1 || Math.toRadians(alfa) > 1) {
                    return Double.NaN;
                }
                return Math.asin(Math.toRadians(alfa));
            case 5:
                if (Math.toRadians(alfa) < -1 || Math.toRadians(alfa) > 1) {
                    return Double.NaN;
                }
                return Math.acos(Math.toRadians(alfa));
            case 6:
                return Math.atan(Math.toRadians(alfa));
            case 7:
                return Math.sinh(Math.toRadians(alfa));
            case 8:
                return Math.cosh(Math.toRadians(alfa));
            case 9:
                return Math.tanh(Math.toRadians(alfa));
            default:
                return Double.NaN;
        }
    }
}
