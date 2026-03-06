package application;
import java.util.Scanner;
import entities.Student;



public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student stu = new Student();
        stu.nome = sc.nextLine();
        stu.nota1 = sc.nextDouble();
        stu.nota2 = sc.nextDouble();
        stu.nota3 = sc.nextDouble();
        System.out.println(stu.pontuacao());

        }
    }
