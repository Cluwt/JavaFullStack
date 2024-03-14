import java.util.Scanner;
import java.math.*;

public class Ex01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro:");
        int num1 = ler.nextInt();

        System.out.println("Digite outro número inteiro:");
        int num2 = ler.nextInt();

        int resultado = (int) Math.pow(num1, num2);

        System.out.println("A raiz quadrada dessa soma é " + resultado);


    }
}
