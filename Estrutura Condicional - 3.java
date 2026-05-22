import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1, n2, n3, media;

        System.out.print("Digite a primeira nota: ");
        n1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        n2 = sc.nextDouble();

        System.out.print("Digite a terceira nota: ");
        n3 = sc.nextDouble();

        media = (n1 + n2 + n3) / 3;

        System.out.println("Média: " + media);

        if (media >= 0 && media < 3) {
            System.out.println("REPROVADO");
        } else if (media >= 3 && media < 7) {
            System.out.println("EXAME");
        } else if (media >= 7 && media <= 10) {
            System.out.println("APROVADO");
        } else {
            System.out.println("Média inválida");
        }

        sc.close();
    }
}
