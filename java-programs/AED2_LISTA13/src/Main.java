import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int arraySize = loadArraySize();
		OrderList list = new OrderList(arraySize);

		int op = -1;
		while (op != 0) {
			op = loadMenu();

			switch (op) {
				case 0:
					System.out.println("\nObrigado por utilizar o sistema.");
					break;
				case 1:
					list.fillWithRandValues();
					break;
				case 2:
					list.printArray();
					break;
				case 3:
					list.selectionSort();
					break;
				case 4:
					list.insertionSort();
					break;
				case 6:
					list.bubbleSort();
					break;
				case 8:
					list.quickSort();
					break;
				case 10:
					list.shellSort();
					break;
				case 12:
					list.heapSort();
					break;
				default:
					System.out.println("\nOp��o inv�lida. Tente novamente.");
			}
		}
	}

	public static int loadArraySize() {
		System.out.print("Digite o tamanho do array: ");
		return in.nextInt();
	}

	public static int loadMenu() {
		int resp;

	    System.out.println("\n================== Menu de opcoes ==================\n");
	    System.out.println("1. Preencher arrajo com valores aleat�rios");
	    System.out.println("2. Escrever arranjo");
	    System.out.println("3. Ordernar pelo algoritmo de sele��o");
	    System.out.println("4. Ordernar pelo algoritmo de inser��o");
	    System.out.println("6. Ordernar pelo algoritmo BubbleSort");
	    System.out.println("8. Ordernar pelo algoritmo QuickSort");
	    System.out.println("10. Ordernar pelo algoritmo ShellSort");
	    System.out.println("12. Ordernar pelo algoritmo HeapSort");
	    System.out.println("\n0. Sair");
	    System.out.print("\nSelecione a opcao desejada: ");
	    resp = in.nextInt();

	    return resp;
	}
}
