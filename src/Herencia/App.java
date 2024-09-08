package Herencia;

public class App {

    public static void main(String[] args) throws Exception{

        // En este caso estamos sobre Escribiendo la clase animal (Clase padre)
        // En este ejemplo Animal tiene nombre, edad y Sonido difrentes de animales
        // Como es la clase padre podemos heredar informacion para asignar nuevos atributos, etc.
        Animal animal = new Animal("Corage", 15);
        Perro perro = new Perro("Roma", 5);
        Gato gato = new Gato("Leona", 1);
        Gato gato2 = new Gato("Pucca", 2); // otro animal de ejemplo 


        Veterinaria Veterinaria = new Veterinaria("Friends Cats Dogs","El Poblado", 424567890, "carlos_vect@gmail.com");


        System.out.println("\nEL Animal llamdo: " + animal.nombre + " Hace: ");
        System.out.println(animal.hacerSonido());
        System.out.println("EL Perro llamado: " + perro.nombre + " Hace: ");
        System.out.println(perro.hacerSonido());
        System.out.println("EL Gato llamado: " + gato.hacerSonido() + " Hace: ");
        System.out.println(gato.hacerSonido());

        // Contador Animales, clase Static, Compartida por todas las instancias de la clase.
        System.out.println("El numero de animales es: " + Animal.getContadorAnimales());

        // Informacion de la Veterinaria Sergie Code
        // System.out.println("Atiendo Animalitos en la: " + Veterinaria.nombreVeterinaria());

        // Informacion de la Veterinaria hecho por mi
        System.out.println("\nAtiendo Perros y gatos, De Lunes A Viernes: ");
        System.out.println("Para mayor Informacion :");
        System.out.println("Nombre de la Veterinaria: " + Veterinaria.nombreVeterinaria()); // Ó Veterinaria.nombre
        System.out.println("Direccion: " + Veterinaria.direccion);
        System.out.println("Telefono: " + Veterinaria.telefono);
        System.out.println("Email: " + Veterinaria.email);

        //System.out.println("\n");
    }
}
