package cursoBasico;
import java.util.Scanner; // Para digitar datos por consola


public class App4 {
    public static void main(String[] args) throws Exception {

        // ----- Estructura de Control --------

        // -------Condicional: if else--------
        /*
        int edad= 18;

        if (edad>18 && edad<=60){
            System.out.println("\nEs mayor de edad, puede Entrar");
        } else if (edad>60){
            System.out.println("\nEdad de jubilacion, no se admite Personas masyores de 60");
        } else if (edad== 18){
            System.out.println("\nEdad justa, puede Entrar");
        } else{
            System.out.println("\nEs menor de edad, No puede entrar");
        }  
        */

        // ----------- Switch -----------
        // Usuario Digita la opcion de la bebida...
        // 1. Agua
        // 2. Jugo
        // 3. Cerveza
        // 4. Cafe

        Scanner scanner = new Scanner(System.in); // Crea un Scanner (Input)
       
        int bebida=-1; // Inicializa bebida con un valor diferente de 0 para entrar al bucle


        while (bebida != 0){  
            System.out.println("\nBienvenido a la tienda de bebidas");
            System.out.println("Bebidas disponibles: \n1.Agua \n2.Jugo \n3.Cerveza \n4.Cafe \n0.Salir \nPor favor digite su bebida:");
            bebida = scanner.nextInt(); // Guarda la opcion de la bebida en la variable bebida
            //int bebida= scanner.nextInt();
        
        switch (bebida) {
            case 0:
            System.out.println("\nGracias por su visita. Fin del Programa."); //opcion salida
            break;
 
            case 1:
                System.out.println("\nSu bebida es agua.");
                break;
            case 2:
                System.out.println("\nSu bebida es jugo.");
                break;
            case 3:
                System.out.println("\nSu bebida es cerveza.");
                break;
            case 4:
                System.out.println("\nSu bebida es cafe.");
                break;
        
            default:
                System.out.println("\nNo es una opcion valida, Digite nuevamente...");
                break;

            } // cierre del switch
            
            // solo para las bebidad disponible en la tienda
            if(bebida>0 && bebida<=4){
                System.out.println("Disfruta! de su Bebida, Gracias por su compra");
            }

        } // cierre del while

        scanner.close(); // Cierra del Scanner (Input)
    }
} 


