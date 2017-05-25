package lista;
/* 
 * Lista 01 AED 2
 * Aluno: Luiz Paulo C. Baldi
 * 
 * Exercicio 03
 * Enunciado: Escrever um arranjo de reais em ordem inversa.
 * */
public class ex03 {
	public static float calcMaiorValor(float[] array, int index, float maiorValor) {
		if (index == array.length) {
			return maiorValor;
		} else {
			if (array[index] > maiorValor) {
				return calcMaiorValor(array, index + 1, array[index]); 
			} else {
				return calcMaiorValor(array, index + 1, maiorValor);
			}
		}
	}
	
	public static void main(String[] args) {
		float[] array = new float[]{7,6,3,8,5,33,5,6};
		
		System.out.println(calcMaiorValor(array, 0, 0));
	}

}
