#include <stdio.h>

void getSumAndMult(int num1, int num2) {
	int soma, mult;

	soma = num1 + num2;
	mult = num1 * num2;

	printf("Soma dos numeros: %d\n", soma);
	printf("Multiplicacao dos numeros: %d\n", mult);
}

int main() {
	int num1, num2;

	printf("Digite dois numeros: ");
	scanf("%d%d", &num1, &num2);

	getSumAndMult(num1, num2);
	return 0;
}