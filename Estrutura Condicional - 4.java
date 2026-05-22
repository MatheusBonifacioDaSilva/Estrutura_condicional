import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x, y, z;

        System.out.print("Digite o valor de X: ");
        x = sc.nextDouble();

        System.out.print("Digite o valor de Y: ");
        y = sc.nextDouble();

        System.out.print("Digite o valor de Z: ");
        z = sc.nextDouble();

        if (x < y + z && y < x + z && z < x + y) {
            System.out.println("Os valores formam um triângulo.");
        } else {
            System.out.println("Os valores NÃO formam um triângulo.");
        }

        sc.close();
    }
}
