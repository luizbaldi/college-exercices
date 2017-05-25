#include <stdio.h>
#include <stdlib.h>

int carregaMenu() {
    int resp;

    printf("\n\nMenu de opcoes\n");
    printf("\n1. Preencher matriz");
    printf("\n2. Receber numero aleatorio");
    printf("\n3. Imprimir nova matriz por linhas e colunas");
    printf("\n4. Imprimir maior e menor elemento da matriz");
    printf("\n5. Imprimir soma da diagonal");
    printf("\n6. Sair");
    printf("\n\nSelecione a opcao desejada: ");
    scanf("%d", &resp);

    return resp;
}

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

void imprimeMatriz() {
	int mat[10][10];
	int i, j;

	for (i = 0; i < 10; i++) {
		for (j = 0; j < 10; j++) {
			mat[i][j] = getNumeroRandom(25,75);
			printf("vet[%d][%d] = %d\n", i, j, mat[i][j]);
		}
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

void imprimeMatrizLimitada() {
	int col, lin;
	int i, j;

	printf("Digite a quantidade de colunas: ");
	scanf("%d", &col);

	printf("Digite a quantidade de linhas: ");
	scanf("%d", &lin);

	int mat[col][lin];

	for (i = 0; i < col; i++) {
		for (j = 0; j < lin; j++) {
			mat[i][j] = getNumeroRandom(25,75);
			printf("vet[%d][%d] = %d\n", i, j, mat[i][j]);
		}
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
			mat[i][j] = getNumeroRandom(25,75);
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

void somaDiagonal() {
	int col, lin;
	int i, j, soma = 0;

	printf("Digite a quantidade de colunas: ");
	scanf("%d", &col);

	printf("Digite a quantidade de linhas: ");
	scanf("%d", &lin);

	int mat[col][lin];

	for (i = 0; i < col; i++) {
		for (j = 0; j < lin; j++) {
			mat[i][j] = getNumeroRandom(25,75);
			printf("\nValores: ");
			printf("vetor[%d][%d] = %d\n", i, j, mat[i][j]);
			if (i == j) {
				soma += mat[i][j];
			} 
		}
	}

	printf("\nSoma da diagonal: %d", soma);
}

int main() {
	int resp = 0;

	while(resp != 6) {
        resp = carregaMenu();

        switch(resp) {
            case 1:
                imprimeMatriz();
                break;
            case 2:
                imprimeNumeroRandom();
                break;
            case 3:
                imprimeMatrizLimitada();
                break;
            case 4:
                imprimeMaiorEMenor();
                break;
            case 5:
                somaDiagonal();
                break;
            case 6:
                printf("\n\tObrigado por utilizar nosso sistema.\n");
                break;
            default:
                printf("\n\tA opcao selecionada nao e valida, digite novamente");
        }
    }
}