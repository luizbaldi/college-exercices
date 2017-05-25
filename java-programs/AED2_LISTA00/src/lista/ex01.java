package lista;
/* 
 * Lista 01 AED 2
 * Aluno: Luiz Paulo C. Baldi
 * 
 * Exercicio 01
 * Enunciado: Calcular o fatorial de um número natural*: 0..N
 * */
public class ex01 {
	static int fatorial(int n) {
		if (n <= 1) {
			return 1;
		} else {
			return fatorial(n - 1) * n;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(fatorial(4));
	}

}
