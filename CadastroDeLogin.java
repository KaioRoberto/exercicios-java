import java.util.Scanner;

public class CadastroDeLogin {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o seu nome de usuario: ");
		String usuario = teclado.next();
		if(usuario.isEmpty() || usuario.equalsIgnoreCase("admin") || usuario.equalsIgnoreCase("administrador")) {
			System.out.println("Usuario invalido");
		}
		else {
			System.out.println(usuario + " cadastro com sucesso");
		}
		teclado.close();
	}
}
