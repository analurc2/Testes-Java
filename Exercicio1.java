import java.util.Scanner;

public class Exercicio1 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double km, milhas;

        System.out.print ("Digite os kilometros: ");
        km = scanner.nextDouble();
        milhas = km / 1.61;

        System.out.printf("%.2f km corresponde a %.2f milhas\n", km, milhas);

        scanner.close();

    }
    }

    
