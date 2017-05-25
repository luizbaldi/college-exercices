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

void imprimeMaiorEMenor() {
	int col, lin;
	int i, j;
	int maior = 0, menor = 99, colMaior, linMaior, colMenor, linMenor;

	printf("Digite a quantidade de colunas: ");
	scanf("%d", &col);

	printf("Digite a quantidade de linhas: ");
	scanf("%d", &lin);

	int mat[col][lin];

	for (i = 0; i < col; i++) {
		for (j = 0; j < lin; j++) {
			mat[i][j] = getRandomNumber(25,75);
			printf("\nValores: ");
			printf("vetor[%d][%d] = %d\n", i, j, mat[i][j]);

			if (mat[i][j] > maior) {
				maior = mat[i][j];
				colMaior = i;
				linMaior = j;
			}

			if (mat[i][j] < menor) {
				menor = mat[i][j];
				colMenor = i;
				linMenor = j;
			}
		}
	}

	printf("\nMaior valor: %d - Posicao: vetor[%d][%d]", maior, colMaior, linMaior);
	printf("\nMenor valor: %d - Posicao: vetor[%d][%d]", menor, colMenor, linMenor);
}

int main() {
	imprimeMaiorEMenor();	

	return 0;
}
