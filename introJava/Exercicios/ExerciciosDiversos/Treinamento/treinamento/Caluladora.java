import java.util.Scanner;
public class Caluladora {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double resultado, numero1, numero2;
		int cont = 1;

		System.out.println("### CALCULO ###");
		System.out.print("[1] Somar ");	
		System.out.print("\n[2] Subtrair");
		System.out.print("\n[3] Multiplicar ");
		System.out.print("\n[4] Dividir ");

		System.out.println();
		System.out.print("\nDigite a opção: ");
		int op = scanner.nextInt();

		do {
			if (op <= 4 && op >= 1) {

				switch (op) {
				case 1:
					System.out.println("\n### SOMA ###");
					System.out.print("Digite um número: ");
					numero1 = scanner.nextDouble();
					System.out.print("Digite outro número: ");
					numero2 = scanner.nextDouble();
					resultado = numero1 + numero2;
					System.out.println("Resultado: " + resultado);
					break;

				case 2:
					System.out.println("\n### SUBTRAIR ###");
					System.out.print("Digite um número: ");
					numero1 = scanner.nextDouble();
					System.out.print("Digite outro número: ");
					numero2 = scanner.nextDouble();
					resultado = (int) (numero1 - numero2);
					System.out.println("Resultado: " + resultado);
					break;

				case 3:
					System.out.println("\n### MULTIPLICAR ###");
					System.out.print("Digite um número: ");
					numero1 = scanner.nextDouble();
					System.out.print("Digite outro número: ");
					numero2 = scanner.nextDouble();
					resultado = (int) (numero1 * numero2);
					System.out.println("Resultado: " + resultado);
					break;

				case 4:
					System.out.println("\n### DIVIDIR ###");
					System.out.print("Digite um número: ");
					numero1 = scanner.nextDouble();
					System.out.print("Digite outro número: ");
					numero2 = scanner.nextDouble();
					resultado = numero1 / numero2;
					System.out.println("Resultado: " + resultado);
					break;

				}
			} else {
				System.err.println("Opção Inválida!");
			}
			System.out.println();
			System.out.print("Quer fazer mais um cálculo? (y/n)");
			char resp = scanner.next().charAt(0);

			if (resp == 'y') {
				System.out.println("\n### CALCULO ###");
				System.out.print("[1] Somar ");
				System.out.print("\n[2] Subtrair");
				System.out.print("\n[3] Multiplicar ");
				System.out.print("\n[4] Dividir ");

				System.out.println();
				System.out.print("\nDigite a opção: ");
				op = scanner.nextInt();

				cont++;
			} else {
				cont = 0;
			}

		} while (cont != 0);
		System.out.println("\nFIM DE EXECUÇÃO.");
		scanner.close();

	}

}
