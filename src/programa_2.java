import java.util.Scanner;

public class programa_2 {
    public static void main(String[] args) {
        // Paso 1: Crear un objeto Scanner para leer desde la entrada estándar (consola)
        Scanner scanner = new Scanner(System.in);

        // Paso 2: Solicitar al usuario que ingrese una cadena de caracteres
        System.out.print("Introduce una cadena de caracteres: ");
        String lectTeclado = scanner.nextLine();

        try {
            // Paso 3: Invocar al método caracterEn con la cadena ingresada y la posición 7
            char resultado = caracterEn(lectTeclado, 7);
            System.out.println("El caracter en la posición 7 es: " + resultado);
        } catch (IndexOutOfBoundsException e) {
            // Paso 4: Capturar la excepción si ocurre y mostrar un mensaje de error
            System.out.println("Has intentado recuperar una posición de la cadena de caracteres que no existe;");
        }
    }

    // Definición del método caracterEn que recibe una cadena y una posición, y devuelve un carácter
    public static char caracterEn(String cadena, int posicion) {
        return cadena.charAt(posicion);
    }
}
