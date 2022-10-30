package teste1;

import java.util.Arrays;
import java.util.Scanner;

public class Testa1 {

	public static void main(String[] args) {
		
		int[] numeros = new int[10];
		Scanner mat = new Scanner(System.in);
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite o " +i+ "  numero -> ");
			numeros[i] = mat.nextInt();	
		} 
		Arrays.sort(numeros);
		for(int i = 0; i < numeros.length; i++) {
		System.out.println("Sequencia dos numeros -> "+numeros[i]);
		}
	}
}

