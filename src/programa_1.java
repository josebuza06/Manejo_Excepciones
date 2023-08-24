public class programa_1 {

    public static char caracterEn(String cadena, int posicion) throws Exception {
        int longitudCadena = cadena.length(); // Obtenemos la longitud de la cadena

        if (posicion >= 0 && posicion < longitudCadena) {
            // Si la posición está dentro del rango válido, devolvemos el carácter en esa posición
            return cadena.charAt(posicion);
        } else {
            // Si la posición está fuera del rango válido, lanzamos una excepción
            throw new Exception("Posición fuera de rango");
        }
    }

    public static void main(String[] args) {
        String ejemplo = "Hola, mundo";

        try {
            char resultado = caracterEn(ejemplo, 7); // Llamamos al método con la cadena y la posición
            System.out.println("El carácter en la posición 7 es: " + resultado);
        } catch (Exception e) {
            System.out.println("Se ha producido una excepción: " + e.getMessage());
        }
    }
}
