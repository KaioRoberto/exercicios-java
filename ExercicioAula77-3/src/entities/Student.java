package entities;

public class Student {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    public double pontuacao(){
        double notaFinal = nota1 + nota2 + nota3;
        if (notaFinal >= 60) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.println(90 - notaFinal);
        }
        return notaFinal;
    }
}