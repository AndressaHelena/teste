package Treinamento;

public class vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros = { 3, 10, 7, 10, 20 };
		int maior = numeros[0];
		int menor = numeros[0];
		int media = 0;

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > maior) {
				maior = numeros[i];
			}
			if (numeros[i] < menor) {
				menor = numeros[i];
			}
			media += numeros[i];
		}
		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);
		System.out.println("Media: " + media / numeros.length);
	}
}

//	String[] nomes = {"Bolinha", "Sapeca", "Princesa"};
//	for(int i = 0; i < nomes.length; i++ ) {
//		System.out.println(nomes[i]);
//	}

//		String[] nomes = new String[5];
//		
//	nomes[0] = "Andressa";
//	nomes[1] =  "Isabella";
//	nomes[2] =  "Henrique";
//	nomes[3] =  "Sapeca";
//	nomes[4] =  "Princesa";
//	
//	for(int i = 0; i < nomes.length; i++ ) {
//		System.out.println(nomes[i]);
//	}
