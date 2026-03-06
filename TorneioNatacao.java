import java.util.Scanner;

public class TorneioNatacao {
	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	System.out.println("Digite o seu nome: ");
	String nome = teclado.next();
	System.out.println("Digite a sua idade");
	int idade = teclado.nextInt();
	if(idade <=10) {
		System.out.println(nome + " ira participar da categoria infantil") ;
	}
	else if(idade >= 11 && idade <= 15) {
		System.out.println(nome + " ira participar da categoria juvenil");
	}
	else if(idade >=16 && idade <= 19) {
		System.out.println(nome + " ira participar da categoria pre-adulto");
	}
	else {
		System.out.println(nome + " ira participar da categoria adulto");
		}
	teclado.close();
	}
}
