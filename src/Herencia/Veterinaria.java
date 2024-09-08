package Herencia;

public class Veterinaria {

    // Clase de Sergie Code
    // Static De esta forma se puede acceder a esta clase 
    // static String nombreVeterinaria= "Veterinaria de Ricardo";


    // Atributos de la clase Veterinaria hecho Por mi
    String nombre;
    String direccion;
    int telefono;
    String email;


    // Contructor de la clase Veterinaria
    public Veterinaria(String nombre, String direccion, int telefono, String email){
        this.nombre=nombre;
        this.direccion=direccion;
        this.telefono=telefono;
        this.email=email;
    }

    // Metodo Retorna solo el nombre, no es necesario ya que podemos acceder desde el Contructor.
    public String nombreVeterinaria(){
        return this.nombre;
    }
}
