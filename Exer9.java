package exercicio9;

import java.util.Random;

public class Exer9 {

	public static void main(String[] args) {

		Random aleatorio = new Random();
		int max = 0;
		int min = 10;
		String posicao = "";

		 int limiteLinha = 4;
		 int limiteColuna = 4;

		int M[][] = new int[limiteLinha][limiteColuna];

		for (int linha = 0; linha < limiteLinha; linha++) {
			for (int coluna = 0; coluna < limiteColuna; coluna++) {
				M[linha][coluna] = aleatorio.nextInt(9);
			}
		}
		for (int linha = 0; linha < limiteLinha; linha++) {
			for (int coluna = 0; coluna < limiteColuna; coluna++) {
				if (M[linha][coluna] > max) {
					max = M[linha][coluna];
					posicao = " Linha:" + (linha + 1) + " - Coluna:" + (coluna + 1);
				} else if (M[linha][coluna] < min) {
					min = M[linha][coluna];
				}
			}
		}
		for (int linha = 0; linha < limiteLinha; linha++) {
			System.out.print(" | ");
			for (int coluna = 0; coluna < limiteColuna; coluna++) {
				System.out.print(M[linha][coluna] + " | ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		System.out.println("O maior numero e ->  " + max);
		System.out.println("Esta na posicao ->  " + posicao);
	}
}
