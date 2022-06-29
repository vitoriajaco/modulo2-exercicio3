package ListaB;

import java.util.Scanner;

public class CinquentaImpares {
    public static void main(String[] args) {


        int valorSoma = 0;
        for ( int i = 1; i <= 50; i++) {
            if ( i % 2== 1); {
                valorSoma += i;

            }

        }
        System.out.println(valorSoma);

        System.exit(1);



    }
}
