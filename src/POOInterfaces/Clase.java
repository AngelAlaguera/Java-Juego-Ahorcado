package POOInterfaces;

public class Clase {

    // Aqui esta una clase sencilla y explicacion de 
    // Clases Abtractas e Interfaces

    /*
    Tanto las clases abstractas como las interfaces son herramientas poderosas en Java para lograr la abstracción y definir contratos para las clases, pero tienen diferencias clave:

    Clases Abstractas:

    Pueden tener métodos abstractos (sin implementación) y métodos concretos (con implementación).
    Pueden tener variables de instancia.
    Pueden tener constructores.
    Se extienden usando la palabra clave extends.
    Una clase solo puede heredar de una clase abstracta.
    */

    // Ejemplo: 
    public abstract class Animal {
        private String nombre;
      
        public Animal(String nombre) {
          this.nombre = nombre;
        }
      
        public String getNombre() {
          return nombre;
        }
      
        public abstract void hacerSonido(); 
      }
      
      public class Perro extends Animal {
        public Perro(String nombre) {
          super(nombre);
        }
      
        @Override
        public void hacerSonido() {
          System.out.println("Guau!");
        }
      }

      /*
       En este ejemplo, Animal es una clase abstracta con un método concreto getNombre() 
       y un método abstracto hacerSonido(). La clase Perro hereda de Animal y proporciona 
       una implementación para hacerSonido().
       */

       /*
        Interfaces:

        Solo pueden tener métodos abstractos (antes de Java 8).
        Todos los métodos son implícitamente públicos y abstractos.
        Pueden tener constantes (variables static final).
        No pueden tener variables de instancia ni constructores.
        Se implementan usando la palabra clave implements.
        Una clase puede implementar múltiples interfaces.
        */

        // Ejemplo: 

        public interface Volador {
            void volar();
          }
          
          public interface Nadador {
            void nadar();
          }
          
          public class Pato implements Volador, Nadador {
            @Override
            public void volar() {
              System.out.println("El pato está volando");
            }
          
            @Override
            public void nadar() {
              System.out.println("El pato está nadando");
            }
          }

          /*
          Aquí, Volador y Nadador son interfaces que definen métodos sin implementación. La clase Pato implementa ambas interfaces y proporciona implementaciones para volar() y nadar().
          */

          /*
          En resumen:

        Característica ---------- Clase Abstracta ------------------- Interfaz
        Métodos	                  Abstractos y concretos	          Abstractos (por defecto)
        Variables	              Instancia y constantes	          Constantes solo
        Constructores	          Sí	                              No
        Herencia	              extends (simple)	                  implements (múltiple)

        Usa clases abstractas cuando quieras proporcionar una base común de comportamiento con algo 
        de implementación por defecto. Usa interfaces cuando quieras definir un contrato que múltiples 
        clases no relacionadas puedan implementar.

        */





      
}// fin Class
