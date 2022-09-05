package crud;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Modelo.Meios;

public class MeiosCrud {

	public static void main(String[] args) {
		
		//Cria instancia do DOA para utulizar os métodos
		MeiosDAO meiosDAO = new MeiosDAO ();
		
		Scanner input = new Scanner(System.in);
		
		//Setar as variáveis de navegação
		int opcao = 0;
		int posicao = 0;
		
		int id = 0;
		String nome = "";
		
		//Instancia da lista que vai armazenar
		List<Meios> meios = new ArrayList<Meios>();
		
		//Menu
		do {
			System.out.println("--- CRUD MEIOS ---");
			System.out.println("1 - Cadastro de meios");
			System.out.println("2 - Consulta de meios");
			System.out.println("3 - Delete de meios");
			System.out.println("4 - Atualizar de meios");
			System.out.println("0 - Sair");
			
			opcao = input.nextInt();
			
			
			//NAVEGACAO DO CRUD
			switch (opcao) {
			case 1:
				//CREATE
				System.out.println(""**Cadastrar Meio**");"
						System.out.println("Digite o nome:");
				nome = input.nextLine();
				nome = input.nextLine();
				
				Meios meio = new Meios();
				
				meios.setNome_meio(nome);
				
				meioDAO.save(meio);
				
				System.out.println("\n**Cadastrado**\n");
				break;
				
				default:
					System.out.println(opcao != 0 ? "\n Opção é invalida, tente novamente.\n");
					break;
					
			}		while (opcao != 0);
			input.close();
			System.out.println("*Finalizado*");
			
		}
		

	}

}
