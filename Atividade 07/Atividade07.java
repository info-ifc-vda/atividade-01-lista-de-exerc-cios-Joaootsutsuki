import java.util.Scanner;

public class Atividade07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número (início do intervalo): ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Digite o segundo número (fim do intervalo): ");
        int numero2 = scanner.nextInt();
        
        int inicio = Math.min(numero1, numero2);
        int fim = Math.max(numero1, numero2);
        
        for (int i = inicio; i <= fim; i++) {
            long fatorial = 1;
            
            for (int j = 1; j <= i; j++) {
                fatorial *= j;
            }
            
            System.out.printf("O fatorial de %d é %d\n", i, fatorial);
        }
        
        scanner.close();
    }
}
