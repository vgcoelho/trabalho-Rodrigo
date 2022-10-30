package exercicio10;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc10 {

	public static void main(String[] args) {

		int limiteLinha = 3;
		int limiteColuna = 3;
		int[][] M = new int[limiteLinha][limiteColuna];
		int quantPar = 0;
		int quantImpar = 0;
		Scanner mat = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("00.00");

		for (int linha = 0; linha < limiteLinha; linha++) {
			for (int coluna = 0; coluna < limiteColuna; coluna++) {
				System.out.print("Informe alguns numeros -> ");
				M[linha][coluna] = mat.nextInt();

			}
		}
		System.out.print("\n");
		System.out.print("-------------------------");
		System.out.print("\n");
		for (int linha = 0; linha < limiteLinha; linha++) {
			System.out.print("| ");
			for (int coluna = 0; coluna < limiteColuna; coluna++) {
				if (M[linha][coluna] % 2 == 0) {
					quantPar++;
				} else {
					quantImpar++;
				}
				System.out.print(df.format(M[linha][coluna]) + " | ");
			}
			System.out.print("\n");
		}
		System.out.println("-------------------------");
		System.out.print(quantPar + " numeros pares e " + quantImpar + " numeros impares. ");
	}

}
