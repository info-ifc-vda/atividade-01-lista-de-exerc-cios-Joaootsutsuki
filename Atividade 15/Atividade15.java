import java.util.Scanner;

public class Atividade15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[7][7];
        int[] maiorPorLinha = new int[7];
        int[] menorPorColuna = new int[7];

        System.out.println("Digite os elementos da matriz 7x7:");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.printf("Elemento [%d][%d]: ", i, j);
                matriz[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 7; i++) {
            int maior = matriz[i][0];
            for (int j = 1; j < 7; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
            maiorPorLinha[i] = maior;
        }

        for (int j = 0; j < 7; j++) {
            int menor = matriz[0][j];
            for (int i = 1; i < 7; i++) {
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
            menorPorColuna[j] = menor;
        }

        System.out.println("\nMatriz 7x7:");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nMaior elemento de cada linha:");
        for (int i = 0; i < 7; i++) {
            System.out.print(maiorPorLinha[i] + " ");
        }

        System.out.println("\n\nMenor elemento de cada coluna:");
        for (int j = 0; j < 7; j++) {
            System.out.print(menorPorColuna[j] + " ");
        }

        scanner.close();
    }
}
