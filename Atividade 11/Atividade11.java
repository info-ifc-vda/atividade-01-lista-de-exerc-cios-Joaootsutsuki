import java.util.Scanner;

public class Atividade11 {
    
    public static void exibirCabecalho() {
        System.out.println("Valor    |   Cubo    |   Raiz Quadrada");
        System.out.println("-----------------------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int contador = 0;
        
        while (true) {
            System.out.print("Digite um número (negativo ou 0 para encerrar): ");
            double numero = scanner.nextDouble();
            
            if (numero <= 0) {
                break;
            }
            
            if (contador % 20 == 0) {
                exibirCabecalho();
            }

            double cubo = Math.pow(numero, 3);
            double raizQuadrada = Math.sqrt(numero);

            System.out.printf("%.2f   |   %.2f   |   %.2f\n", numero, cubo, raizQuadrada);

            contador++;
        }

        scanner.close();
    }
}
