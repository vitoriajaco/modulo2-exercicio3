import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
        System.out.println("Digite um numero inteiro:");
        int primeiroNumero = input.nextInt();
        System.out.println("Digite um segundo numero");
        int segundoNumero = input.nextInt();

        if (primeiroNumero > segundoNumero)
            System.out.println("O maior numero é " + primeiroNumero);
        else
            System.out.println("O maior numero é " + segundoNumero);

    }
}
