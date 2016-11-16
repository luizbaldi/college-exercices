#include <stdio.h>

void sortNumbers(int *num1, int *num2) {
	int aux;

	if (*num1 == *num2) {
		printf("0 - Os numeros são iguais\n");
	} else if (*num1 > *num2) {
		printf("1 - O primeiro era maior que o segundo\n");
		aux = *num1;
		*num1 = *num2;
		*num2 = aux;
	} else if (*num1 < *num2) {
		printf("1 - O segundo era maior que o primeiro\n");
	}
}

int main() {
	int num1, num2;

	printf("Digite o valor dos numeros: \n");
	scanf("%d%d", &num1, &num2);

	// printf("Valores antes da ordenação: \n");
	// printf("Numero 1: %d\n", num1);
	// printf("Numero 2: %d\n", num2);

	sortNumbers(&num1, &num2);

	// printf("Valores depois da ordenação: \n");
	// printf("Numero 1: %d\n", num1);
	// printf("Numero 2: %d\n", num2);

	return 0;
}