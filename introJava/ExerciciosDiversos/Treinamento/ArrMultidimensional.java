package treinamento.com;

import java.util.Random;

public class ArrMultidimensional {

	public static void main(String[] args) {
		Random random = new Random();
		
		int[][] matriz = new int[4][4];
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
			matriz[i][j] = random.nextInt(9);
			//random ate n�mero 9
			}
		}
 
		for(int[] linha : matriz) {
			for (int coluna : linha) {
				//imprime a linha 
				System.out.print(coluna + " ");
			}
			System.out.println(" ");//pula linha
		}
	}
}