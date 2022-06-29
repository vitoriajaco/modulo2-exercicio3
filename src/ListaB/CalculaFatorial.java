package ListaB;

import java.util.Scanner;

public class CalculaFatorial {
    public static void main(String[] args) {
        System.out.println("Insira um numero inteiro: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

       int fat = 0;
        for(fat = 1; n > 1; n = n - 1)
        {
            fat = fat * n;
        }
        System.out.println("O fatorial é: " + fat);

    }

}
