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

		System.out.println("M�DIA DE 10 ALUNOS");
		for (int i = 1; i <= 10; i++) {
			System.out.println("");
			System.out.print("Informe o nome do aluno " + i + ": ");
			String nomes = scan.nextLine();

				double soma = 0;
				for (int j = 1; j <= 3; j++) {
					System.out.print(j + "� Nota do Aluno " + i + ": ");
					notas[i] = scan.nextInt();
					soma = soma + notas[i];
	
					if (notas[i] > 10 || notas[i] < 0) {
						System.err.println("Nota Inv�lida, digite uma nota de 0 a 10!");
						notas[i] = scan.nextDouble();
				

					scan.close();
					
				}
			}
			media = soma / 3;
			System.out.printf("A m�dia do aluno " + i + " � %.2f", media);
			System.out.println("");
			if (media < 6) {
				System.out.println("Aluno(a) REPROVADO(A)!");
			} else {
				System.out.println("Aluno(a) APROVADO(A)!");

			}
		}
	}
}
