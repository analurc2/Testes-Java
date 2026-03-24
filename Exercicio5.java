// Sejam a e b os catetos de um triangulo, onde a hipotenusa é obtida pela equação:
// hipotenusa = raiz2(a^2 + b^2). Ler os valores de a e b, calcular a hipotenusa e mostrar o resultado. 

import java.util.Scanner;

public class Exercicio5 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print ("Digite o cateto a: ");
        double a = scanner.nextDouble();

        System.out.print ("Digite o cateto b: ");
        double b = scanner.nextDouble();
        scanner.close();

        double aQuad = Math.pow(a, 2);
        double bQuad = Math.pow(b, 2);
        double hipotenusa = Math.sqrt(aQuad + bQuad);
        
        System.out.printf("hipotenusa = %.2f\n", hipotenusa);

    }
    
}
