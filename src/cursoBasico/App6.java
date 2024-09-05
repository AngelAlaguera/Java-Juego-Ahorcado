package cursoBasico;

public class App6 {
    public static void main(String[] args) throws Exception {

        // Controles de flujo, Break, Continue, Return.

        for(int i=0; i<=10; i++){
            System.out.println("Numero: " + i);

            if (i==5){

                break; // Para la ejecucion del ciclo
                //continue; // Continua con la ejecucion del ciclo despues de la condicion
                // return; // Para la ejecucion del metodo y regresa al metodo anterior
            }

            // Print, para visualizar valor final del Control de flujo usado.
            System.out.println("Numero: " + i);
        }

    }
}
