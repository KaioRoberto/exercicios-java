/* Calculo de jornada semanal de trabalho e horas extras */

import java.util.Scanner;

public class JornadaDeTrabalho {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite as horas trabalhadas no mes: ");
        int horasTrabalhadas = scanner.nextInt();
    System.out.println("Digite o valor do salario por hora: ");
        int valorHora = scanner.nextInt();
            if(horasTrabalhadas > 160){
            int horasExtras = horasTrabalhadas - 160;
            double salarioTotal = 160 * valorHora + horasExtras * 1.5 * valorHora;
            System.out.println("Seu salario e de: " + salarioTotal);
            }
            else{
                double salarioTotal = 160 * horasTrabalhadas;
                System.out.println("Seu salario e de: " + salarioTotal);
            }
    }
}
