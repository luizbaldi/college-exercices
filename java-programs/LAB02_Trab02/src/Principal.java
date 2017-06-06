import java.io.IOException;
import java.util.Scanner;

public class Principal {
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
		Menu menu = new Menu();
		int choice = 0;
		
		while (choice != 3) {
			choice = getMenuChoice();
			
			switch (choice) {
				case 1:
					String text = getCryptText();
					menu.cryptText(text);
					break;
				case 2:
					menu.decryptText();
					break;
				case 3:
					System.out.println("\tObrigado por utilizar nosso sistema.");
					break;
				default:
					System.out.println("\tA opcao selecionada nao e valida, digite novamente");
			}
		}
	}
	
	public static int getMenuChoice() {
		int resp;

	    System.out.println("\n\t================== Menu de opcoes ==================\n");
	    System.out.println("\t1. Criptografar texto");
	    System.out.println("\t2. Descriptografar texto");
	    System.out.println("\n\t3. Sair");
	    System.out.print("\n\tSelecione a opcao desejada: ");
	    resp = in.nextInt();

	    return resp;
	}
	
	public static String getCryptText() {
		String text;
		
		System.out.print("\tDigite o texto a ser criptografado: ");
		text = in.next();
		
		return text;
	}
	
}
