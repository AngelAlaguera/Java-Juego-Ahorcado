package POOClaseAbstracta;

public class App {

    public static void main(String[] args) throws Exception{

        Circulo circulo = new Circulo(8);
        Rectangulo rectangulo= new Rectangulo(5, 8);


        // Area y Perimetro del circulo
        System.out.println("\n");
        circulo.imprimirInformacion();
        System.out.println("El area del circulo es: " + circulo.calcularArea());
        System.out.println("El perimetro del circulo es: " + circulo.calcularPerimetro());
    
        // Area y Perimetro del rectangulo
        System.out.println("\n");
        rectangulo.imprimirInformacion();
        System.out.println("El area del rectangulo es: " + rectangulo.calcularArea());
        System.out.println("El perimetro del rectangulo es: " + rectangulo.calcularPerimetro());

    }
}
