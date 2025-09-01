import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o código do produto (1 a 40): ");
        int codigo = scanner.nextInt();
        
        System.out.print("Digite a quantidade comprada: ");
        int quantidade = scanner.nextInt();
        
        double precoUnitario = 0.0;
        
        if (codigo >= 1 && codigo <= 10) {
            precoUnitario = 10.00;
        } else if (codigo >= 11 && codigo <= 20) {
            precoUnitario = 15.00;
        } else if (codigo >= 21 && codigo <= 30) {
            precoUnitario = 20.00;
        } else if (codigo >= 31 && codigo <= 40) {
            precoUnitario = 40.00;
        } else {
            System.out.println("Código inválido! O código deve ser entre 1 e 40.");
            return;
        }

        double precoTotal = precoUnitario * quantidade;
        
        double desconto = 0.0;
        
        if (precoTotal <= 100) {
            desconto = precoTotal * 0.05;
        } else if (precoTotal <= 200) {
            desconto = precoTotal * 0.10;
        } else {
            desconto = precoTotal * 0.15;
        }
        
        double precoFinal = precoTotal - desconto;
        
        System.out.printf("Preço unitário: R$ %.2f\n", precoUnitario);
        System.out.printf("Preço total: R$ %.2f\n", precoTotal);
        System.out.printf("Desconto: R$ %.2f\n", desconto);
        System.out.printf("Preço final com desconto: R$ %.2f\n", precoFinal);
        
        scanner.close();
    }
}
