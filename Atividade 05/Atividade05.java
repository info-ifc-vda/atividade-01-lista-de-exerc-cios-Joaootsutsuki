import java.util.Scanner;

public class Atividade05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalJogadoresMenor18 = 0;
        double somaIdades = 0;
        double somaAlturas = 0;
        int jogadoresAcima80kg = 0;
        
        double precoTotal = 0;
        
        for (int time = 1; time <= 5; time++) {
            double somaIdadeTime = 0;
            int jogadoresNoTimeAcima80kg = 0;
            
            System.out.println("Time " + time);
            for (int jogador = 1; jogador <= 11; jogador++) {
                System.out.println("Jogador " + jogador);

                // Leitura de dados do jogador
                System.out.print("Digite a idade do jogador: ");
                int idade = scanner.nextInt();
                System.out.print("Digite o peso do jogador (kg): ");
                double peso = scanner.nextDouble();
                System.out.print("Digite a altura do jogador (em metros): ");
                double altura = scanner.nextDouble();
                
                somaIdades += idade;
                somaAlturas += altura;
                
                if (idade < 18) {
                    totalJogadoresMenor18++;
                }
                
                if (peso > 80) {
                    jogadoresAcima80kg++;
                    jogadoresNoTimeAcima80kg++;
                }

                precoTotal += 10.00;
                
                somaIdadeTime += idade;
            }

            double mediaIdadeTime = somaIdadeTime / 11;
            System.out.printf("Média das idades do time %d: %.2f\n", time, mediaIdadeTime);
        }

        double mediaIdadeCampeonato = somaIdades / (5 * 11);
        
        double mediaAlturaCampeonato = somaAlturas / (5 * 11);

        double desconto = 0;
        if (precoTotal <= 250) {
            desconto = precoTotal * 0.05;
        } else if (precoTotal <= 500) {
            desconto = precoTotal * 0.10;
        } else {
            desconto = precoTotal * 0.15;
        }

        double precoFinal = precoTotal - desconto;

        System.out.printf("Média das idades de todos os jogadores: %.2f\n", mediaIdadeCampeonato);
        System.out.printf("Média das alturas de todos os jogadores: %.2f\n", mediaAlturaCampeonato);
        System.out.printf("Quantidade de jogadores com idade inferior a 18 anos: %d\n", totalJogadoresMenor18);
        System.out.printf("Porcentagem de jogadores com mais de 80kg: %.2f%%\n", (double) jogadoresAcima80kg / (5 * 11) * 100);
        System.out.printf("Preço total: R$ %.2f\n", precoTotal);
        System.out.printf("Desconto aplicado: R$ %.2f\n", desconto);
        System.out.printf("Preço final após desconto: R$ %.2f\n", precoFinal);

        scanner.close();
    }
}
