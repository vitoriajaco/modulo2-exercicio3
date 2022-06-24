import java.util.Scanner;

public class NotasAluno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        double nota1 = input.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = input.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media < 7)
            System.out.println("Você foi Reprovado!");
        else if (media > 7)
            System.out.println("Você foi Aprovado");



    }


    }










