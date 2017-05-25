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
	int col, lin;
	int i, j;

	printf("Digite a quantidade de colunas: ");
	scanf("%d", &col);

	printf("Digite a quantidade de linhas: ");
	scanf("%d", &lin);

	int mat[col][lin];

	for (i = 0; i < col; i++) {
		for (j = 0; j < lin; j++) {
			mat[i][j] = getRandomNumber(25,75);
			printf("vet[%d][%d] = %d\n", i, j, mat[i][j]);
		}
	}
}

int main() {
	imprimeMatriz();
	
	return 0;
}
