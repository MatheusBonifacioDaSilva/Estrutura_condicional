import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sexo;
        double altura, pesoIdeal;

        System.out.print("Digite 1 para homem e 2 para mulher: ");
        sexo = sc.nextInt();

        System.out.print("Digite a altura: ");
        altura = sc.nextDouble();

        if (sexo == 1) {
            pesoIdeal = (72.7 * altura) - 58;
            System.out.println("Peso ideal: " + pesoIdeal);
        } else if (sexo == 2) {
            pesoIdeal = (62.1 * altura) - 44.7;
            System.out.println("Peso ideal: " + pesoIdeal);
        } else {
            System.out.println("Sexo inválido.");
        }

        sc.close();
    }
}
