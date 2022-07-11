package Treinamento;

import java.util.Scanner;

/*
Crie um sistema que calcule a m�dia das notas de 10 alunos
Cada aluno ter� 3 notas, calcule a m�dia entre elas.
Diga quais alunos est�o aprovados ou reprovados
Pra ser reprovado a nota tem que ser menor que 6
E pra ser aprovado a nota deve ser maior que 6
 */

public class MediasAlunos {
	public static void main(String[] args) {

		double[] notas = new double[3];
		double media = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println("MÉDIA DE 10 ALUNOS");
		for (int i = 1; i <= 10; i++) {
			System.out.println("");
			System.out.print("Informe o nome do aluno(a) " + i + ": ");
			String nomes = scan.nextLine();
			

				double soma = 0;
				for (int j = 1; j <= 3; j++) {
					System.out.print(j + "° Nota do Aluno(a) " + nomes+ ": ");
					notas[i] = scan.nextInt();
					soma = soma + notas[i];
					scan.nextLine();
	
					if (notas[i] > 10 || notas[i] < 0) {
						System.err.println("Nota Inválida, digite uma nota de 0 a 10!");
						notas[i] = scan.nextDouble();
						

					scan.close();
					
				}
			}
			media = soma / 3;
			System.out.printf("A média do aluno(a) " + nomes + " é %.2f", media);
			System.out.println("");
			if (media < 6) {
				System.out.println(nomes + " REPROVADO(A)!");
			} else {
				System.out.println(nomes + " APROVADO(A)!");

			}
		}
	}
}
