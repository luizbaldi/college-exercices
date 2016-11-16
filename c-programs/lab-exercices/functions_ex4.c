#include <stdio.h>

int checkIsDivisible(int num, int den) {
	if (num % den == 0) {
		printf("Pares divísiveis: %d/%d\n", num, den);
		return 1;
	} else {
		return 0;
	}
}

int main() {
	int num = 1, den = 1, isDivisible;
	
	while (num != 0 && den != 0)  {
		printf("Digite o numerador: "),
		scanf("%d", &num);

		printf("Digite o denominador: "),
		scanf("%d", &den);

		isDivisible = checkIsDivisible(num, den);

		if(isDivisible == 1) {
			printf("Os numeros são divisíveis\n");
		} else {
			printf("Os numeros não são divisíveis\n");
		}
	}

	return 0;
}