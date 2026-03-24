//A importancia de 78000000 sera dividida entre 3 ganhadores de um concurso. Sendo que da quantia total:
// O primeiro ganhador recebera 46%
// O segundo receberá 32%
// O terceiro receverá o restante
// Calcule e imprima a quantia ganha por cada um dos ganhadores.

public class Concurso {
    public static void main(String[] args) {
        double total = 780_000_000; // valor total do prêmio

        double primeiroPercent = 46; // 46%
        double segundoPercent = 32;  // 32%
        double terceiroPercent = 100 - (primeiroPercent + segundoPercent); // restante 22%

        // cálculo dos valores
        double primeiroGanhador = total * (primeiroPercent / 100);
        double segundoGanhador = total * (segundoPercent / 100);
        double terceiroGanhador = total * (terceiroPercent / 100);

        // impressão dos resultados
        System.out.println("Primeiro ganhador: " + primeiroGanhador);
        System.out.println("Segundo ganhador: " + segundoGanhador);
        System.out.println("Terceiro ganhador: " + terceiroGanhador);
    }
}
    
