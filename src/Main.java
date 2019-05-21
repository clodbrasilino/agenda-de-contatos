import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);	
		String[] contatos = new String[5];
		int qtdeContatos = 0;
		while(true) {
			System.out.print("--- AGENDA ELETRONICA ---\n"
					+ " 1 - Adicionar contato\n"
					+ " 2 - Listar contatos da agenda\n"
					+ " 3 - Sair\n"
					+ " Digite sua opcao: ");
			String opcao = entrada.nextLine();
			switch(opcao) {
				case "1":
					// ler o contato
					System.out.print("\nNome do contato: ");
					String novoContato = entrada.nextLine();
					// adicionar ao vetor
					if(qtdeContatos < contatos.length)
						contatos[qtdeContatos++] = novoContato;
					else
						System.out.println("Agenda cheia!");
					
					break;
				case "2":
					// listar os contatos do vetor
					System.out.print("\n -- CONTATOS -- \n\n");
					for(int contador = 0; contador < qtdeContatos; ++contador) {
						System.out.printf(" %d - %s%n",contador+1, contatos[contador]);
					}
					break;
				case "3":
					System.exit(0);
				default:
					System.out.println("Opção inválida!\n");
			}
		}
	}

}
