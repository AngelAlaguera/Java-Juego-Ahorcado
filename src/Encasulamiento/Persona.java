package Encasulamiento;

public class Persona {

    // Atributos (Estado/Caracteristicas de un Objeto)
    private String nombre;
    private String apellido;
    private int edad;

    //  Contructor
    public Persona(String nombre, String apellido, int edad){
        // El primer atributo 'this.nombre' corresponde 'String nombre'
        // El segundo atributo 'nombre' corresponde 'String nombre'. Asi Sucecivamente.
        this.nombre= nombre;
        this.apellido= apellido;
        this.edad= edad;
    }

    // Metodos (Comportamiento de un Objeto)
    public String darNombreCompleto(){

        //return apellido + " " + nombre;
        return getApellido() + " " + getNombre();
    }

    public String enviarSaludo(String saludado){

        if(edad>40) return "Buenos dias señor " + saludado;
        return "Hola como estas " + saludado + "?";
    }

    // ----- Getters y Setters ----

    // ----------------- Solucion para OBTENER (Get) Informacion
    public int getEdad(){
        return this.edad;
    }

    public String getNombre(){
        return this.nombre.toUpperCase();
    }

    public String getApellido(){
        return this.apellido.toUpperCase();
    }

    // ----------------- Solucion para MODIFICAR (Set) Informacion (En este caso Nombre, Apellido y Edad)
    public void setNombre(String nombre){
        this.nombre= nombre;
    }

    public void setApellido(String apellido){
        this.apellido= apellido;
    }

    // Modo de Ejemplo por estudiar las Condiciones para estos Tipos de caso
    public void setEdad(int edad){
        if (edad>=18){
            this.edad= edad;
        }else{
            System.out.println("\n La Edad deve ser >= a 18, Edad No se Pudo Cambiar"); // en este caso mayo que 18
        }
    }

    // Getters y Setters de forma Automatica (de esta forma se hace Actualente)
    // click Derecho--> Source Action --> Generate Getters and Setters


    


}// Fin de la clase Persona
