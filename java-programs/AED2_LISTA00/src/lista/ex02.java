package lista;
/* 
 * Lista 01 AED 2
 * Aluno: Luiz Paulo C. Baldi
 * 
 * Exercicio 02
 * Enunciado: Escrever um arranjo de reais em ordem inversa.
 * */
public class ex02 {
	static float inverteArray(float[] array, int index) {
		if (index == 0) {
			return array[0];
		} else {
			System.out.println(array[index]);
			return inverteArray(array, index - 1);
		}
	}
	
	public static void main(String[] args) {
		float[] array = new float[]{1,2,3,4,5};
		
		System.out.println(inverteArray(array, array.length - 1));
	}

}
