package ListaB;

import java.util.Scanner;

public class MediaNumeros {
    public static void main(String[] args) {
        System.out.println("Quantos numeros você deseja inserir: ");
        Scanner input = new Scanner(System.in);
        int quantidade = input.nextInt();


        int  soma = 0;
        for (int i=1; i <= quantidade; i++) {
            System.out.println("Digite o valor " + i +" :");
            Scanner input2 = new Scanner(System.in);
            int valor = input2.nextInt();

        }
        System.out.println("A média é: " + (soma/quantidade));

    }
}
