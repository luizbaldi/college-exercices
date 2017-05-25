package aula02;

import java.util.Scanner;

public class CalcMaiusculas {

	public static String readKeyboard() {
		String input;
		Scanner in = new Scanner(System.in);
		input = in.nextLine();
		in.close();
		return input;
	}
	
	public static int getUppercaseLength(String input) {
		int uppercaseLength = 0;
		for (int i = 0; i < input.length(); i++) {
			if (Character.isUpperCase(input.charAt(i))) {
				uppercaseLength++;
			}
		}
		return uppercaseLength;
	}
	
	public static void main(String[] args) {
		String input;
		
		System.out.print("Digite a frase: ");
		input = readKeyboard();
		System.out.println("A quantidade de caracteres maiúsculos é: " + getUppercaseLength(input));
	}

}
