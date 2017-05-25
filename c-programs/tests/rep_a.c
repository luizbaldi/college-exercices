#include <stdio.h>
#include <stdlib.h>

int getRandomNumber(int startNumber, int endNumber) {
	int randomNumber;

	randomNumber = rand() % 100;

	if (randomNumber >= startNumber && randomNumber <= endNumber) {
		return randomNumber;
	} else {
		getRandomNumber(startNumber, endNumber);
	}
}

void imprimeMatriz() {
	int mat[10][10];
	int i, j;

	for (i = 0; i < 10; i++) {
		for (j = 0; j < 10; j++) {
			mat[i][j] = getRandomNumber(25,75);
			printf("vet[%d][%d] = %d\n", i, j, mat[i][j]);
		}
	}
}

int main() {
	imprimeMatriz();

	return 0;
}
