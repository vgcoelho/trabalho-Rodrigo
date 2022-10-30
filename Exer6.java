package exercicio6;

import java.util.Scanner;

public class Exer6 {

	public static void main(String[] args) {
		
		int valorlimite = 6;
		int[] vetorA = new int[valorlimite];
		int[] vetorB = new int[valorlimite];
		Scanner mat = new Scanner(System.in);
		
		for (int cont = 0; cont < valorlimite; cont++) {
			System.out.print("Informe alguns valores -> ");
			vetorA[cont] = mat.nextInt();
			if (vetorA[cont] %2 == 0) {
				vetorB[cont] = 1;
			}else {
				vetorB[cont] = 0;	
			}
		}
		for (int cont = 0; cont < valorlimite; cont++) {
		System.out.println("Vetor A -> ["+vetorA[cont]+"]"+"Vetor B -> ["+vetorB[cont]+"]");
		}
	}
}
