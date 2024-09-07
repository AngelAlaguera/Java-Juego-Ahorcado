package POO;

public class Poo {

    public static void main(String[] args) throws Exception{

        // Programacion Orientada a Objeto

        // ------ Instanciar Clases de Persona (rellenar de Personas) -----

        // Persona 1
        Persona persona1= new Persona();
        persona1.nombre="Juan";
        persona1.apellido="Perez";
        persona1.edad=53;

        // Carrera 1
        Carrera carrera1= new Carrera();
        carrera1.nombre="Ingenieria en Sistemas";
        carrera1.duracion=6;
        carrera1.estaEnCurso=false;

        persona1.carrera=carrera1; // incluir informacion de la clase carrera en la clase persona

        // Persona 2
        Persona persona2= new Persona();
        persona2.nombre="Maria";
        persona2.apellido="Lopez";
        persona2.edad=22;

        // Carrera 2
        Carrera carrera2= new Carrera();
        carrera2.nombre="Ingenieria Iformatica";
        carrera2.duracion=5;
        carrera2.estaEnCurso=false;

        persona2.carrera=carrera2; // incluir informacion de la clase Carrera en la Clase persona

        // ------ Instanciar carrera (rellenar de carreras)-----

        // Visualizar Informacion de la Personaa sin Meodos
        //System.out.println("\n" + persona1.apellido + " " + persona1.nombre + " tiene " + persona1.edad + " años");
        //System.out.println(persona2.apellido + " " + persona2.nombre + " tiene " + persona2.edad + " años\n");
    
        // Utilizando Metodos
        System.out.println(persona1.darNombreCompleto() + " tiene " + persona1.edad + " años y esta graduado en: " + persona1.carrera.nombre);
        System.out.println(persona2.darNombreCompleto() + " tiene " + persona2.edad + " años y aun esta estudiando: " + persona2.carrera.nombre);

        // Enviar saludo, otro atributo del objeto 
        //String saludado= "Maria";

        //System.out.println(persona1.enviarSaludo("Juanito"));
        //System.out.println(persona2.enviarSaludo(saludado));

    }    
}
