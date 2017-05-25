package aula02;

import java.util.Scanner;

public class Fibonacci {

	public static String leTeclado() {
		String input;
		Scanner in = new Scanner(System.in);
		input = in.nextLine();
		in.close();
		return input;
	}
	
	public static int fib(int n) {
		//System.out.println("O valor de n:" + n);
		
		if (n == 1 || n == 0) {
			return 1;
		} else {
			return fib(n-1) + fib(n-2);
		}
	}
	
	public static void main(String[] args) {
		System.out.print("Digite o valor do numero: ");
		int numero = Integer.parseInt(leTeclado());
		int resposta = fib(numero);
		System.out.println("O valor de fib é: " + resposta);
	}

}
