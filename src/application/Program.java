package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Convidado;
import entities.enums.Alimentacao;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Convidado> conv = new ArrayList<>();

		System.out.println("O que você deseja fazer?");
		System.out.println(
				"1)Adicionar convidado na lista;\n" + "2)Remover convidado da lista;\n" + "3)Listar convidados.");
		int r = sc.nextInt();

		while (r != 9) {

			if (r == 1) {

				System.out.println("Quantos serão os convidados para o evento?");
				int nConv = sc.nextInt();
				sc.nextLine();
				for (int i = 1; i <= nConv; i++) {
					System.out.println("Qual o nome do convidado #" + i + " ?");
					String nome = sc.nextLine();
					System.out.println("Tem restrição alimentar (s/n)?");
					char c = sc.nextLine().charAt(0);
					String aliment;
					if (c == 's') {
						System.out.println("Qual dessas opções?");
						System.out.println("1)Vegetariano; \n" + "2)Vegan; \n" + "3)Intolerante a lactose; \n"
								+ "4)Intolerante a glúten.");
						int intol = sc.nextInt();
						sc.nextLine();
						if (intol == 1) {
							aliment = "VEGETARIANO";
						} else if (intol == 2) {
							aliment = "VEGAN";
						} else if (intol == 3) {
							aliment = "INTOLERANTE_LACTOSE";
						} else {
							aliment = "INTOLERANTE_GLUTEN";
						}
					} else {
						aliment = "NORMAL";
					}
					System.out.println("Vai consumir bebida no evento (s/n)?");
					char bebida = sc.nextLine().charAt(0);
					conv.add(new Convidado(nome, bebida, Alimentacao.valueOf(aliment)));
				}
				System.out.println();
				System.out.println("O que você deseja fazer?");
				System.out.println("1)Adicionar convidado na lista;\n" + "2)Remover convidado da lista;\n"
						+ "3)Listar convidados.");
				r = sc.nextInt();
			} else if (r == 2) {

				System.out.println("Qual convidado você quer remover?");
				sc.nextLine();
				String convRemove = sc.nextLine();
				conv.removeIf(s -> s.getNome().equals(convRemove));
				
				System.out.println();
				System.out.println("O que você deseja fazer?");
				System.out.println("1)Adicionar convidado na lista;\n" + "2)Remover convidado da lista;\n"
						+ "3)Listar convidados.");
				r = sc.nextInt();

			}

			else {
				for (Convidado o : conv) {
					StringBuilder sb = new StringBuilder();
					sb.append(o.getNome() + ". Vai beber? (" + o.getBebida() + "). ");
					if (o.getAliment().ordinal() != 0) {
						sb.append(o.getAliment());
					}
					System.out.println(sb);
				}
				System.out.println();
				System.out.println("O que você deseja fazer?");
				System.out.println("1)Adicionar convidado na lista;\n" + "2)Remover convidado da lista;\n"
						+ "3)Listar convidados.");
				r = sc.nextInt();
			}
		}
		sc.close();

	}

}
