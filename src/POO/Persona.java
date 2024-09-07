package POO;

public class Persona {

    // Atributos (Estado/Caracteristicas de un Objeto)
    String nombre;
    String apellido;
    int edad;
    Carrera carrera; // otra clase 
    //String[] tecnologia; 
    //boolean esEstudiante;

    // Metodos (Comportamiento de un Objeto)
    public String darNombreCompleto(){

        return apellido + " " + nombre;
    }

    public String enviarSaludo(String saludado){

        if(edad>40) return "Buenos dias señor " + saludado;
        return "Hola como estas " + saludado + "?";
    }

}
