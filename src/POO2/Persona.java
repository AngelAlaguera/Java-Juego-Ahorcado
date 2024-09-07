package POO2;

public class Persona {

    // Atributos (Estado/Caracteristicas de un Objeto)
    String nombre;
    String apellido;
    int edad;
    Carrera carrera; // otra clase 

    //  Contructor

    // estos son los argunemnto que va a recibir
    public Persona(String nombre, String apellido, int edad, String nombreCarrera, int duracion, boolean estaEnCurso ){

        // El primer atributo 'this.nombre' corresponde 'String nombre'
        // El segundo atributo 'nombre' corresponde 'String nombre'. Asi Sucecivamente.
        carrera= new Carrera(nombreCarrera, duracion, estaEnCurso); // Instanciamos la clase Carrera en la clase Persona.
        this.nombre= nombre;
        this.apellido= apellido;
        this.edad= edad;
    }


    // Metodos (Comportamiento de un Objeto)
    public String darNombreCompleto(){

        return apellido + " " + nombre;
    }

    public String enviarSaludo(String saludado){

        if(edad>40) return "Buenos dias señor " + saludado;
        return "Hola como estas " + saludado + "?";
    }

}