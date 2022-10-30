package exercicio02;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		Scanner mat = new Scanner(System.in);
				
			int vetA[] = new int[] {10,20,30,40,50,60,70,80,90,100};
			int vetB[] = new int[] {1,2,3,4,5,6,7,8,9,10};
			int result[] = new int[10];	
				
			for (int x=0; x < 10; x++) {
				result[x] = vetA[x] + vetB[x];
				System.out.print("["+result[x]+"]");
		}
	}
}
		
