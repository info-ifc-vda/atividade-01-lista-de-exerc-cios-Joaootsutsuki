import java.util.Scanner;

public class Atividade08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor total da compra: R$ ");
        double valorCompra = scanner.nextDouble();
        
        System.out.print("Digite o valor pago pelo cliente: R$ ");
        double valorPago = scanner.nextDouble();
        
        if (valorPago < valorCompra) {
            System.out.println("Valor pago é insuficiente para cobrir o valor da compra.");
        } else {
            double troco = valorPago - valorCompra;
            System.out.printf("O valor do troco é: R$ %.2f\n", troco);
            
            int[] cedulas = {100, 50, 20, 10, 5, 2, 1};
            int[] quantidades = new int[cedulas.length];
            
            for (int i = 0; i < cedulas.length; i++) {
                quantidades[i] = (int) (troco / cedulas[i]);
                troco -= quantidades[i] * cedulas[i];
            }
            
            System.out.println("Troco a ser dado:");
            for (int i = 0; i < cedulas.length; i++) {
                if (quantidades[i] > 0) {
                    System.out.printf("%d cédula(s) de R$ %d\n", quantidades[i], cedulas[i]);
                }
            }
        }
        
        scanner.close();
    }
}
