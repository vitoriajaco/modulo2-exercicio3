package ListaB;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenorNumeroMaiorNumero {
    public static void main(String[] args) {

        int quantidadeDeNumeros = 10;
        List<Integer> numeros = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite o numero " + (i) + ":");
            Scanner input = new Scanner(System.in);
            numeros.add(input.nextInt());

        }

        int menorNumero = 0;
        int maiorNumero = Integer.MAX_VALUE;

        for (int i = 0; i < quantidadeDeNumeros; i++ ){
             if (numeros.get(i) > maiorNumero) {
                 maiorNumero = numeros.get(i);
             }
             if (numeros.get(i) < menorNumero) {
              menorNumero = numeros.get(i);
            }

    }
        System.out.println("O maior numero digitado foi: " + maiorNumero);
        System.out.println("O menor numero digitado foi: " + menorNumero);

        }
}
