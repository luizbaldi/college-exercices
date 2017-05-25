import java.util.Scanner;

public class Principal {
	static Scanner in = new Scanner(System.in);
	
	public static int carregaMenu() {
		int resp;

	    System.out.println("\n\t================== Menu de opcoes ==================\n");
	    System.out.println("\t1. Inserir um item");
	    System.out.println("\t2. Remover um item");
	    System.out.println("\t3. Pesquisar um item a partir de seu valor");
	    System.out.println("\t4. Pesquisar um item a partir de sua posição");
	    System.out.println("\t5. Escrever a lista");
	    System.out.println("\n\t0. Sair");
	    System.out.print("\n\tSelecione a opcao desejada: ");
	    resp = in.nextInt();

	    return resp;
	}
	
	public static void insereItem(ListaLinear lista) {
		System.out.print("\n\tDigite o numero do item: ");
		int item = in.nextInt();
		
		System.out.print("\tDigite a posição: ");
		int posicao = in.nextInt();
		
		lista.insere(item, posicao);
	}
	
	public static void removeItem(ListaLinear lista) {
		System.out.print("\n\tDigite a posição: ");
		int posicao = in.nextInt();
		
		lista.remove(posicao);
	}
	
	public static void pesquisaPorValor(ListaLinear lista) {
		System.out.print("\n\tDigite o valor a ser procurado: ");
		Integer item = in.nextInt();
		
		lista.pesquisa(item);
	}
	
	public static void pesquisaPorPosicao(ListaLinear lista) {
		System.out.println("\n\tDigite a posição: ");
		int posicao = in.nextInt();
		
		lista.pesquisa(posicao);
	}
	
	public static void escreveLista(ListaLinear lista) {
		lista.escreve();
	}
	
	public static void main(String[] args) {
		int resp = -1;
		ListaLinear lista = new ListaLinear(5);
		
		while(resp != 0) {
			resp = carregaMenu();

			switch(resp) {
				case 0:
					System.out.println("\n\tObrigado por utilizar nosso sistema.");
					break;
	            case 1:
	                insereItem(lista);
	                break;
	            case 2:
	                removeItem(lista);
	                break;
	            case 3:
	                pesquisaPorValor(lista);
	                break;
	            case 4:
	                pesquisaPorPosicao(lista);
	                break;
	            case 5:
	                escreveLista(lista);
	                break;
	            default:
	                System.out.println("A opcao selecionada nao e valida, digite novamente");
	        }
		}
	}

}
