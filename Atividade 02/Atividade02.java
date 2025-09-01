import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do salário mínimo: R$ ");
        double salarioMinimo = scanner.nextDouble();

        System.out.print("Digite a quantidade de quilowatts consumidos: ");
        double quilowattsConsumidos = scanner.nextDouble();

        double valorPorQuilowatt = salarioMinimo * 0.01;

        double valorTotal = valorPorQuilowatt * quilowattsConsumidos;
        System.out.printf("Valor de cada quilowatt: R$ %.2f\n", valorPorQuilowatt);
        System.out.printf("Valor a ser pago pela residência: R$ %.2f\n", valorTotal);

        scanner.close();
    }
}
