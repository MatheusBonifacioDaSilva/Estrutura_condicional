import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade;

        System.out.print("Digite a idade: ");
        idade = sc.nextInt();

        if (idade < 16) {
            System.out.println("Não eleitor");
        } else if ((idade >= 16 && idade < 18) || idade >= 65) {
            System.out.println("Eleitor facultativo");
        } else {
            System.out.println("Eleitor obrigatório");
        }

        sc.close();
    }
}
