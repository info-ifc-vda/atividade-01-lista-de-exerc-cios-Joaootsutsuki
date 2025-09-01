import java.util.Scanner;

public class Atividade10 {
    
    public static boolean isPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int quantidadePrimos = 0;
        System.out.println("Digite 10 números inteiros:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            
            if (isPrimo(numero)) {
                quantidadePrimos++;
            }
        }

        System.out.println("A quantidade de números primos digitados é: " + quantidadePrimos);
        
        scanner.close();
    }
}
