package exercicio3;

public class Ex3 {

	public static void main(String[] args) {
		
		int vetor[] = new int[] {5,7,9,17,20,10,77,2,16,50};
		int soma = 0;
		
		for(int cont = 0; cont < vetor.length; cont++) {
			soma = soma + vetor[cont];
			
		}
		System.out.println("A soma do vetor é -> " +soma);
	}
}
