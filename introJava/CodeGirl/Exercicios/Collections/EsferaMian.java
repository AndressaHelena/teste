package CodeGirls;

import java.util.Scanner;

public class EsferaMian {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("n�mero: ");

		double pi = 3.14159;
		double R = sc.nextDouble();
		double volume = (((4 / 3.0) * pi) * Math.pow(R, 3.0));
		System.out.printf("VOLUME = %.3f%n", volume);

		sc.close();
	}

}