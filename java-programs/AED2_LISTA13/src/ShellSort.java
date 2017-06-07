
public class ShellSort {

	public static void sort(int[] array) {
		int i , j , h = 1, value;
		
		do {
			h = 3 * h + 1;
		} while (h < array.length);

		do {
			h = h / 3;
			for (i = h; i < array.length; i++) {
				value = array[i];
				j = i - h;
				while (j >= 0 && value < array[j]) {
					array[j+h] = array[j];
					j = j - h;
				}
				array[j+h] = value;
			}
		} while (h>1);
	}
}