import java.util.Scanner;

public class SistemaAlistamento {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o seu sexo (M ou F): ");
		String sexo = teclado.next();
		System.out.println("Agora digite a sua idade: ");
		int idade = teclado.nextInt();
		if(idade >= 18  && sexo.equalsIgnoreCase("m")) {
			System.out.println("Alistamento obrigatorio");
		}
		else if(idade >= 18 && sexo.equalsIgnoreCase("f")) {
			System.out.println("Deseja se alistar?");
		}
		else {
			System.out.println("Alistamento nao permitido");
		}
		 teclado.close();
	}
}
