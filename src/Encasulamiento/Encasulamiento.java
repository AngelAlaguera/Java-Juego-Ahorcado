package Encasulamiento;

public class Encasulamiento {

    public static void main(String[] args) throws Exception{

        // Programacion Orientada a Objeto
        // Enasulamiento: Pasar los atributos de clase a Privada, que puede ser solamente accedidos por los
        // Getters y Setters

        // Persona 1
        Persona persona1= new Persona("Juan", "Perez", 53);

        // Persona 2
        Persona persona2= new Persona("Maria", "Lopez", 22);

        // ------ Private --> error de Agregar (Setear) y error de Leer (Obtener get) ------

        // Cambiar Nombre y appellido --> persona 1
        persona1.setNombre("Angel");
        persona1.setApellido("Alaguera");
        persona1.setEdad(45);

        // Cambiar Nombre y appellido --> persona 2
        persona2.setNombre("Marian");
        persona2.setApellido("Gutierrez");
        persona2.setEdad(26);

        // ------ Instanciar carrera (rellenar de carreras)-----
        System.out.println("\n");
        System.out.println(persona1.darNombreCompleto() + " tiene " + persona1.getEdad() + " años");
        System.out.println(persona2.darNombreCompleto() + " tiene " + persona2.getEdad() + " años");
        System.out.println("\n");


    }    
}