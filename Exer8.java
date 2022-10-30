package teste1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Testa1 {

	public static void main(String[] args) {
		Scanner mat = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("00.00");
		
		int limiteLinha = 2;
		int limiteColuna = 5;
		
		double[][] matriz = new double[limiteLinha][limiteColuna];

		for (int linha = 0; linha < limiteLinha; linha++) {
			for (int coluna = 0; coluna < limiteColuna; coluna++) {
				System.out.print("Informe os numeros -> ");
				matriz[linha][coluna] = mat.nextDouble();
			}

		}
		
		System.out.print("\n");
		System.out.print("-----------------------------------------");
		System.out.print("\n");
		for (int linha = 0; linha <limiteLinha; linha++) {
			System.out.print("| ");
			for (int coluna = 0; coluna < limiteColuna; coluna++) {
				System.out.print( df.format(matriz[linha][coluna]) + " | ");
			}			
			System.out.print("\n");
		}
		System.out.print("-----------------------------------------");
	}
}