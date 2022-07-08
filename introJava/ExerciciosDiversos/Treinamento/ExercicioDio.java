
import java.util.Scanner;

public class ExercicioDio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double A, B, media;
		System.out.println("Digite a primeira nota: ");
		A = sc.nextDouble();
		System.out.println("Digite a segunda nota: ");
		B = sc.nextDouble();

		if (A > 10 || A < 0 || B > 10 || B < 0) {
			System.err.println("Nota Inválida, digite uma nota de 0 a 10!");

		} else {
			media = (A * 3.5 + B * 7.5) / 11;

			System.out.printf("MEDIA = %.2f", media);
			System.out.println();
		}
		sc.close();
	}
}