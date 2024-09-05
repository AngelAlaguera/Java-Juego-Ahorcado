package cursoBasico;

public class App5 {
    public static void main(String[] args) throws Exception {

        // Estructura de Control Iterativas

        // ---------- For 

        // Recorrer 3 numeros
        /* 
        int numero=3;

        for(int i=0; i<= numero; i++){
            for(int j=0; j<= numero; j++){
                System.out.print("i: ");
                System.out.print(i);
                System.out.print(" j: ");
                System.out.println(j);
            }
        }
        */

        //-------- While
        /*
        int contador= 1;
        System.out.println("\nContador con While:");

        while(contador <= 5) {
            System.out.println(contador);
            contador++;
        }
        */

        // --------- Do While

        int contador= 1;

        do{
            System.out.println("\nContador con Do While:");
            System.out.println(contador);

            contador++;
        } while(contador <= 5);


            System.out.println(contador);
            // chequeamos la ultima salida, miestras Contador sea menor o igual a 5
            // Para do while, aunque no se cumpla la condicion, se ejecuta al menos una vez.  

    }
}
