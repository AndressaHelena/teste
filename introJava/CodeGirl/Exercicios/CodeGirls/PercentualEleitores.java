package CodeGirls;

import java.util.Scanner;

public class PercentualEleitores {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite o número de habitantes: ");
		int habitantes = input.nextInt();
		System.out.print("Digite número de votos brancos: ");
		int brancos = input.nextInt();
		System.out.print("Digite número de votos nulos: ");
		int nulos = input.nextInt();
		System.out.print("Digite número de votos válidos: ");
		int validos = input.nextInt();

		int porcentagemBrancos = (brancos * 100) / habitantes;
		int porcentagemNulos = (nulos * 100) / habitantes;
		int porcentagemValidos = (validos * 100) / habitantes;

		System.out.println("Brancos: " + porcentagemBrancos + "%");
		System.out.println("Nulos: " + porcentagemNulos + "%");
		System.out.println("Validos: " + porcentagemValidos + "%");
		input.close();
	}
}
