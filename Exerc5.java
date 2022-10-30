package exercicio5;

import java.util.Scanner;

public class Exerc5 {

	public static void main(String[] args) {

		double Nota1[] = new double[10];
		double Nota2[] = new double[10];
		double Result[] = new double[10];
		Scanner mat = new Scanner(System.in);
		
		for (int nota = 0; nota < Nota1.length; nota++) {
			System.out.print("informe a primeira nota do aluno " + (nota + 1) + "-> ");
			Nota1[nota] = mat.nextDouble();
			System.out.print("informe a segunda nota do aluno " + (nota + 1) + "-> ");
			Nota2[nota] = mat.nextDouble();
			Result[nota] = Nota1[nota] + Nota2[nota];
		}
		for (int nota = 0; nota < 10; nota++) {
			Result[nota] = Result[nota] / 2;
			if (Result[nota] >= 7) {
				System.out.println("aluno " + (nota + 1) + "-> media " + Result[nota]+" -> Aprovado!");
			} else {
				System.out.println("aluno " + (nota + 1) + "-> media " + Result[nota]+" -> Reprovado!");
			}
		}
	}
}