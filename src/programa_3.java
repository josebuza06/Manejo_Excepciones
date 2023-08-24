import java.util.Scanner;

class NumeroNegativoExcepcion extends Exception {
    // Constructor sin parámetros
    public NumeroNegativoExcepcion() {
        super(); // Llama al constructor sin parámetros de la clase Exception
    }

    // Constructor con un mensaje de error
    public NumeroNegativoExcepcion(String mensaje) {
        super(mensaje); // Llama al constructor de Exception que recibe un mensaje
    }
}


public class programa_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Introduce un valor numérico: ");
            double valor = scanner.nextDouble();

            if (valor < 0) {
                throw new NumeroNegativoExcepcion("Número negativo encontrado");
            } else {
                double raizCuadrada = Math.sqrt(valor);
                System.out.println("La raíz cuadrada de " + valor + " es: " + raizCuadrada);
            }
        } catch (NumeroNegativoExcepcion e) {
            System.out.println("Excepción: " + e.getMessage());
        }
    }
}