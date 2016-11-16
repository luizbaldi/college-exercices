#include <stdio.h>

int main() {
	int vet[10];
	int num, i;

	printf("Digite o numero: ");
	scanf("%d", &num);

	for (i = 0; i < 10; i++) {
		vet[i] = num;
		printf("vector[%d] = %d\n", i, vet[i]);
	}

	return 0;
}