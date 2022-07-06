package treinamento.com;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class stringData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  nome = "Andressa";
		
		LocalDate hoje = LocalDate.now();
		Locale brasil = new Locale ("pt" , "BR");
//		System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));
		String diaSemana =hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
		String saudacao = null;
		LocalDateTime agora = LocalDateTime.now();
		if (agora.getHour() >= 8 && agora.getHour() >= 12) {
			saudacao = "Bom dia!";
		} else if (agora.getHour() >= 12 && agora.getHour() >= 18) {
			saudacao = "Bom Tarde!";
		} else if (agora.getHour() >= 18 && agora.getHour() >= 24) {
			saudacao = "Bom Noite!";
		}
		
		System.out.printf("Ol�, %s. Hoje � %s, %s %n", nome, diaSemana, saudacao.toUpperCase());
		
	}

}
//System.out.println(nome.toUpperCase());
//System.out.println(nome.toLowerCase());
//System.out.println(nome.length());