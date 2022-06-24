import java.util.Scanner;

public class MelhorProduto {
    public static void main(String[] args) {
        System.out.println("Informe o preço do primeiro produto");
        Scanner input = new Scanner(System.in);
        double primeiroProduto = input.nextDouble();

        System.out.println("Informe o preço do segundo produto");
        Scanner input2 = new Scanner(System.in);
        double segundoProduto = input2.nextDouble();

        System.out.println("Informe o preço do terceiro produto");
        Scanner input3 = new Scanner(System.in);
        double terceiroProduto = input3.nextDouble();

        input.close();

         if ( primeiroProduto > segundoProduto && terceiroProduto < primeiroProduto)
            System.out.println("Escolha o produto de valor: " + primeiroProduto);
        else if (segundoProduto < primeiroProduto && terceiroProduto < segundoProduto) {
            System.out.println("Escolha o produto de valor: ") + segundoProduto;






    }
}
