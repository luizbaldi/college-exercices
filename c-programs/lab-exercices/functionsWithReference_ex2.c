#include <stdio.h>

void swapValues(int *num1, int *num2) {
	int aux;
	aux = *num1;
	*num1 = *num2;
	*num2 = aux;
}

int main() {
	int num1, num2;

	printf("Digite dois numeros: ");
	scanf("%d%d", &num1, &num2);

	printf("Valores antes da troca: \n");
	printf("Numero 1: %d\n", num1);
	printf("Numero 2: %d\n", num2);

	swapValues(&num1, &num2);

	printf("Valores depois da troca: \n");
	printf("Numero 1: %d\n", num1);
	printf("Numero 2: %d\n", num2);
}