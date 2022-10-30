package exercicio01;

public class Exer01 {

	public static void main(String[] args) {

		int vetorA[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int vetorB[] = new int[10];
		int result;

		for (int cont = 0; cont < 10; cont++) {
			result = vetorA[cont] * cont;
			vetorB[cont] = result;

		}
		for (int cont = 0; cont < 10; cont++) {
			System.out.print("[" + vetorB[cont] + "]");
		}
	}
}
