package ListaB;

import java.util.Scanner;

public class SomaNumerosImpares {
    public static void main(String[] args) {

        System.out.println("Insira o valor inicial: ");
        Scanner input = new Scanner(System.in);
        int numeroInicial = input.nextInt();

        System.out.println("Insira o valor final: ");
        Scanner input2 = new Scanner(System.in);
        int numeroFinal = input.nextInt();


        if (numeroInicial > numeroFinal) {
            System.out.println("Intervalo de valores invalido");
            System.exit(1);
        }
       int valorSoma = 0;
        for (int i = numeroInicial; i <= numeroFinal; i++) {

            if (i % 2 != 0){
                valorSoma = valorSoma + i;
            }
        }
        System.out.println("Valor soma final: " + valorSoma );




    }
}
