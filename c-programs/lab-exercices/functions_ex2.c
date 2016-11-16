#include <stdio.h>

void compareGreaterThanZero() {
    int num;
    
    do {
        printf("Digite o numero:");
        scanf("%d", &num);
        
        if (num < 0) {
            printf("O numero deve ser maior que 0\n");
        }
    } while (num < 0);
}

int main() {
    compareGreaterThanZero();
    
    return 0;
}