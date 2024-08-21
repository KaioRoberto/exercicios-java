
/* Exercicio sobre custos de maça se forem compradas a menos de uma duzia e caso forem compradas pelo menos 12 unidades */
import java.util.Scanner;

public class CalculoMaca {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de maças, caso compre 12 cada uma custara R$1,00, caso compre menos de 12, custara R$1,30: ");

        int quantidadeMaca = scanner.nextInt();

        if (quantidadeMaca >= 12){
           int valorMaca = quantidadeMaca;
            System.out.println("O valor das maças foram: R$" + valorMaca);
        }
        else{
            double valorMaca = 1.3 * quantidadeMaca;
            System.out.println("O valor das maças foram: R$" + valorMaca);
        }

    }
}
