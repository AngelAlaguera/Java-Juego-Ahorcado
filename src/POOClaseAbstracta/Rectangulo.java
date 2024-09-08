package POOClaseAbstracta;

public class Rectangulo extends Figura{

    // Inicializamos variables
    double base;
    double altura;

    // Contructor
    public Rectangulo(double base, double altura) {

        this.base = base;
        this.altura = altura;
    }

    // Metodo (para Abstracto) para calcular el area
    // Metodo con o sin Public --> Funiona.

    @Override // Sobreescribir un metodo
    double calcularArea(){
        return base * altura;
    }

    //Metodo (para Abstracto) para calcular el perimetro
    @Override
    double calcularPerimetro(){
        return 2 * (base * altura);
    }

}
