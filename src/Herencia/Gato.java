package Herencia;

// Heredamos la Informacion de la clase Animal
public class Gato extends Animal{

    public Gato(String nombre, int edad){

        super(nombre, edad); // // Llamamos al constructor de la clase padre
    }

    // Sobreescribimos el metodo hacerSonido de la clase Animal
    @Override
    public String hacerSonido(){
        return "Miau";
    }

}
