package lista;
/* 
 * Lista 01 AED 2
 * Aluno: Luiz Paulo C. Baldi
 * 
 * Exercicio 04
 * Enunciado: S�rie de Fibonacci: 0, 1, 1, 2, 3, 5, 8, 13, 21
 * Inicia com 0 e 1 e tem a seguinte propriedade: um n�mero Fibonacci subsequente � 
 * igual � soma dos dois anteriores.
 * Calcular o k-�simo n�mero Finonacci.
 * */
public class ex04 {
	
	static int fibonacci(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
	
	public static void main(String[] args) {
		System.out.println(fibonacci(6));
	}

}
