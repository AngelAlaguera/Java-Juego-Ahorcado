package Herencia;

// Esta clase define la estructura basica del animal y sus atributos.
public class Animal {

    String nombre;
    int edad;
    static int contador; // Variable de clase que es compartida por todas las instancias de la clase.
    //String raza;

    // Este constructor define el nombre y la edad del animal.
    public Animal(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
        contador++; // Incrementa el contador de animales, cada vez que se crea un nuevo animal.
        //this.raza=raza;
    }

    // Este metodo define el sonido que hace el animal.
    public String hacerSonido(){
        return "kakrkakrkakrka"; // sonnido de ejemplo
    }

    public static int getContadorAnimales(){
        return contador;
    }

}
