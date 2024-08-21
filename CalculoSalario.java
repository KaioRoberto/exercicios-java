
/* Calculo de Salario com base em porcentagem com leitura de Input */

import java.util.Scanner;

public class CalculoSalario {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu salario: ");
        double salarioAntigo = scanner.nextDouble();

        System.out.println("Digite o valor da porcentagem: ");
        int porcentagem = scanner.nextInt();

        double aumento = salarioAntigo * porcentagem / 100.0;
        double salarioNovo = salarioAntigo + (long) aumento;

        System.out.println("Seu salario atual e de: " + salarioNovo);

        scanner.close();
    }
}
