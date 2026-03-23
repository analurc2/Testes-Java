import java.util.Scanner;

public class Graus {
    public static void main (String[] args) {
        //declara variáveis
        java.util.Scanner scanner = new Scanner(System.in);
        double radianos, graus; 
        //entrada de dados
        System.out.print("Digite um ângulo em graus");
        graus = scanner.nextDouble();
        //processamento
        radianos = graus * Math.PI / 180;
        //saida
        System.out.println(graus + "° = " + radianos + "rad");
        System.out.printf("%.2f°  = %.3f rad\n", graus, radianos);
        //libera recurso do scanner
        scanner.close();

    }
    }
