import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade;

        System.out.print("Digite a idade: ");
        idade = sc.nextInt();

        if (idade <= 7) {
            System.out.println("INFANTIL");
        } else if (idade <= 10) {
            System.out.println("JUVENIL");
        } else if (idade <= 15) {
            System.out.println("ADOLESCENTE");
        } else if (idade <= 30) {
            System.out.println("ADULTO");
        } else {
            System.out.println("SENIOR");
        }

        sc.close();
    }
}
