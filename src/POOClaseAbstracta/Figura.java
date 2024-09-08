package POOClaseAbstracta;

public abstract class Figura {

    // Clase Abstracta
    // Este comportamiento sera Obligatorio en las clases que heredan de Figura
    // para poder ser instanciadas y usar sus metodos.

    // No se puede Instanciar no se puede colocar llaves, etc.
    // Solo para recivir herencia, e informcaion sobre Escrita de lso metodos abstractos.
    abstract double calcularArea();
    abstract double calcularPerimetro();


    // No se puede Instanciar pero si se pueder Ver 
    // Esta static, Disponible para todas las clases (Todos Lados)
    static void imprimirInformacion(){
        //System.out.println("Area: " + calcularArea());
        //System.out.println("Perimetro: " + calcularPerimetro());

        System.out.println("Esta Informacion Viene de la Clase Abstracta Figura");
    }


}
