#include <stdio.h>
#include <stdlib.h>

int getNumeroRandom(int startNumber, int endNumber) {
	int randomNumber;
	int inicial, final;

	randomNumber = rand() % 100;

	if (randomNumber >= startNumber && randomNumber <= endNumber) {
		return randomNumber;
	} else {
		getNumeroRandom(startNumber, endNumber);
	}
}

void imprimeNumeroRandom() {
	int inicial, final, numeroRandom;

	printf("Digite o valor inicial: ");
	scanf("%d", &inicial);

	printf("Digite o valor final: ");
	scanf("%d", &final);

	numeroRandom = getNumeroRandom(inicial, final);
	printf("\nNumero aleatorio: %d", numeroRandom);
}

int main() {
	imprimeNumeroRandom();
	
	return 0;
}
