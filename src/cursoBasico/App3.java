// Carpeta para acceder a la clase en el IDE de VSCode
// Package Nombre de la Carpeta:
package cursoBasico;
public class App3 {
    public static void main(String[] args) throws Exception{

        // Operadores Aritmeticos (+,-, -, *, /, %, ++, --)
        int a= 10;
        int b= 5;
        int c= a+b; // suma
        double d= 10; // para division
        double e= 5; // para division

        System.out.println("\nOperadores Aritmeticos:");
        System.out.println("la suma es: " + c); // suma
        System.out.println("la resta es: " + (a-b)); // resta
        System.out.println("la multiplicacion es: " + (a*b)); // multiplicacion
        System.out.println("la division es: " + (d/e)); // division
        System.out.println("el modulo es: " + (a%b)); // modulo
        System.out.println("el incremento es: " + (++a)); // incremento de 1
        System.out.println("el decremento es: " + (--b)); // decremento de 1


        //  Operadores de asignacion (asigna valores a las variables)

        int number = 10;
        number=20;
        number+=5;
        number-=5; // number=20;
        //number*=5;
        //number/=5;
        //number%=5;

        System.out.println("\nOperadores de Asignacion:");

        number+=5;
        System.out.println("El numero es: " + number);

        // Operadores de comparacion (comparan dos valores y devuelven un booleano)

        int num1= 5;
        int num2= 6;

        System.out.println("\nOperadores de Comparacion:");
        System.out.println("num1==num2: " + (num1==num2)); // igual
        System.out.println("num1!=num2: " + (num1!=num2)); // diferente
        System.out.println("num1>num2: " + (num1>num2)); // mayor
        System.out.println("num1<num2: " + (num1<num2)); // menor
        System.out.println("num1>=num2: " + (num1>=num2)); // mayor o igual
        System.out.println("num1<=num2: " + (num1<=num2)); // menor o igual

        // Operadores de Logica

        boolean conditional1= true;
        boolean conditional2= false;

        System.out.println("\nOperadores de Logica:");
        System.out.println("true && false: " + (conditional1 && conditional2)); // and, Ambos deven ser Positivos para que de true
        System.out.println("true || false: " + (conditional1 || conditional2)); // or, uno de los dos debe ser positivo para que de true
        System.out.println("!true: " + (!conditional1)); // not, opuesto a lo que teng asginado Prvieamente

    }  
}
