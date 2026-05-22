import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salario, novoSalario;

        System.out.print("Digite o salário: ");
        salario = sc.nextDouble();

        if (salario < 1000) {
            novoSalario = salario * 1.30;
            System.out.println("Novo salário: R$ " + novoSalario);
        } else {
            System.out.println("Funcionário não tem direito ao aumento.");
        }

        sc.close();
    }
}
