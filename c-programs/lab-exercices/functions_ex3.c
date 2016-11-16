#include <stdio.h>

int isNumberEven(int number) {
	if (number % 2 == 0) {
		return 1;
	} else {
		return 0;
	}
}

int main() {
	int number, isEven;
	number = 1;

	while (number != 0) {
		printf("Digite o numero: ");
		scanf("%d", &number);

		isEven = isNumberEven(number);
		
		if (isEven == 1) {
			printf("O numero é par \n");	
		} else {
			printf("O numero é ímpar \n");
		}
	}

	return 0;
}