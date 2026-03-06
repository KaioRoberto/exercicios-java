public class ImpostoDeRenda {
	public static void main(String[] args) {
		double salario = 1085D;
		if(salario <= 2112) {
			System.out.println("Isento " + salario);
		}
		else if(salario >= 2112.01 && salario <= 3751.06) {
			System.out.println("7,5% " + (salario * 0.075));
		}
		else if(salario >= 2826.67 && salario <= 3751.06) {
			System.out.println("15% " +(salario * 0.15));
		}
		else if(salario >= 3751.07 && salario <= 4664.68) {
			System.out.println("22,5% " + (salario * 0.225));
		}
		else {
			System.out.println("27,5% " + (salario * 0.275));
		}
	}
}
