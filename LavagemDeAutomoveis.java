/* Exercicio solicitando opçoes de lavagem simples, completa e com forma de pagamento em dinheiro ou em cartao */

import java.util.Scanner;

public class LavagemDeAutomoveis {
   public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Seja bem vindo ao Lava-Jato, nos possuimos as seguintes opçoes, escolha de acordo com o que preferir:\n1 - Lavagem simples \n2 - Lavagem completa (Inclui Polimento)");
    int tipodeLavagem = scanner.nextInt();
        if(tipodeLavagem == 1){
            System.out.println("Voce escolheu lavagem simples, agora selecione seu meio de pagamento: \n1 -  A vista R$30\n2 - No cartao: R$35");
            int tipodePagamento = scanner.nextInt();
                if(tipodePagamento == 1){
                    System.out.println("Voce escolheu pagamento a vista, obrigado por usar nosso serviço!");
                }
                else{
                    System.out.println("Voce escolheu pagamento no cartao, obrigado por usar nosso serviço!");
                }
        }
        else{
            System.out.println("Voce escolheu lavagem completa, agora selecione seu meio de pagamento: \n1 -  A vista R$50\n2 - No cartao: R$55");
            int tipodePagamento = scanner.nextInt();
            if(tipodePagamento == 1){
                System.out.println("Voce escolheu pagamento a vista, obrigado por usar nosso serviço!");
            }
            else{
                System.out.println("Voce escolheu pagamento no cartao, obrigado por usar nosso serviço!");
            }
        }
   }
}
