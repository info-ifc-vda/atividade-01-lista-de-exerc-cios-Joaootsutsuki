import java.util.Scanner;

public class Atividade12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] vetorNaoComum = new int[20];
        int index = 0;
        
        System.out.println("Digite os 10 números para o primeiro vetor:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            vetor1[i] = scanner.nextInt();
        }
        
        System.out.println("Digite os 10 números para o segundo vetor:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            vetor2[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < 10; i++) {
            boolean comum = false;
            for (int j = 0; j < 10; j++) {
                if (vetor1[i] == vetor2[j]) {
                    comum = true;
                    break;
                }
            }
            if (!comum) {
                vetorNaoComum[index++] = vetor1[i];
            }
        }
        
        for (int i = 0; i < 10; i++) {
            boolean comum = false;
            for (int j = 0; j < 10; j++) {
                if (vetor2[i] == vetor1[j]) {
                    comum = true;
                    break;
                }
            }
            if (!comum) {
                vetorNaoComum[index++] = vetor2[i];
            }
        }

        System.out.println("Vetor de números não comuns aos vetores:");
        for (int i = 0; i < index; i++) {
            System.out.print(vetorNaoComum[i] + " ");
        }
        System.out.println();
        
        scanner.close();
    }
}
