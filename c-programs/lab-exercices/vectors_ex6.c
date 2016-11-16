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

int main() {
	int vet[4][4];
    int row, col;
    
	for(row = 0; row < 4; row++) {
		for(col = 0; col < 4; col++) {
			vet[row][col] = getRandomNumber(15, 50);
		}
	}

	for(row = 0; row < 4; row++) {
		for(col = 0; col < 4; col++) {
			printf("vet[%d][%d] = %d\n", row, col, vet[row][col]);
		}
	}

	return 0;
}