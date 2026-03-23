import java.util.Scanner;

public class Testes {
    public static void main (String[] args) {
     Scanner sc = new Scanner(System.in);
    int numero;

    System.out.println("Digite um número: ");
    numero = sc.nextInt();

    int resultado = numero * 2;

    System.out.println("O dobro desse numero: " + resultado);

    sc.close();
}
}

