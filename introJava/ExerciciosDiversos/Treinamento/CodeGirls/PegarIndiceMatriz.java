package CodeGirls;

import java.util.Scanner;

public class PegarIndiceMatriz {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String[] nomes = new String[5];
		{

			for (int i = 0; i < nomes.length; i++) {
				System.out.println("Digite o nome");
				nomes[i] = input.nextLine();
			}
			System.out.println("Digite o indice");
			int indice = input.nextInt();
			System.out.println(nomes[indice]);
			input.close();
		}
	}
}
