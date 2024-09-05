// Carpeta para acceder a la clase en el IDE de VSCode
// Package Nombre de la Carpeta:
package cursoBasico;

public class App2 {
    public static void main(String[] args) throws Exception {

        // Strings, cadenas de carcacteres

        String texto= "Este es un texto asignado a una variable de tipo string";
        String texto2= "     Este es otro texto asignado a una variable de tipo string     ";
        System.out.println(texto);

        int longitud = texto.length();
        System.out.println("La longitud del texto es: " + longitud);

        char caracter = texto.charAt(0); // Obtiene el primer caracter
        System.out.println("El primer caracter es: " + caracter);

        String subcadena = texto.substring(5, 16); // Obtiene una subcadena
        System.out.println("La subcadena del index 5 a 16 es: " + subcadena);

        String mayusculas = texto.toUpperCase(); // Convierte a mayúsculas
        System.out.println("En mayúsculas: " + mayusculas);

        String minusculas = texto.toLowerCase(); // Convierte a minúsculas
        System.out.println("En minúsculas: " + minusculas);

        String replace = texto.replace("texto", "parrafo"); // Reemplaza una subcadena
        System.out.println("Texto reemplazado: " + replace);

        //boolean contiene = texto.contains("texto"); // Verifica si contiene una subcadena
        String contiene = texto.contains("texto") ? "Si" : "No";
        System.out.println("¿Contiene la palabra 'texto'? " + contiene);

        String eliminarEspacios= texto2.trim();
        System.out.println("Texto sin espacios: " + eliminarEspacios);

        String split = texto.split(" ")[0]; // Divide la cadena en un array de palabras
        System.out.println("Array de palabras: " + split);

    }
}
