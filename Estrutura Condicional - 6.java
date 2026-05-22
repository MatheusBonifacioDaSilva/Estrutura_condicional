import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double peso, altura, imc;

        System.out.print("Digite o peso (kg): ");
        peso = sc.nextDouble();

        System.out.print("Digite a altura (m): ");
        altura = sc.nextDouble();

        imc = peso / (altura * altura);

        System.out.println("IMC: " + imc);

        if (imc < 20) {
            System.out.println("Abaixo do peso");
        } else if (imc < 25) {
            System.out.println("Peso normal");
        } else if (imc < 30) {
            System.out.println("Sobrepeso");
        } else if (imc < 40) {
            System.out.println("Obeso");
        } else {
            System.out.println("Obeso mórbido");
        }

        sc.close();
    }
}
