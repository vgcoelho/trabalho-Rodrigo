package exercicio4;

public class Exer4 {

	public static void main(String[] args) {
		int[] goku = new int[] {1,2,3,4,5,6,7,8,9,10};
		int par = 0;
		int impar = 0;
		
		for(int i = 0; i < goku.length; i++) {
			if(goku[i] %2 == 0) {
				par++;
			}else {
				impar++;
			}
		}
		impar=impar*1000/100;
		par=par*1000/100;
		System.out.println(par+"% de numeros pares e "+impar+"% de numeros impares. ");

	}

}
