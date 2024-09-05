package cursoBasico;

public class App8 {
    public static void main(String[] args) throws Exception {
        
        // Arreglos

        // Arreglo manual, con 5 espacios, estos espacios luego se llenan con numeros
        // int[] numeros = new int[5];
        // Ejemplo de como se llenan los espacios:
        // numeros[0]=1
        // numeros[1]=2
        // numeros[2]=3
        // numeros[3]=4
        // numeros[4]=5

        // Arreglos de Numeros
        int[] numeros= {10, 20, 30, 40, 50}; 
        numeros[3]=80; // cambiar valor del arreglo

        // ---Bucle For 
        System.out.println("\nIdice, Valor con For:");
        for (int index = 0; index < numeros.length; index++) {

            // con 'numeros'         impirme 5 veces la misma linea I@7ad041f3
            // con 'numeros[index]'  imprime cada numero del arreglo en una linea.

            System.out.println(index + " : " + numeros[index]);
            //System.out.println(index);
        }
        
        // Bucle ForEach, Un Elemento de Arreglo.
        // Imprime solo los valors, pero no los indices.
        // Para Imprimir indices hay que inicializar una variable e ir incrementando en 1.

        System.out.println("\nIndice, Valor con ForEch");

        int indice= 0;
        for (int i : numeros){

            System.out.println(indice + " : " + i);
            indice++; // Incrementa el indice en 1.
        }
        

    }
}
