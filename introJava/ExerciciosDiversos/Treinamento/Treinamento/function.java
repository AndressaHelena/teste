package Treinamento;

public class function {

	public static void main(String[] args) {
		String nomeOriginal = "Andressa";
		pergunta(nomeOriginal);

	}

	// fun��o que no java chama METODO
	public static void saudacao(String nomeParametro) {
		System.out.println("Hello, " + nomeParametro + "!");
	}

	public static void pergunta(String nomeParametro) {
		System.out.println("Como vai " + nomeParametro + "?" );
	}

}
