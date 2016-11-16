#include <stdio.h>

int main() {
	int vet[5];
	int num, i;

	for (i = 0; i < 5; i++) {
		printf("Digite o numero: ");
		scanf("%d", &num);
		vet[i] = num;
	}

	for (i = 0; i < 5; i++) {
		printf("vector[%d] = %d\n", i, vet[i]);
	}

	return 0;
}