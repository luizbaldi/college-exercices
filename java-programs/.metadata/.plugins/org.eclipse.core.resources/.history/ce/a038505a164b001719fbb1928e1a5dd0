import java.util.Scanner;

public class Principal {
	static Scanner in = new Scanner(System.in);

	public static int carregaMenu() {
		int resp;

	    System.out.println("\n\t================== Menu de opcoes ==================\n");
	    System.out.println("\t1. Cadastrar a turma");
	    System.out.println("\t2. Listar nome e idade dos alunos menores de idade");
	    System.out.println("\t3. Imprimir idade média da turma");
	    System.out.println("\n\t4. Sair");
	    System.out.println("\n\tSelecione a opcao desejada: ");
	    resp = in.nextInt();

	    return resp;
	}

	public static void cadastraTurma(Aluno[] alunos) {
		String nome;
		int idade;

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o nome do aluno: ");
			nome = in.next();

			System.out.println("Digite a idade do aluno: ");
			idade = in.nextInt();

			alunos[i] = new Aluno(nome, idade);
		}
	}

	public static void listaMenoresIdade(Aluno[] alunos) {
		for (int i = 0; i < 10; i++) {
	        if(alunos[i].getIdade() < 18) {
	            System.out.println("Aluno: " + alunos[i].getNome());
	            System.out.println("Idade: " + alunos[i].getIdade());
	        }
	    }
	}

	public static void imprimeIdadeMedia(Aluno[] alunos) {
	    float media = 0;
	    int i;

	    for (i = 0; i < 10; i++) {
	        media += alunos[i].getIdade();
	    }
	    media = (media / 10);
	    System.out.println("Media das idades: " + media);
	}
	
	public static void main(String[] args) {
		int resp = 0;
		Aluno[] alunos = new Aluno[10];
		
		while(resp != 4) {
			resp = carregaMenu();

			switch(resp) {
	            case 1:
	                cadastraTurma(alunos);
	                break;
	            case 2:
	                listaMenoresIdade(alunos);
	                break;
	            case 3:
	                imprimeIdadeMedia(alunos);
	                break;
	            case 4:
	                System.out.println("Obrigado por utilizar nosso sistema.");
	                break;
	            default:
	                System.out.println("A opcao selecionada nao e valida, digite novamente");
	        }
		}
	}
}
