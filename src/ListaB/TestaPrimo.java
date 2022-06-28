package ListaB;

import java.util.Scanner;

public class TestaPrimo {
    public static void main(String[] args) {

        System.out.println("Insira um número para saber se ele é primo");
        Scanner input = new Scanner(System.in);
        int testaPrimo = input.nextInt();

        for (int i=2; i<testaPrimo; i++)
            if (testaPrimo % i== 0) {
                System.out.println("Não é primo!");
                System.exit(1);
            }
        System.out.println("É primo!!");

              }


    }
