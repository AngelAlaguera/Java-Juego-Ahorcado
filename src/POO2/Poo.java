package POO2;

public class Poo {

    public static void main(String[] args) throws Exception{

        // Programacion Orientada a Objeto

        // Persona 1
        Persona persona1= new Persona("Juan", "Perez", 53, "Ingenieria en Sistemas", 6, false);
        //persona1.nombre="Juan"; | persona1.apellido="Perez"; | persona1.edad=53;
      

        // Persona 2
        Persona persona2= new Persona("Maria", "Lopez", 22, "Ingenieria Iformatica", 5, true);

    
        //persona2.carrera=carrera2; // incluir informacion de la clase Carrera en la Clase persona


        // ------ Instanciar carrera (rellenar de carreras)-----
        System.out.println("\n");
        System.out.println(persona1.darNombreCompleto() + " tiene " + persona1.edad + " años y esta graduado en: " + persona1.carrera.nombre);
        System.out.println(persona2.darNombreCompleto() + " tiene " + persona2.edad + " años y aun esta estudiando: " + persona2.carrera.nombre);

    }    
}
