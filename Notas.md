### Comandos Importantes
- control I para pedir una peticion de ayuda
- alt, shift, f acomoda el codigo

### Clases y Practicas 

1. Primera clase, hola mundo. (app.java)
2. segunda clse, Indentacion, comentrios (app.java)
3. Tercera clase Variables. (app.java)
    - Variables: Espacio de Memoria que tiene un nombre asociado y Puede contener un 
      valor cambiante.
    - Declaracion: 
    - Definicion: 
    - Inicializacion: 
    - Asignacion:
4. String cadena de texto (app2.java)
5. Operadores aritmeticos, Hcer Operaciones Matematicas. (app3.java)
6. Estructura de Control: if, else, switch, while(incluido por mi)(app4.java)
    - Projecto 1: Juego de tiendas de Bebidas (app4.java)
7. Estructura de control Iterativos: For, while, Do while (App5.java)
8. Controles de Fujos: Break, Continue, Return, try catch finally (No se utilizo) (App6.java)
9. Arreglos, Matrics y Vectores (App8.java) (2:55:16) no hay App7 jajaja.
    - Projecto 2: Juego del Ahorcado (App9.java)
10. 


## Ejemplos de otros codigos...
String texto = "Esta es una cadena de texto";
String[] palabras = texto.split(" "); // Divide la cadena en un array de palabras
if (palabras.length > 0 && palabras[0].length() >= 3) {
    char terceraLetra = palabras[0].charAt(2); // Obtiene la tercera letra de la primera palabra
    System.out.println("Tercera letra de la primera palabra: " + terceraLetra);
} else {
    System.out.println("La primera palabra no tiene tercera letra.");
}

 // Bucle for
        for (int i = 0; i < 5; i++) {
            System.out.println("\nNumero: " + i);
        }

----------------------------------------------------
### Sistema de Vscode
En .vscode --> settings tambien puede ir esto:
{
    "java.compile.nullAnalysis.mode": "automatic"
}

- y en applications properties puede ir esto
spring.application.name=demo
server.port=${PORT:8080}
spring.devtools.restart.enabled=true
spring.devtools.livereload.enabled=true

--------------------------------------------------------------------------------------
### Otro metodo mejorado por estudiar.

import java.util.Scanner;

public class Ahorcado {

    private String palabraSecreta;
    private int intentosMaximos;
    private int intentosRestantes;
    private char[] letrasAdivinadas;
    private boolean juegoTerminado;

    public Ahorcado(String palabraSecreta, int intentosMaximos) {
        this.palabraSecreta = palabraSecreta.toLowerCase();
        this.intentosMaximos = intentosMaximos;
        this.intentosRestantes = intentosMaximos;
        this.letrasAdivinadas = new char[palabraSecreta.length()];
        this.juegoTerminado = false;

        // Inicializa el array de letras adivinadas con guiones bajos
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }
    }

    public void jugar() {
        Scanner scanner = new Scanner(System.in);

        while (!juegoTerminado) {
            mostrarEstado();

            System.out.print("Introduce una letra: ");

            if (scanner.hasNext("[a-zA-Z]")) {
                char letra = scanner.next().toLowerCase().charAt(0);

                if (adivinarLetra(letra)) {
                    if (verificarFinJuego()) {
                        System.out.println("¡Felicidades! Has adivinado la palabra: " + palabraSecreta);
                        juegoTerminado = true;
                    }
                } else {
                    intentosRestantes--;
                    System.out.println("Letra incorrecta. Te quedan " + intentosRestantes + " intentos.");

                    if (intentosRestantes == 0) {
                        System.out.println("Te has quedado sin intentos. La palabra era: " + palabraSecreta);
                        juegoTerminado = true;
                    }
                }
            } else {
                System.out.println("Entrada inválida. Por favor, ingresa una letra.");
                scanner.next(); // Limpia el buffer
            }
        }

        scanner.close();
    }

    private void mostrarEstado() {
        System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas));
        System.out.println("Intentos restantes: " + intentosRestantes);
    }

    private boolean adivinarLetra(char letra) {
        boolean letraAcertada = false;

        for (int i = 0; i < palabraSecreta.length(); i++) {
            if (palabraSecreta.charAt(i) == letra) {
                letrasAdivinadas[i] = letra;
                letraAcertada = true;
                //break; // Puedes usar break para salir del bucle si se encuentra la letra
            }
        }

        return letraAcertada;
    }

    private boolean verificarFinJuego() {
        return String.valueOf(letrasAdivinadas).equals(palabraSecreta);
    }

    public static void main(String[] args) {
        Ahorcado juego = new Ahorcado("inteligencia", 10);
        juego.jugar();
    }
}