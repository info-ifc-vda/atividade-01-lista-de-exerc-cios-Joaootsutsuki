import java.util.Scanner;

public class Atividade13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor1 = new int[10];
        int[] vetor2 = new int[5];
        
        int[] vetorResultante1 = new int[10];
        int[] vetorResultante2 = new int[10];
        
        System.out.println("Digite os 10 números para o primeiro vetor:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            vetor1[i] = scanner.nextInt();
        }
        
        System.out.println("Digite os 5 números para o segundo vetor:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            vetor2[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < 10; i++) {
            if (vetor1[i] % 2 == 0) {
                int soma = 0;
                for (int j = 0; j < 5; j++) {
                    soma += vetor2[j];
                }
                vetorResultante1[i] = vetor1[i] + soma;
            } else {
                vetorResultante1[i] = 0;
            }
        }
        
        for (int i = 0; i < 10; i++) {
            if (vetor1[i] % 2 != 0) {
                int contadorDivisores = 0;
                for (int j = 0; j < 5; j++) {
                    if (vetor1[i] % vetor2[j] == 0) {
                        contadorDivisores++;
                    }
                }
                vetorResultante2[i] = contadorDivisores;
            } else {
                vetorResultante2[i] = 0;
            }
        }
        
        System.out.println("\nPrimeiro vetor resultante (soma de números pares e soma do segundo vetor):");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetorResultante1[i] + " ");
        }
        
        System.out.println("\nSegundo vetor resultante (quantidade de divisores dos números ímpares):");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetorResultante2[i] + " ");
        }
        
        scanner.close();
    }
}
