package aula02;

import java.util.Scanner;

public class Fatorial {

	public static int fat(int n) {
		int resp = 1;
		
		System.out.println("O valor de n: " + n);
		
		if (n > 0) {
			resp = n * fat(n-1);
		}
		
		System.out.println("O valor de resp: " + resp);
		return resp;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Digite o valor do numero: ");
		int numero = in.nextInt();
		int resposta = fat(numero);
		System.out.println("O valor de fat é: " + resposta);
		in.close();
	}

}
