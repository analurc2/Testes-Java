//Ler um número inteiro e imprimir a soma do sucessor de seu triplo com o antecessor do seu dobro

import java.util.Scanner;

public class Exercicio4 {

    public static void main  (String[] args) {

        //declara variáveis
        Scanner scanner = new Scanner (System.in);
        int numero, sucessorTriplo, antecessorDobro, soma;

        //entrada de dados
         System.out.print ("Digite um número inteiro: ");
        numero = scanner.nextInt();
    
        //processamento
        sucessorTriplo = numero * 3 + 1;
        antecessorDobro = numero * 2 - 1;
        soma = sucessorTriplo + antecessorDobro;

        //saida
        System.out.println("Resultado: " + soma);
        scanner.close();

    }

    
}
