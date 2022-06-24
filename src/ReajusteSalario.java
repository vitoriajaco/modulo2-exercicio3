import java.util.Scanner;

public class ReajusteSalario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    System.out.println("Informe o seu salario: ");
    double salario = input.nextDouble();
    double reajuste, valorDoAumento, novoSalario;


    if  (salario <= 280) {
        reajuste = 20;
    } else if (salario <= 700) {
        reajuste = 15;
    } else if (salario <= 1500) {
        reajuste = 10;
    } else {
        reajuste = 5;
    }

    valorDoAumento = (salario * reajuste) / 100;
    novoSalario = salario + valorDoAumento;

    System.out.println("O salario antes do reajuste R$: " + salario);
    System.out.println("O reajuste foi de " + reajuste + "%");
    System.out.println("O aumento foi de R$: " + valorDoAumento);
    System.out.println("Seu novo salário é R$" + novoSalario);


    }

    }

