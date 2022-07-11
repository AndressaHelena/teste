package Treinamento;

import java.util.Scanner;

public class Jokenpo {
	public static void main(String[] args) {
		int jogador, pc;
		Scanner teclado = new Scanner(System.in);
		System.out.println("-----JoKenPô-----");
		System.out.println("");
		System.out.println("1- Pedra");
		System.out.println("2- Papel");
		System.out.println("3- Tesoura");
		System.out.print("Digite a opção desejada: ");
		// Logica do jogador
		jogador = teclado.nextInt();
		switch (jogador) {
		case 1:
			System.out.println("Jogador escolheu PEDRA");
			break;
		case 2:
			System.out.println("Jogador escolheu PAPEL");
			break;
		case 3:
			System.out.println("Jogador escolheu TESOURA");
			break;
		default:
			System.out.println("Op��o INV�LIDA");
		}
		// Logica do computador
		pc = (int) (Math.random() * 3 + 1);
		teclado.close();
		switch (pc) {
		case 1:
			System.out.println("Computador escolheu PEDRA");
			break;
		case 2:
			System.out.println("Computador escolheu PAPEL");
			break;
		case 3:
			System.out.println("Computador escolheu TESOURA");
			break;
		}
		// Logica para determinar o vencedor
		System.out.println("");
		if (jogador == pc) {
			System.out.println("EMPATE");
		} else {
			if ((jogador == 1 && pc == 3) || (jogador == 2 && pc == 1) || (jogador == 3 && pc == 2)) {
				System.out.println("JOGADOR VENCEU!");
			} else {
				System.out.println("COMPUTADOR VENCEU!");
			}
		}
	}
}
