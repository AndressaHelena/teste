package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {// abre main

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		List<ListEmployee> list = new ArrayList<>();

		System.out.println("Quantos funcionários serão cadastrados?");
		int numerosDeFuncionarios = scan.nextInt();

		for (int i = 0; i < numerosDeFuncionarios; i++) {
			System.out.println(" ");
			System.out.println("Funcionário " + (i + 1) + ":");
			System.out.print("Id: ");
			Integer id = scan.nextInt();
			System.out.print("Nome: ");
			scan.nextLine();
			String name = scan.nextLine();
			System.out.print("Salário: ");
			double salary = scan.nextDouble();

			ListEmployee funcionario = new ListEmployee(id, name, salary);

			list.add(funcionario);
		}
		System.out.println("");
		System.out.println("Insira o ID do funcionário que terá aumento salarial: ");
		int idsalary = scan.nextInt();// ler id

		Integer pos = positionId(list, idsalary);// procura id
		if (pos == null)// id não encontrado
		{
			System.err.println("Esse id não existe!");
		} else {// id encontrado
			System.out.println("Entre com a porcentagem: ");
			double percent = scan.nextDouble();
			// pergunta a porcentagem
			list.get(pos).IncreaseSalary(percent);
			// acessa lista - posição func - incrementa salario - percentual digitado
		}

		System.out.println("");
		System.out.println("ID Nome Salário ");

		for (ListEmployee funcionario : list) {
			System.out.println(funcionario);
		} // chaves opicional quando tem uma linha só
		scan.close();
	}// fecha main

	public static Integer positionId(List<ListEmployee> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

}
