import java.util.*;
import java.math.* ;

public class ClasseMath{
    public static void main(String[] args) {
        
        // Declaração de variáveis:
        double x = 25.0;
        double y = 5.0;
        double b = 2.0;
        double a = 23.5;
        int z = -5;

        // Resultados de métodos:
        System.out.println("A raiz quadrada de " + x + " é igual a " + Math.sqrt(x));
        System.out.println(y + "elevado à " + b + " é " + Math.pow(y, b));
        System.out.println("Valor absoluto de " + z + " é " + Math.abs(a));
        System.out.println("Se x é " + x + " e y é " + y + "deduzimos que " + Math.min(x,y) + "é o menor valor!");
        System.out.println("Se x é " + x + " e y é " + y + "deduzimos que " + Math.max(x,y) + "é o maior valor!");
        System.out.println("Um valor aleatório (randômico): " + Math.random());

    }
}