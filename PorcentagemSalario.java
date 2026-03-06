/* dado um determinado salario, se o salario for maior que 4500 imprima 30% do valor, senão imprima 15% do valor */

public class PorcentagemSalario{
	
public static void main (String []args) {
	float salario = 2500;
	String porcentagem = "";
	float resultado;
	if(salario >= 4500) {
		resultado = (float) (0.3*salario);
		porcentagem = "30%";
	}
	else {
		resultado = (float) (0.15*salario);
		porcentagem = "15%";
	}
	System.out.println("O valor da porcentagem é de: "+porcentagem+" e o resultado final é de: "+resultado);
	}
}