package treinamento.com;

import java.util.Scanner;

public class arrayConsoantes {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		String[] consoantesDigitadas = new String[5];
		int i = 0; 
		do {
			System.out.print("Digite a letra: ");
			String letra = scan.next();
			
			if (!(letra.equalsIgnoreCase("a")||
					letra.equalsIgnoreCase("e")||
					letra.equalsIgnoreCase("i")||
					letra.equalsIgnoreCase("o")||
					letra.equalsIgnoreCase("u")
					)) {
			consoantesDigitadas[i] = letra;
			}
			i++;
			
		}while(i < consoantesDigitadas.length);
		
		System.out.println("");
		System.out.println("Consoantes:");
		for(String cadaConsoante : consoantesDigitadas ) {
			
			if(cadaConsoante != null) {
			System.out.print(cadaConsoante + " ");
		}
	  }
	}
 }