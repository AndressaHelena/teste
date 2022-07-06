package CodeGirls;

import java.util.Scanner;

public class LoucaNoGerente {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o desconto: ");
        int desconto = input.nextInt();
        System.out.print("Digite o preço ");
        int precoAntigo = input.nextInt();


     int precoNovo = precoAntigo - (precoAntigo * desconto / 100);
     System.out.println(precoNovo);
     input.close();
	}
}
