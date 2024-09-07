package cursoBasico;

import java.util.Scanner;

public class ahorcado {

    public static void main(String[] args) throws Exception{

        // Projecto 2: Juego del Ohorcado

        // Declaraciones 
        String palabraSecreta= "inteligencia";
        int intentosMaximos= 10;
        int intentos=0;
        // Inicializamos la variable 'palabraAdivinada' en False para que el bucle While se ejecute
        boolean palabraAdivinada=false;

        // scanner
        Scanner scanner= new Scanner(System.in);

        // Arreglos: contamos la cantidad de letras de la palabra secreta.
        // y creamos una lista Vacia con la misma cantidad de letras Secretas.

        // Crear lista vacia con la misma cantidad de letras de la palabra secreta
        // Agregamos a esos espacios bacios esto: '_' en este caso son 12 '_' (lo hacemos Con For)
        char[] letrasAdivinadas= new char[palabraSecreta.length()];

        System.out.print("\n"); // separar linea
 
        for (int i = 0; i < letrasAdivinadas.length; i++) {

            letrasAdivinadas[i]= '_';
            //System.out.print(letrasAdivinadas[i]);
        }
        System.out.print("\n"); // separar linea

        // Lo mismo que el for anterior, pero manual
        //letrasAdivinadas="____________".toCharArray();

        // Bucle While
        while (!palabraAdivinada && intentos<intentosMaximos) {

            // Mostramos y Preguntamos al usuario las letras. LetrasAdivinadas=lA
            // Nota: String.valueOf(lA) convierte el arreglo en un String de caracteres para poder imprimirlo po consola sin error
            // Si lA es un array de caracteres char[], lA = {'a', 'b', 'c'};, la función String.valueOf(lA) devolvería la cadena "abc".
            System.out.println("\nPalabra a adivinar: " + String.valueOf(letrasAdivinadas) + "(" + palabraSecreta.length() + " letras)");
            System.out.println("Introduce una Letra, Por favor");

            char letra = Character.toLowerCase(scanner.next().charAt(0)); // Solo toma la primera letra de muchas

            // Bolean --> True o False, True --> la letra fue adivinada caso contrario No
            boolean letraCorrecta= false;

            // Recorremos la palabra secreta y la comparamos con la letra Ingresada (Una letra)
            // palabraSecreta.length()= 6 (cantidad de letras)
            for (int i= 0; i < palabraSecreta.length(); i++) {
                // palabraSecreta.charAt(i), indica el caracter en la posicion i de la palabra secreta 
                // ejemplo: palabra = inteligencia, 
                // palabra.charAt(0) = i | palabra.charAt(1) = n | palabra.charAt(2) = t
                if(palabraSecreta.charAt(i)==letra){
                    letrasAdivinadas[i]=letra; // se actualiza el arreglo con la letra correcta
                    letraCorrecta= true;
                }
            }

            // Condicion para saber si la letra es incorrecta 
            if(!letraCorrecta){
                intentos++;
                System.out.println("Incorrecto! te quedan " + (intentosMaximos-intentos) + " intentos");  
            }

            // Condicion para saber si la palabra Completa de letra es correcta
            if(String.valueOf(letrasAdivinadas).equals(palabraSecreta)){
                palabraAdivinada=true;
                System.out.println("\nFelicidades! Has Adivinado la palabra secreta: " + palabraSecreta);
            }

        if(intentos==intentosMaximos){
            System.out.println("\nTe has quedado sin Intentos, Game Over!");
        }

        } // Cierre While
        scanner.close(); // cierre del scanner

    }

}
