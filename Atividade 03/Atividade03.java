import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro ângulo: ");
        double angulo1 = scanner.nextDouble();
        
        System.out.print("Digite o segundo ângulo: ");
        double angulo2 = scanner.nextDouble();
        
        System.out.print("Digite o terceiro ângulo: ");
        double angulo3 = scanner.nextDouble();
        
        System.out.print("Digite o primeiro lado: ");
        double lado1 = scanner.nextDouble();
        
        System.out.print("Digite o segundo lado: ");
        double lado2 = scanner.nextDouble();
        
        System.out.print("Digite o terceiro lado: ");
        double lado3 = scanner.nextDouble();
        
        String tipoAngulo = "";
        if (angulo1 == 90 || angulo2 == 90 || angulo3 == 90) {
            tipoAngulo = "Retângulo";
        } else if (angulo1 > 90 || angulo2 > 90 || angulo3 > 90) {
            tipoAngulo = "Obtusângulo";
        } else {
            tipoAngulo = "Acutângulo";
        }
        
        String tipoLado = "";
        if (lado1 == lado2 && lado2 == lado3) {
            tipoLado = "Equilátero";
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            tipoLado = "Isósceles";
        } else {
            tipoLado = "Escaleno";
        }
        
        System.out.println("Classificação com base nos ângulos: " + tipoAngulo);
        System.out.println("Classificação com base nos lados: " + tipoLado);
        
        scanner.close();
    }
}
