#include <stdio.h>
#include <stdlib.h>

int getRandomNumber(int startNumber, int endNumber) {
	int randomNumber;

	randomNumber = rand() % 10;

	if (randomNumber >= startNumber && randomNumber <= endNumber) {
		getRandomNumber(startNumber, endNumber);
	} else {
		return randomNumber;
	}
}

int main() {
	int vet[4][4];
    int row, col;
    
	for(row = 0; col < 4; row++) {
		for(col = 0; col < 4; col++) {
			vet[row][col] = getRandomNumber(15, 50);
		}
	}

	for(row = 0; col < 4; row++) {
		for(col = 0; col < 4; col++) {
			printf("vet[%d][%d]\n", row, col);
		}
	}

	return 0;
}