import java.util.Scanner;

public class CalculadoraFaseInicial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el angulo alfa en radianes: ");

        double alfa = scanner.nextDouble();

        double seno = Math.sin(alfa);
        double coseno = Math.cos(alfa);
        double tangente = Math.tan(alfa);

        System.out.println("sin(" + alfa + ") = " + seno);
        System.out.println("cos(" + alfa + ") = " + coseno);
        System.out.println("tan(" + alfa + ") = " + tangente);

        scanner.close();
    }
}
