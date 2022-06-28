package ListaB;

import java.util.Scanner;

public class SomaNumerosPositivos {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
            System.out.println("Digite a quantidade de números: ");
            int quantidade = input.nextInt();
            int soma = 0;
            for (int i = 0; i < quantidade; i++){
                System.out.println((i+1) + "º Número:");
                int resultado = input.nextInt();
                while ((resultado < 0)){
                    System.out.println("Valor inválido, por favor digite novamente.");
                    resultado = input.nextInt();
                }
                soma += resultado;
            }
            System.out.println("A soma dos valores é: " + soma);
            input.close();
        }
    }
