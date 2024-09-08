package POOClaseAbstracta;

public class Circulo extends Figura{

    // inicalizamos variables
    double radio;

    // contructor
    public Circulo(double radio) {

        this.radio = radio;
    }

    // Metodo (para Abstracto) para calcular el area
    // Metodo con o sin Public --> Funiona.
    
    @Override // Sobreescribir un metodo
    double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
        // return Math.PI * radio * radio;
    }

    // Metodo (para Abstracto) para calcular el perimetro
    @Override
    double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

}
